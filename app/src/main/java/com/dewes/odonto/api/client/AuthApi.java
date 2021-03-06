package com.dewes.odonto.api.client;

import com.dewes.odonto.domain.Status;
import com.dewes.odonto.domain.Token;
import com.dewes.odonto.domain.UserCredentials;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;

/**
 * Created by Gabriel on 22/06/2017.
 */

public interface AuthApi {

    @POST("auth/token")
    Call<Status<Token>> authToken(@Body UserCredentials userCredentials);

    @DELETE("auth/revoke")
    Call<Status> revokeToken();
}
