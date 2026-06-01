package com.azan;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.Gravity;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // إنشاء حاوية (Layout) لتنسيق العناصر
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.parseColor("#2C3E50")); // لون خلفية احترافي

        // إضافة نص ترحيبي بتصميم جميل
        TextView tv = new TextView(this);
        tv.setText("أهلاً بك في رفيق الصلاة");
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(24);
        
        layout.addView(tv);
        setContentView(layout);
    }
}
