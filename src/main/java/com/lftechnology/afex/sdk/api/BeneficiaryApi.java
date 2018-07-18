package com.lftechnology.afex.sdk.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.afex.sdk.dto.Beneficiary;
import com.lftechnology.afex.sdk.dto.BeneficiaryResponse;
import com.lftechnology.afex.sdk.dto.BeneficiaryValidationInformation;
import com.lftechnology.afex.sdk.service.BeneficiaryApiService;
import com.lftechnology.afex.sdk.service.ExecuteApiService;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;
import java.util.Map;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public class BeneficiaryApi {

    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApi;

    public BeneficiaryApi(String baseUrl,Map<String,String> headerMap){
        this.requestApi = new RequestApi(baseUrl,headerMap);
    }

    public List<BeneficiaryValidationInformation> validationBeneficiary(Beneficiary beneficiary) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BeneficiaryApiService service = retrofit.create(BeneficiaryApiService.class);
        Map<String, Object> map = objectMapper.convertValue(beneficiary, Map.class);
        Call<List<BeneficiaryValidationInformation>> call = service.validationBeneficiary(map);
        return executeApi.executeApiCall(call);
    }

    public List<BeneficiaryValidationInformation> createBeneficiary(Beneficiary beneficiary) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BeneficiaryApiService service = retrofit.create(BeneficiaryApiService.class);
        Map<String, Object> map = objectMapper.convertValue(beneficiary, Map.class);
        Call<List<BeneficiaryValidationInformation>> call = service.createBeneficiary(map);
        return executeApi.executeApiCall(call);
    }

    public List<BeneficiaryValidationInformation> updateBeneficiary(Beneficiary beneficiary) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BeneficiaryApiService service = retrofit.create(BeneficiaryApiService.class);
        Map<String, Object> map = objectMapper.convertValue(beneficiary, Map.class);
        Call<List<BeneficiaryValidationInformation>> call = service.updateBeneficiary(map);
        return executeApi.executeApiCall(call);
    }

    public String disableBeneficiary(String vendorId) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BeneficiaryApiService service = retrofit.create(BeneficiaryApiService.class);
        Call<String> call = service.disableBeneficiary(vendorId);
        return executeApi.executeApiCall(call);
    }

    public List<BeneficiaryResponse> fetchBeneficiaries() {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BeneficiaryApiService service = retrofit.create(BeneficiaryApiService.class);
        Call<List<BeneficiaryResponse>> call = service.fetchBeneficiaries();
        return executeApi.executeApiCall(call);
    }

    public Beneficiary findBeneficiary(String vendorId) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BeneficiaryApiService service = retrofit.create(BeneficiaryApiService.class);
        Call<Beneficiary> call = service.findBeneficiary(vendorId);
        return executeApi.executeApiCall(call);
    }

}
