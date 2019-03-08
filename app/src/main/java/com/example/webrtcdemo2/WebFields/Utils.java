package com.example.webrtcdemo2.WebFields;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Webrtc_Step3
 * Created by vivek-3102 on 11/03/17.
 */

public class Utils {

    static Utils instance;
    //    public static final String API_ENDPOINT = "https://global.xirsys.net";
    public static final String API_ENDPOINT = "https://appr.tc/";
    public static final String SOCKET_URL = "https://apprtc-ws.webrtc.org:443";



    public static Utils getInstance() {
        if (instance == null) {
            instance = new Utils();
        }
        return instance;
    }

    private Retrofit retrofitInstance;

    public TurnServer getRetrofitInstance() {
        if (retrofitInstance == null) {
            retrofitInstance = new Retrofit.Builder()
                    .baseUrl(API_ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitInstance.create(TurnServer.class);
    }
}
