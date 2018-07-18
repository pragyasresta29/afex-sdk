package com.lftechnology.afex.sdk.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.afex.sdk.dto.BeneficiaryBank;
import com.lftechnology.afex.sdk.dto.BeneficiaryCountry;
import com.lftechnology.afex.sdk.dto.CreditLimit;
import com.lftechnology.afex.sdk.dto.Currency;
import com.lftechnology.afex.sdk.dto.ExchangeRate;
import com.lftechnology.afex.sdk.dto.IntermediaryBankDetail;
import com.lftechnology.afex.sdk.dto.PurposeOfPayment;
import com.lftechnology.afex.sdk.dto.SenderCountry;
import com.lftechnology.afex.sdk.dto.SettlementInstructions;
import com.lftechnology.afex.sdk.dto.State;
import com.lftechnology.afex.sdk.dto.TradeDetail;
import com.lftechnology.afex.sdk.dto.ValidationIbanResponse;
import com.lftechnology.afex.sdk.dto.VostroAccount;
import com.lftechnology.afex.sdk.service.ExecuteApiService;
import com.lftechnology.afex.sdk.service.ReferenceDataApiService;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;
import java.util.Map;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public class ReferenceDataApi {

    private RequestApi requestApi;

    private ExecuteApiService executeApi;

//    private ObjectMapper objectMapper = new ObjectMapper();

    public ReferenceDataApi(String baseUrl,Map<String,String> headerMap){
        this.requestApi = new RequestApi(baseUrl,headerMap);
    }

    public List<String> fetchIdentificationTypes(){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<String>> call = service.fetchIdentificationTypes();
        return executeApi.executeApiCall(call);
    }

    public List<String> fetchJobTitles(){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<String>> call = service.fetchJobTitles();
        return executeApi.executeApiCall(call);
    }

    public List<String> fetchNaicsCodes(){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<String>> call = service.fetchNaicsCodes();
        return executeApi.executeApiCall(call);
    }

    public List<SenderCountry> fetchSenderCountries(){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<SenderCountry>> call = service.fetchSenderCountries();
        return executeApi.executeApiCall(call);
    }

    public Object getBeneficiaryErrorCodes(Boolean information){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<Object> call = service.getBeneficiaryErrorCodes(information);
        return executeApi.executeApiCall(call);
    }

    public List<BeneficiaryCountry> fetchBeneficiaryCountries(){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<BeneficiaryCountry>> call = service.fetchBeneficiaryCountries();
        return executeApi.executeApiCall(call);
    }

    public List<State> fetchStates(String countryCode){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<State>> call = service.fetchStates(countryCode);
        return executeApi.executeApiCall(call);
    }

    public List<String> fetchCities(String countryCode){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<String>> call = service.fetchCities(countryCode);
        return executeApi.executeApiCall(call);
    }

    public List<BeneficiaryBank> fetchBeneficiaryBanks(String city, String countryCode, String institution, String nationalId){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<BeneficiaryBank>> call = service.fetchBeneficiaryBanks(city, countryCode, institution, nationalId);
        return executeApi.executeApiCall(call);
    }

    public List<IntermediaryBankDetail> fetchIntermediaryBankDetails(String currency, String nationalId){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<IntermediaryBankDetail>> call = service.fetchIntermediaryBankDetails(currency, nationalId);
        return executeApi.executeApiCall(call);
    }

    public ValidationIbanResponse validateIbanAndFetchBicCode(String iban, String country){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<ValidationIbanResponse> call = service.validateIbanAndFetchBicCode(iban, country);
        return executeApi.executeApiCall(call);
    }

    public List<PurposeOfPayment> fetchPopCodes(String bankCountryCode, String beneficiaryCountryCode, String currency){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<PurposeOfPayment>> call = service.fetchPopCodes(bankCountryCode, beneficiaryCountryCode, currency);
        return executeApi.executeApiCall(call);
    }

    public List<Currency> fetchCurrencies(){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<Currency>> call = service.fetchCurrencies();
        return executeApi.executeApiCall(call);
    }

    public List<VostroAccount> getVostroAccountsInformation(){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<VostroAccount>> call = service.getVostroAccountsInformation();
        return executeApi.executeApiCall(call);
    }

    public List<TradeDetail> getTradeDetails(String currency, String startDate, String endDate){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<TradeDetail>> call = service.getTradeDetails(currency, startDate, endDate);
        return executeApi.executeApiCall(call);
    }

    public CreditLimit getCreditLimit(){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<CreditLimit> call = service.getCreditLimit();
        return executeApi.executeApiCall(call);
    }

    public ExchangeRate getExchangeRate(String currencyPair, String valueType){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<ExchangeRate> call = service.getExchangeRate(currencyPair, valueType);
        return executeApi.executeApiCall(call);
    }

    public List<SettlementInstructions> fetchSettlementInstructions(String currency){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<SettlementInstructions>> call = service.fetchSettlementInstructions(currency);
        return executeApi.executeApiCall(call);
    }

    public String getNextValueDate(String currencyPair, String valueType){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<String> call = service.getNextValueDate(currencyPair, valueType);
        return executeApi.executeApiCall(call);
    }

    public List<String> fetchHolidays(String currencyPair){
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ReferenceDataApiService service = retrofit.create(ReferenceDataApiService.class);
        Call<List<String>> call = service.fetchHolidays(currencyPair);
        return executeApi.executeApiCall(call);
    }

}
