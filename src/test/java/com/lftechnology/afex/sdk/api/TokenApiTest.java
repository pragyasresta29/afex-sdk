package com.lftechnology.afex.sdk.api;

import com.lftechnology.afex.sdk.dto.Authorization;
import com.lftechnology.afex.sdk.dto.TokenResponse;
import com.lftechnology.afex.sdk.exception.ApiException;
import com.lftechnology.afex.sdk.util.ApiUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TokenApiTest {

    private String baseUrl = "https://demo.api.afex.com:7885/";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(expected = ApiException.class)
    public void shouldThrowApiExceptionWhenForInvalidCredentials() {

        TokenApi tokenApi = new TokenApi(this.baseUrl, ApiUtil.getTokenHeader());

        //Given
        tokenApi.getToken(getInvalidAuthorization());

    }

    @Test
    public void testGetToken() {
        //Given
        TokenApi tokenApi = new TokenApi(this.baseUrl, ApiUtil.getTokenHeader());

        //When
        TokenResponse token = tokenApi.getToken(getAuthorization());

        //Then
        Assert.assertNotNull(token);
    }

    private Authorization getAuthorization(){
        Authorization authorization = new Authorization();
        authorization.setGrantType("password");
        authorization.setUserName("00005576V49666635-b56d-e811-bef3-0050569b0074");
        authorization.setPassword("4cb28873-b36d-e811-80d3-0050569b5df4");
        return authorization;
    }

    private Authorization getInvalidAuthorization() {
        Authorization authorization = new Authorization();
        authorization.setGrantType("password");
        authorization.setUserName("abcd");
        authorization.setPassword("456121");
        return authorization;
    }
}
