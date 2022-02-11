package com.example.ls05_frameviewexample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        TextView tv1 = new TextView(this);
        tv1.setText("This is the sky");
        tv1.setTextColor(Color.BLACK);
        tv1.setTextSize(50);
        tv1.setGravity(Gravity.TOP);
        tv1.setLayoutParams(new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));

        TextView tv2 = new TextView(this);
        tv2.setText("This is the sea");
        tv2.setTextColor(Color.WHITE);
        tv2.setTextSize(50);
        tv2.setGravity(Gravity.BOTTOM);
        tv2.setLayoutParams(new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));

        ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.lake);
        iv.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,
                ActionBar.LayoutParams.MATCH_PARENT));
        iv.setScaleType(ImageView.ScaleType.FIT_XY);

        FrameLayout f1 = new FrameLayout(this);
        f1.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,
                ActionBar.LayoutParams.MATCH_PARENT));

        f1.addView(iv);
        f1.addView(tv1);
        f1.addView(tv2);

        setContentView(f1);
    }
}