package com.example.webrtcdemo2.WebFields;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Url;

/**
 * Webrtc_Step3
 * Created by vivek-3102 on 11/03/17.
 */


public interface TurnServer {
//    @POST("/123")
//    Call<RoomResponseModel> getIceCandidates(@Header("Authorization") String authkey);


    @POST()
    Call<RoomResponseModel> getIceCandidates(@Url String apiname, @Header("Authorization") String authkey);

}
