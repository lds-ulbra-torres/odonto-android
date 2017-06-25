package com.dewes.odonto.api.client;

import com.dewes.odonto.domain.Status;
import com.dewes.odonto.domain.Token;
import com.dewes.odonto.domain.User;
import com.dewes.odonto.domain.UserCredentials;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Gabriel on 22/06/2017.
 */

public interface AuthApi {

    @POST("auth/token")
    Call<Status<Token>> callForToken(@Body UserCredentials userCredentials);

    @POST("auth/logout")
    Call<Status> callForLogout();

    @POST("account/register")
    Call<Status<List<Status<User>>>> register(@Body User user);
}
