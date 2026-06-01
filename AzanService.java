package com.azan;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class AzanService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("AzanApp", "خدمة الأذان تعمل الآن في الخلفية");
        // هنا سنضيف لاحقاً منطق تشغيل صوت الأذان
        return START_STICKY;
    }
}

