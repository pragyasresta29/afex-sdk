package com.lftechnology.afex.sdk.service;

import com.lftechnology.afex.sdk.dto.DrawdownDetail;
import com.lftechnology.afex.sdk.dto.ForwardDetail;
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
public interface ForwardApiService {

    @FormUrlEncoded
    @POST("api/forwards/create")
    Call<ForwardDetail> createForward(@FieldMap Map<String, Object> forward);

    @FormUrlEncoded
    @POST("api/drawdown/create")
    Call<DrawdownDetail> createDrawdown(@FieldMap Map<String, Object> drawdown);

    @GET("api/forwards")
    Call<ForwardDetail> fetchForwardsHistory(@Query("Id") String tradeId, @Query("StartDate") String startDate, @Query("EndDate") String endDate);

}
