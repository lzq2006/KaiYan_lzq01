package com.example.jp.kaiyan_lzq01;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;

public class IndexActivity extends AppCompatActivity {

    private ImageView indexIv;

    private Bitmap bitmap;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
                case 1:

                    Intent intent = new Intent();
                    intent.setClass(IndexActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //隐藏标题栏  当activity是原型时，继承android.activity
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //如果activity是v4或者v7时使用此方法
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_index);

        indexIv = (ImageView) findViewById(R.id.index_iv);

        ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(indexIv, "scaleY", 1, 2, 2);

        scaleAnimator.setDuration(5000);//设置持续时间

        scaleAnimator.start();//启动动画

        Message message = Message.obtain();

        message.obj = scaleAnimator;
        message.what = 1;

        handler.sendMessageDelayed(message, 4000);



    }

}
