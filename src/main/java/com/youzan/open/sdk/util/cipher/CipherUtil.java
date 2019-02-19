package com.youzan.open.sdk.util.cipher;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.*;

import static org.apache.commons.codec.binary.Base64.decodeBase64;
import static org.apache.commons.codec.binary.Base64.encodeBase64String;


public class CipherUtil {

    private static final String DEFAULT_KEY_ALGORITHM = "RSA";
    private static final String DEFAULT_SIGNATURE_ALGORITHM = "SHA1WithRSA";
    private static final int KEY_SIZE = 1024;/**/

    public static final String PUBLIC_KEY = "publicKey";
    public static final String PRIVATE_KEY = "privateKey";

    public static Map<String, String> initKey(String algorithmType) throws Exception {
        KeyPairGenerator keygen;
        if (StringUtils.isNotBlank(algorithmType)) {
            keygen = KeyPairGenerator.getInstance(algorithmType);
        } else {
            keygen = KeyPairGenerator.getInstance(DEFAULT_KEY_ALGORITHM);
        }
        SecureRandom secrand = new SecureRandom();
        keygen.initialize(KEY_SIZE, secrand);

        KeyPair keys = keygen.genKeyPair();
        String pub_key = encodeBase64String(keys.getPublic().getEncoded());
        String pri_key = encodeBase64String(keys.getPrivate().getEncoded());
        Map<String, String> keyMap = Maps.newHashMapWithExpectedSize(2);
        keyMap.put(PUBLIC_KEY, pub_key);
        keyMap.put(PRIVATE_KEY, pri_key);

        return keyMap;
    }

    public static String sign(byte[] data, String pri_key) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance(DEFAULT_KEY_ALGORITHM);
        Signature signature = Signature.getInstance(DEFAULT_SIGNATURE_ALGORITHM);

        return sign(data, pri_key, keyFactory, signature);
    }

    public static String sign(byte[] data, String pri_key, KeyFactory keyFactory, Signature signature) throws Exception {
        if (keyFactory == null) {
            keyFactory = KeyFactory.getInstance(DEFAULT_KEY_ALGORITHM);
        }
        if (signature == null) {
            signature = Signature.getInstance(DEFAULT_SIGNATURE_ALGORITHM);
        }
        byte[] pri_key_bytes = decodeBase64(pri_key);
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(pri_key_bytes);
        PrivateKey priKey = keyFactory.generatePrivate(pkcs8KeySpec);
        signature.initSign(priKey);
        signature.update(data);

        return encodeBase64String(signature.sign());
    }

    public static boolean verify(byte[] data, byte[] sign, String pub_key) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance(DEFAULT_KEY_ALGORITHM);
        Signature signature = Signature.getInstance(DEFAULT_SIGNATURE_ALGORITHM);

        return verify(data, sign, pub_key, keyFactory, signature);
    }

    public static boolean verify(byte[] data, byte[] sign, String pub_key, KeyFactory keyFactory, Signature signature) throws Exception {
        if (keyFactory == null) {
            keyFactory = KeyFactory.getInstance(DEFAULT_KEY_ALGORITHM);
        }
        if (signature == null) {
            signature = Signature.getInstance(DEFAULT_SIGNATURE_ALGORITHM);
        }
        sign = decodeBase64(sign);
        byte[] pub_key_bytes = decodeBase64(pub_key);
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(pub_key_bytes);
        PublicKey pubKey = keyFactory.generatePublic(x509KeySpec);
        signature.initVerify(pubKey);
        signature.update(data);
        return signature.verify(sign);
    }

    private static byte[] encryptByPubKey(byte[] data, byte[] pub_key) throws Exception {
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(pub_key);
        KeyFactory keyFactory = KeyFactory.getInstance(DEFAULT_KEY_ALGORITHM);
        PublicKey publicKey = keyFactory.generatePublic(x509KeySpec);
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(data);
    }

    public static String encryptByPubKey(String data, String pub_key) throws Exception {
        byte[] pub_key_bytes = decodeBase64(pub_key);
        byte[] enSign = encryptByPubKey(data.getBytes(), pub_key_bytes);
        return encodeBase64String(enSign);
    }

    private static byte[] encryptByPriKey(byte[] data, byte[] pri_key) throws Exception {
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(pri_key);
        KeyFactory keyFactory = KeyFactory.getInstance(DEFAULT_KEY_ALGORITHM);
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        return cipher.doFinal(data);
    }

    public static String encryptByPriKey(String data, String pri_key) throws Exception {
        byte[] pri_key_bytes = decodeBase64(pri_key);
        byte[] enSign = encryptByPriKey(data.getBytes(), pri_key_bytes);
        return encodeBase64String(enSign);
    }

    private static byte[] decryptByPubKey(byte[] data, byte[] pub_key) throws Exception {
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(pub_key);
        KeyFactory keyFactory = KeyFactory.getInstance(DEFAULT_KEY_ALGORITHM);
        PublicKey publicKey = keyFactory.generatePublic(x509KeySpec);
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, publicKey);
        return cipher.doFinal(data);
    }


    public static String decryptByPubKey(String data, String pub_key) throws Exception {
        byte[] pub_key_bytes = decodeBase64(pub_key);
        byte[] design = decryptByPubKey(decodeBase64(data), pub_key_bytes);
        return new String(design);
    }

    private static byte[] decryptByPriKey(byte[] data, byte[] pri_key) throws Exception {
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(pri_key);
        KeyFactory keyFactory = KeyFactory.getInstance(DEFAULT_KEY_ALGORITHM);
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(data);
    }

    public static String decryptByPriKey(String data, String pri_key) throws Exception {
        byte[] pri_key_bytes = decodeBase64(pri_key);
        byte[] design = decryptByPriKey(decodeBase64(data), pri_key_bytes);
        return new String(design);
    }

    public static String encryptByBase64(String originData) {
        String data = encodeBase64String(originData.getBytes());
        return data;
    }


    public static String decryptByBase64(String cipher) {
        byte[] data = decodeBase64(cipher);
        return new String(data);
    }


    public static Map<String, String> str2Params(String str) {
        Map<String, String> params = Maps.newHashMap();
        String[] identifyParams = str.split("&");
        for (String ideantifyParam : identifyParams) {
            int index = ideantifyParam.indexOf("=");
            Preconditions
                    .checkArgument(index > 0 && index < ideantifyParam.length() - 1, "identifyStr correct format：'a1=b1&a2=b2'");
            String key = ideantifyParam.substring(0, index);
            String value = ideantifyParam.substring(index + 1);
            params.put(key, value);
        }
        return params;
    }


    public static String params2str(Map<String, String> params) {
        if (params == null || params.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<Map.Entry<String, String>> entries = new ArrayList(params.entrySet());
        //entries.sort(Map.Entry.comparingByKey());
        Collections.sort(entries, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return o1.getKey().toString().compareTo(o2.getKey().toString());
            }
        });
        for (Map.Entry<String, String> entry : entries) {
            sb.append("&").append(entry.getKey()).append("=").append(entry.getValue());
        }
        String s = sb.toString();
        return s.substring(1);
    }

    private static String mergeParams(String[] params) {
        return StringUtils.join(",", params);
    }
}