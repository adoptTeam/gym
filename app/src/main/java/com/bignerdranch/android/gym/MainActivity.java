package com.bignerdranch.android.gym;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public  ImageView imageView;
    private ImageButton mFlzs;
    private ImageButton mLmtc;
    private ImageButton mYhhd;
    private ImageButton mYjdc;
    private ImageButton mTkc;
    private ImageButton mNwms;
    private ImageButton mXfzdz;

    private ImageButton mXiangqing;
    private ImageButton mDingdan;
    private ImageButton mWode;
    public boolean juage = true;
    public int images[] = new int[]{R.drawable.a, R.drawable.b,R.drawable.c,
            R.drawable.d,R.drawable.e,R.drawable.f};
    public int count = 0;
    public Handler handler = new Handler();
    public Runnable runnable = new Runnable() {
        @Override
        public void run() {
            AnimationSet animationSet1 = new AnimationSet(true);
            TranslateAnimation ta = new TranslateAnimation(
                    Animation.RELATIVE_TO_SELF, 00, Animation.RELATIVE_TO_SELF,
                    00, Animation.RELATIVE_TO_SELF, 00,
                    Animation.RELATIVE_TO_SELF, 00);
            ta.setDuration(10000);
            animationSet1.addAnimation(ta);
            animationSet1.setFillAfter(true);
            imageView.startAnimation(animationSet1);
            imageView.setBackgroundResource(images[count % 6]);
            count++;
            if (juage)
                handler.postDelayed(runnable, 2600);
            Log.i("handler", "handler");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        handler.postDelayed(runnable, 1);




        mFlzs=(ImageButton)findViewById(R.id.flzs);
        mFlzs.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
               Intent i=new Intent(MainActivity.this,DisplayActivity.class);
              startActivity(i);
            }
        });

       
    }




}