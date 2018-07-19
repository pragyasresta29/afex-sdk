package com.lftechnology.afex.sdk.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.afex.sdk.dto.Payment;
import com.lftechnology.afex.sdk.dto.PaymentDetail;
import com.lftechnology.afex.sdk.dto.PaymentResponse;
import com.lftechnology.afex.sdk.service.ExecuteApiService;
import com.lftechnology.afex.sdk.service.PaymentApiService;
import com.lftechnology.afex.sdk.service.impl.ExecuteApiImpl;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;
import java.util.Map;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public class PaymentApi {

    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApi = new ExecuteApiImpl();

    public PaymentApi(String baseUrl,Map<String,String> headerMap){
        this.requestApi = new RequestApi(baseUrl,headerMap);
    }

    public PaymentResponse createPayment(Payment payment) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        PaymentApiService service = retrofit.create(PaymentApiService.class);
        Map<String, Object> map = objectMapper.convertValue(payment, Map.class);
        Call<PaymentResponse> call = service.createPayment(map);
        return executeApi.executeApiCall(call);
    }

    public List<PaymentDetail> fetchPayments(String startDate, String endDate) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        PaymentApiService service = retrofit.create(PaymentApiService.class);
        Call<List<PaymentDetail>> call = service.fetchPayments(startDate, endDate);
        return executeApi.executeApiCall(call);
    }

    public PaymentDetail fetchPayment(String paymentId) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        PaymentApiService service = retrofit.create(PaymentApiService.class);
        Call<PaymentDetail> call = service.fetchPayment(paymentId);
        return executeApi.executeApiCall(call);
    }

}
