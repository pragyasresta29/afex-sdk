package com.lftechnology.afex.sdk.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.afex.sdk.dto.Drawdown;
import com.lftechnology.afex.sdk.dto.DrawdownDetail;
import com.lftechnology.afex.sdk.dto.Forward;
import com.lftechnology.afex.sdk.dto.ForwardDetail;
import com.lftechnology.afex.sdk.service.ExecuteApiService;
import com.lftechnology.afex.sdk.service.ForwardApiService;
import com.lftechnology.afex.sdk.service.impl.ExecuteApiImpl;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.Map;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public class ForwardApi {

    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApi = new ExecuteApiImpl();

    public ForwardApi(String baseUrl,Map<String,String> headerMap){
        this.requestApi = new RequestApi(baseUrl,headerMap);
    }

    public ForwardDetail createForward(Forward forward) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ForwardApiService service = retrofit.create(ForwardApiService.class);
        Map<String, Object> map = objectMapper.convertValue(forward, Map.class);
        Call<ForwardDetail> call = service.createForward(map);
        return executeApi.executeApiCall(call);
    }

    public DrawdownDetail createDrawdown(Drawdown drawdown) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ForwardApiService service = retrofit.create(ForwardApiService.class);
        Map<String, Object> map = objectMapper.convertValue(drawdown, Map.class);
        Call<DrawdownDetail> call = service.createDrawdown(map);
        return executeApi.executeApiCall(call);
    }

    public ForwardDetail fetchForwardsHistory(String tradeId, String startDate, String endDate) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ForwardApiService service = retrofit.create(ForwardApiService.class);
        Call<ForwardDetail> call = service.fetchForwardsHistory(tradeId, startDate, endDate);
        return executeApi.executeApiCall(call);
    }
}
