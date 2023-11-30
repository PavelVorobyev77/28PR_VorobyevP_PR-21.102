package com.example.a28pr_vorobyevp_pr_21102;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Получим ссылку на звезды
        ImageView star1 = findViewById(R.id.star1);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.stars);
        star1.startAnimation(animation1);
        ImageView star2 = findViewById(R.id.star2);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.stars);
        star2.startAnimation(animation2);
        ImageView star3= findViewById(R.id.star3);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.stars);
        star3.startAnimation(animation3);
        ImageView star4 = findViewById(R.id.star4);
        Animation animation4 = AnimationUtils.loadAnimation(this, R.anim.stars);
        star4.startAnimation(animation4);
        ImageView star5 = findViewById(R.id.star5);
        Animation animation5 = AnimationUtils.loadAnimation(this, R.anim.stars);
        star5.startAnimation(animation5);
        // Получим ссылку на луну
        ImageView moonImageView = findViewById(R.id.moon);
        // Анимация для луны
        Animation moonsetAnimation = AnimationUtils.loadAnimation(this, R.anim.moon_set);
        // Подключаем анимацию к нужному View
        moonImageView.startAnimation(moonsetAnimation);
        // Получим ссылку на солнце
        ImageView sunImageView = findViewById(R.id.sun);
        // Анимация для восхода солнца
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        // Подключаем анимацию к нужному View
        sunImageView.startAnimation(sunRiseAnimation);
        // Получим ссылку на часы
        ImageView clockImageView = findViewById(R.id.clock);
        // анимация для вращения часов
        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clockImageView.startAnimation(clockTurnAnimation);
        // получим ссылку на часовую стрелку
        ImageView hourImageView = findViewById(R.id.hour_hand);
        // анимация для стрелки
        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        // присоединяем анимацию
        hourImageView.startAnimation(hourTurnAnimation);
    }
}