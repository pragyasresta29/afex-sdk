package com.lftechnology.afex.sdk.service;

import com.lftechnology.afex.sdk.dto.BeneficiaryBank;
import com.lftechnology.afex.sdk.dto.BeneficiaryCountry;
import com.lftechnology.afex.sdk.dto.CreditLimit;
import com.lftechnology.afex.sdk.dto.Currency;
import com.lftechnology.afex.sdk.dto.IntermediaryBankDetail;
import com.lftechnology.afex.sdk.dto.PurposeOfPayment;
import com.lftechnology.afex.sdk.dto.ExchangeRate;
import com.lftechnology.afex.sdk.dto.SenderCountry;
import com.lftechnology.afex.sdk.dto.SettlementInstructions;
import com.lftechnology.afex.sdk.dto.State;
import com.lftechnology.afex.sdk.dto.TradeDetail;
import com.lftechnology.afex.sdk.dto.ValidationIbanResponse;
import com.lftechnology.afex.sdk.dto.VostroAccount;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public interface ReferenceDataApiService {

    @GET("api/v1/primaryContactIdentificationType")
    Call<List<String>> fetchIdentificationTypes();

    @GET("api/v1/companyType")
    Call<List<String>> fetchCompanyType();

    @GET("api/v1/jobTitles")
    Call<List<String>> fetchJobTitles();

    @GET("api/v1/naics")
    Call<List<String>> fetchNaicsCodes();

    @GET("api/v1/country")
    Call<List<SenderCountry>> fetchSenderCountries();

    @GET("api/beneficiaryCodes")
    Call<Object> getBeneficiaryErrorCodes(@Query("Information") Boolean information);

    @GET("api/country/find")
    Call<List<BeneficiaryCountry>> fetchBeneficiaryCountries();

    @FormUrlEncoded
    @POST("api/country/region")
    Call<List<State>> fetchStates(@Field("CountryCode") String countryCode);

    @GET("api/city/find")
    Call<List<String>> fetchCities(@Query("CountryCode") String countryCode);

    @FormUrlEncoded
    @POST("api/nationalid/find")
    Call<List<BeneficiaryBank>> fetchBeneficiaryBanks(@Field("City") String city, @Field("CountryCode") String countryCode, @Field("Institution") String institution, @Field("NationalId") String nationalId);

    @GET("api/nationalid/intermediary")
    Call<List<IntermediaryBankDetail>> fetchIntermediaryBankDetails(@Query("Currency") String currency, @Query("NationalId") String nationalId);

    @GET("api/beneficiary/isiban")
    Call<ValidationIbanResponse> validateIbanAndFetchBicCode(@Query("Iban") String iban, @Query("Country") String country);

    @GET("api/purposeOfPayment")
    Call<List<PurposeOfPayment>> fetchPopCodes(@Query("BankCountryCode") String bankCountryCode, @Query("BeneficiaryCountryCode") String beneficiaryCountryCode, @Query("Currency") String currency);

    @GET("api/currency")
    Call<List<Currency>> fetchCurrencies();

    @GET("api/funding")
    Call<List<VostroAccount>> getVostroAccountsInformation();

    @GET("api/funding")
    Call<List<TradeDetail>> getTradeDetails(@Query("Currency") String currency, @Query("StartDate") String startDate, @Query("EndDate") String endDate);

    @GET("api/credit")
    Call<CreditLimit> getCreditLimit();

    /**
     * Request a rate for a specified currency pair.
     * This is an indicative rate only. Use api/quote for securing a quote and booking a transaction.
     *
     * @param currencyPair {if the client wants to convert AUD to USD
     *                     (I.E. sell AUD and buy USD) the currency pair would be expressed as USDAUD.}
     * @param valueType    {Cash=value today, Tom=value next available business day,
     *                     Spot=value two business days.
     *                     If a ValueType is not specified, Spot ValueType will be defaulted.}
     * @return exchangeRate {@link ExchangeRate}
     */
    @GET("api/rates")
    Call<ExchangeRate> getExchangeRate(@Query("CurrencyPair") String currencyPair, @Query("ValueType") String valueType);

    @GET("api/ssi/GetSSI")
    Call<List<SettlementInstructions>> fetchSettlementInstructions(@Query("Currency") String currency);

    /**
     *  The value date is the date that the trade proceeds are paid out to either the beneficiary,
     *  or in the case of a funding trade, to the client's AFEX currency holding. Value dates must
     *  be business days for both the buy (trade) and sell (settlement) currencies. The value date
     *  calendar is based on local business dates, business dates in the country of the trade and
     *  settlement currency and local payment cut off times by currency.
     *
     * @param currencyPair
     * @param valueType
     * @return
     */
    @GET("api/valuedates")
    Call<String> getNextValueDate(@Query("CurrencyPair") String currencyPair, @Query("ValueType") String valueType);

    @GET("api/holidays")
    Call<List<String>> fetchHolidays(@Query("CurrencyPair") String currencyPair);

}