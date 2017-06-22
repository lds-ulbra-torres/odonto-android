package com.dewes.odonto.api.client;

import com.dewes.odonto.domain.Principal;
import com.dewes.odonto.domain.User;
import com.dewes.odonto.domain.UserCredentials;
import com.dewes.odonto.domain.Status;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Dewes on 13/06/2017.
 */

public interface AccountApi {

    @POST("account/auth")
    Call<Status<Principal>> authenticate(@Body UserCredentials userCredentials);

    @POST("account/register")
    Call<Status<User>> registerORIGINAL(@Body User user);

    @POST("account/register")
    Call<Status<List<Status<User>>>> register(@Body User user);

    @GET("account")
    Call<Status> me();
}
