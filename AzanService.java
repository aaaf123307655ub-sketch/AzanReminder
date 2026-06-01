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
        // هنا سيتم وضع كود تشغيل صوت الأذان لاحقاً
        Log.d("AzanApp", "تم تفعيل خدمة الأذان بنجاح");
        return START_STICKY;
    }
}
