package com.example.elephantfly.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ElephantFly on 2017/4/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
