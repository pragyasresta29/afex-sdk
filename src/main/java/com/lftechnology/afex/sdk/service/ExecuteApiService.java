package com.lftechnology.afex.sdk.service;

import retrofit2.Call;

public interface ExecuteApiService {

    public  <T> T executeApiCall(Call<T> call);
}
