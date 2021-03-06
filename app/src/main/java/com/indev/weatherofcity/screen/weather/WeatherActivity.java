package com.indev.weatherofcity.screen.weather;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.indev.weatherofcity.R;

/**
 * UI class, that displays weather of city.
 *
 * @author E.Drozyk
 * @version 1.0 1 Nov 2016
 */
public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        if (savedInstanceState == null) {
            WeatherFragment fragment = new WeatherFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
        }
    }
}
