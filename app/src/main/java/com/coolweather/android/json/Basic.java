package com.coolweather.android.json;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("location")//JSON与java类之间建立映射关系
    public String cityName;
    @SerializedName("cid")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
