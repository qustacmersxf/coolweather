package com.example.elephantfly.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ElephantFly on 2017/4/6.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
