package com.youzan.open.sdk.api;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.model.ByteWrapper;

import java.util.Map;

public class APIFactory {

    public static String SERVICE_HOST = "https://open.youzan.com";
    private static Map<String, String> COMMON_HEADERS = Maps.newHashMap();

    private APIFactory() {}

    public static void setServiceHost(String serviceHost) {
        SERVICE_HOST = serviceHost;
    }

    public static void setCommonHeaders(Map<String, String> headers) {
        COMMON_HEADERS = headers;
    }

    public static API create(final String apiName, final String apiVersion, final String httpMethod, Map<String, Object> params, Multimap<String, ByteWrapper> fileParams) {
        return new DefaultAPI(apiName, apiVersion, httpMethod, params, fileParams);
    }

    private static class DefaultAPI extends AbstractAPI {
        private String apiName;
        private String apiVersion;
        private String httpMethod;
        private Map<String, Object> params;
        private Multimap<String, ByteWrapper> fileParams;

        public DefaultAPI(String apiName, String apiVersion, String httpMethod, Map<String, Object> params, Multimap<String, ByteWrapper> fileParams) {
            this.apiName = apiName;
            this.apiVersion = apiVersion;
            this.httpMethod = httpMethod;
            this.params = params;
            this.fileParams = fileParams;
        }

        @Override
        public String getHttpUrl() {
            return SERVICE_HOST + "/api";
        }

        @Override
        public String getHttpMethod() {
            return this.httpMethod;
        }

        @Override
        public String getVersion() {
            return this.apiVersion;
        }

        @Override
        public String getName() {
            return this.apiName;
        }

        @Override
        public APIParams getAPIParams() {
            if (fileParams != null) {
                return new DefaultParamsWithFile(params, fileParams);
            }
            return new DefaultParams(params);
        }

        @Override
        public Map<String, String> getHeaders() {
            return COMMON_HEADERS;
        }

        @Override
        public void setAPIParams(APIParams apiParams) {

        }

        @Override
        public Class getResultModelClass() {
            return null;
        }

        @Override
        public Class getParamModelClass() {
            return null;
        }

        @Override
        public boolean hasFiles() {
            return fileParams != null;
        }
    }

    private static class DefaultParams implements APIParams {
        private Map<String, Object> params;

        public DefaultParams(Map<String, Object> params) {
            this.params = params;
        }

        @Override
        public Map<String, Object> toParams() {
            if (this.params == null) {
                return Maps.newHashMap();
            }
            Map<String, Object> newParams = Maps.newHashMap();
            Map<String, Object> oldParams = params;
            for (String key : oldParams.keySet()) {
                if (oldParams.get(key) != null) {
                    newParams.put(key, oldParams.get(key));
                }
            }
            return newParams;
        }
    }

    private static class DefaultParamsWithFile extends DefaultParams implements FileParams {
        private Multimap<String, ByteWrapper> fileParams = null;

        public DefaultParamsWithFile(Map<String, Object> params, Multimap<String, ByteWrapper> fileParams) {
            super(params);
            this.fileParams = fileParams;
        }

        @Override
        public Multimap<String, ByteWrapper> toFileParams() {
            return fileParams;
        }
    }

}
