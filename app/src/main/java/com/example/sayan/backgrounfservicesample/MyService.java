package com.example.sayan.backgrounfservicesample;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("sayanService", "onStartCommand:");
        Toast.makeText(this, "Started", Toast.LENGTH_SHORT).show();
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this);
        notificationBuilder.setSmallIcon(R.drawable.ic_launcher_background);
        notificationBuilder.setContentTitle("Started").setContentText("abcdefg");
        Notification notification = notificationBuilder.build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (notificationManager != null) {
            notificationManager.notify(1, notification);
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.d("sayanService", "onStartCommand:");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this);
        notificationBuilder.setSmallIcon(R.drawable.ic_launcher_background);
        notificationBuilder.setContentTitle("Stop").setContentText("abcdefg");
        Notification notification = notificationBuilder.build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (notificationManager != null) {
            notificationManager.notify(1, notification);
        }
        Log.d("sayanService", "onDestroy:");
    }
}
