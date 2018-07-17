package com.lftechnology.afex.sdk.service;

import com.lftechnology.afex.sdk.dto.AccountCreationResponse;
import com.lftechnology.afex.sdk.dto.AccountStatusResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.Map;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public interface AccountCreationApiService {

    @FormUrlEncoded
    @POST("api/v1/privateClient")
    Call<AccountCreationResponse> createPrivateClient(@FieldMap Map<String, Object> privateClient);

    @FormUrlEncoded
    @POST("api/v1/corporateClient")
    Call<AccountCreationResponse> createCorporateClient(@FieldMap Map<String, Object> corporateClient);

    @GET("api/v1/clientstatus")
    Call<AccountStatusResponse> getAccountStatus(@Query("ApiKey") String apiKey);

}
