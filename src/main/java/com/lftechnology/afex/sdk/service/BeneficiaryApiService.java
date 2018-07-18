package com.lftechnology.afex.sdk.service;

import com.lftechnology.afex.sdk.dto.Beneficiary;
import com.lftechnology.afex.sdk.dto.BeneficiaryResponse;
import com.lftechnology.afex.sdk.dto.BeneficiaryValidationInformation;
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
public interface BeneficiaryApiService {

    @FormUrlEncoded
    @POST("api/beneficiary/validate")
    Call<List<BeneficiaryValidationInformation>> validationBeneficiary(@FieldMap Map<String, Object> beneficiary);

    @FormUrlEncoded
    @POST("api/beneficiaryCreate")
    Call<List<BeneficiaryValidationInformation>> createBeneficiary(@FieldMap Map<String, Object> beneficiary);

    @FormUrlEncoded
    @POST("api/beneficiaryUpdate")
    Call<List<BeneficiaryValidationInformation>> updateBeneficiary(@FieldMap Map<String, Object> beneficiary);

    @POST("api/beneficiaryDisable")
    Call<String> disableBeneficiary(@Query("VendorId") String vendorId);

    @GET("api/beneficiary")
    Call<List<BeneficiaryResponse>> fetchBeneficiaries();

    @GET("api/beneficiary/find")
    Call<Beneficiary> findBeneficiary(@Query("VendorId") String vendorId);

}
