package com.androidlime.parcentangeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Mithun extends AppCompatActivity {


    ImageView picture;
    TextView textView;

    Animation wowow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mithun);



        picture= (ImageView) findViewById(R.id.imageee);

        textView= (TextView) findViewById(R.id.texttttttttttt);


        wowow= AnimationUtils.loadAnimation(this,R.anim.animation);

        picture.setAnimation(wowow);
        textView.setAnimation(wowow);


    }
}
