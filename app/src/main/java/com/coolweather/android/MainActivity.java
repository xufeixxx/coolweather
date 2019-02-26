package com.coolweather.android;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;

import com.coolweather.android.json.Weather;
import com.coolweather.android.util.HttpUtil;
import com.coolweather.android.util.Utility;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        if(preferences.getString("weather",null)!=null){
            Intent intent =new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
       /* final String weatherUrl="http://guolin.tech/api/weather/?cityid=CN101320103&key=613a5123d89a4f64b9eb3a62580f0d8b";
        HttpUtil.sendOkHttpRequest(weatherUrl, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText = response.body().string();

                Weather weather = Utility.handleWeatherResponse(responseText);
                Log.d(TAG, "onResponse: "+weather.basic.cityName);
                Log.d(TAG, "onResponse: "+weather.basic.weatherId);
                Log.d(TAG, "onResponse: "+weather.basic.update.updateTime);
            }
        });*/
    }
}
