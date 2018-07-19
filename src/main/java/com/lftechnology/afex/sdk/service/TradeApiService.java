package com.lftechnology.afex.sdk.service;

import com.lftechnology.afex.sdk.dto.ExchangeRate;
import com.lftechnology.afex.sdk.dto.TradeDetail;
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
public interface TradeApiService {

    /**
     * Request a rate quote for a specified currency pair and value date (note, next available value dates are returned by api/valuedates).
     * The quote returns a rate which you can use a in calculation to calculate buy or sell amounts.
     * The quote ID returned may then be supplied when calling api/trades/create or api/forwards/create to fix the rate for a trade at
     * the quoted rate (providing the quote has not yet expired). A quote is valid for 30 seconds.
     *
     * @param currencyPair {The currency pair specifies the trade (buy) and settlement (sell) currencies being quoted. The pair must
     *                     have the trade currency (buy) as the first in the pair and the settlement currency (sell) as the second in
     *                     the pair. }
     * @param valueDate {The date the proceeds of the trade are paid out (providing the client has remitted settlement funds to AFEX)}
     * @param optionDate {If the quote is for a window / flex forward, the OptionDate must be supplied.
     *                   The option date is the start date of the forward window period.}
     * @return The quoted rate for the currency trade. {@link ExchangeRate}
     */
    @GET("api/quote")
    Call<ExchangeRate> getQuote(@Query("CurrencyPair") String currencyPair, @Query("ValueDate") String valueDate, @Query("OptionDate") String optionDate);

    /**
     * Create a trade or outright forward to convert from one currency to another. Trades can be booked for cash value (today),
     * tom value (next available business day), spot value (2 business days) or forward (beyond two business days). Trade
     * proceeds can be paid directly to a beneficiary by supplying a VendorID, or to the client's foreign currency account
     * with AFEX i.e. a funding trade where a VendorID / beneficiary is NOT supplied.
     *
     * @param trade
     * @return
     */
    @FormUrlEncoded
    @POST("api/trades/create")
    Call<TradeDetail> createTrade(@FieldMap Map<String, Object> trade);

    @GET("api/trades")
    Call<TradeDetail> getTrade(@Query("Id") String tradeId);

    @GET("api/trades")
    Call<List<TradeDetail>> getTrades(@Query("StartDate") String startDate, @Query("EndDate") String endDate);

    /* TODO: Map return type for pdf
    @GET("api/confirmations")
    Call<> getTradeConfirmation(@Query("TradeNumber") String tradeNumber, @Query("Swift") Boolean swift);
     */

}
