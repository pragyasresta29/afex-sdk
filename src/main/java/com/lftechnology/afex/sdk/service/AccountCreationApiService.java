package com.lftechnology.afex.sdk.service;

import com.lftechnology.afex.sdk.dto.PrivateClient;
import retrofit2.Call;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */
public interface AccountCreationApiService {

    Call<PrivateClient> createPrivateClient();
}
