package com.lftechnology.afex.sdk.service;

import com.lftechnology.afex.sdk.dto.PaymentDetail;
import com.lftechnology.afex.sdk.dto.PaymentResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;
import java.util.Map;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public interface PaymentApiService {

    @FormUrlEncoded
    @POST("api/payments/create")
    Call<PaymentResponse> createPayment(@FieldMap Map<String, Object> payment);

    /**
     *  Retrieve all payents on the account
     *  Date range available = [Current Day - 120 days]
     *
     * @param startDate
     * @param endDate
     * @return
     */
    @GET("api/payments")
    Call<List<PaymentDetail>> fetchPayments(@Query("StartDate") String startDate, @Query("EndDate") String endDate);

    @GET("api/payments")
    Call<PaymentDetail> fetchPayment(@Query("Id") String paymentId);

}
