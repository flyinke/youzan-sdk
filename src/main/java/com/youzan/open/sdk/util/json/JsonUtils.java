package com.youzan.open.sdk.util.json;

import com.youzan.open.sdk.exception.KDTException;
import com.youzan.open.sdk.model.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;

public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 时间兼容
        OBJECT_MAPPER.setDateFormat(new MySimpleDateFormat("yyyy-MM-dd HH:mm:ss")).
                setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);

        SimpleModule simpleModule = new SimpleModule("BooleanConvertModule");
        // boolean转换增强
        simpleModule.addDeserializer(Boolean.class, new MyNumberDeserializers.BooleanDeserializer(Boolean.class, Boolean.FALSE));
        OBJECT_MAPPER.registerModule(simpleModule);

        // 多余的字段不失败
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        OBJECT_MAPPER.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);

        OBJECT_MAPPER.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);

        OBJECT_MAPPER.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);

    }

    private JsonUtils() {}

    public static String toJson(Object object) {
        try {
            return OBJECT_MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new KDTException(e);
        }
    }

    public static <T> T toBean(String json, Class clazz) {
        try {
            return (T)OBJECT_MAPPER.readValue(json, clazz);
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public static <T> T toBean(String json, TypeReference<T> ref) {
        try {
            return OBJECT_MAPPER.readValue(json, ref);
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public static <T> T toClassBean(String json, Class clazz) {
        try {
            JavaType type = OBJECT_MAPPER.getTypeFactory().constructParametricType(Response.class, clazz);
            return (T)OBJECT_MAPPER.readValue(json, type);
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

}
