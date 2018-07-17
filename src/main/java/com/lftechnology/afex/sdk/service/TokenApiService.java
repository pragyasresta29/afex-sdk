package com.lftechnology.afex.sdk.service;

import com.lftechnology.afex.sdk.dto.Authorization;
import com.lftechnology.afex.sdk.dto.TokenResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.Map;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public interface TokenApiService {

    @FormUrlEncoded
    @POST("token")
    Call<TokenResponse> getToken(@FieldMap Map<String, Object> authorization);

}
