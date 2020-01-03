package com.lftechnology.afex.sdk.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.afex.sdk.dto.Authorization;
import com.lftechnology.afex.sdk.dto.TokenResponse;
import com.lftechnology.afex.sdk.service.ExecuteApiService;
import com.lftechnology.afex.sdk.service.TokenApiService;
import com.lftechnology.afex.sdk.service.impl.ExecuteApiImpl;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.Map;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public class TokenApi {

    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApi = new ExecuteApiImpl();

    public TokenApi(String baseUrl,Map<String,String> headerMap){
        this.requestApi = new RequestApi(baseUrl,headerMap);
    }

    public TokenResponse getToken(Authorization authorization) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        TokenApiService service = retrofit.create(TokenApiService.class);
        Map<String, Object> map = objectMapper.convertValue(authorization, Map.class);
        Call<TokenResponse> call = service.getToken(map);
        return executeApi.executeApiCall(call);
    }

}
