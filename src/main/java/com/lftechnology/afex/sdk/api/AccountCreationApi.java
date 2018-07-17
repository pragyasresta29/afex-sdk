package com.lftechnology.afex.sdk.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.afex.sdk.dto.AccountCreationResponse;
import com.lftechnology.afex.sdk.dto.AccountStatusResponse;
import com.lftechnology.afex.sdk.dto.CorporateClient;
import com.lftechnology.afex.sdk.dto.PrivateClient;
import com.lftechnology.afex.sdk.service.AccountCreationApiService;
import com.lftechnology.afex.sdk.service.ExecuteApiService;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.Map;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public class AccountCreationApi {

    private RequestApi requestApi;

    private ExecuteApiService executeApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    public AccountCreationApi(String baseUrl,Map<String,String> headerMap){
        this.requestApi = new RequestApi(baseUrl,headerMap);
    }

    public AccountCreationResponse createPrivateClient(PrivateClient privateClient){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        AccountCreationApiService service = retrofit.create(AccountCreationApiService.class);
        Map<String, Object> map = objectMapper.convertValue(privateClient, Map.class);
        Call<AccountCreationResponse> call = service.createPrivateClient(map);
        return executeApi.executeApiCall(call);
    }

    public AccountCreationResponse createCorporateClient(CorporateClient corporateClient){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        AccountCreationApiService service = retrofit.create(AccountCreationApiService.class);
        Map<String, Object> map = objectMapper.convertValue(corporateClient, Map.class);
        Call<AccountCreationResponse> call = service.createCorporateClient(map);
        return executeApi.executeApiCall(call);
    }

    public AccountStatusResponse getAccountStatus(String apiKey){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        AccountCreationApiService service = retrofit.create(AccountCreationApiService.class);
        Call<AccountStatusResponse> call = service.getAccountStatus(apiKey);
        return executeApi.executeApiCall(call);
    }

}
