package com.lftechnology.afex.sdk.util;

import com.lftechnology.afex.sdk.constants.ApiConstant;
import okhttp3.Headers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public class ApiUtil {

    public static Map<String,String> getDefaultHeader(){
        Map<String,String> headers = new HashMap<>();
        headers.put(ApiConstant.CONTENT_TYPE, ApiConstant.X_WWW_FORM_URLENCODED);
        headers.put(ApiConstant.API_KEY, ApiConstant.API_KEY_VALUE);
        return headers;
    }

    public static Map<String,String> getTokenHeader(){
        Map<String,String> headers = new HashMap<>();
        headers.put(ApiConstant.CONTENT_TYPE, ApiConstant.X_WWW_FORM_URLENCODED);
        return headers;
    }

    public static Headers buildHeader(Map<String,String> headerMap){
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, String> entry : headerMap.entrySet()) {
            builder.add(entry.getKey(), entry.getValue());
        }
        return builder.build();
    }
}
