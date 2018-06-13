package com.example.jsand.jsanders22ex.activity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jsand.jsanders22ex.R;

public class NotificationActivity extends AppCompatActivity
{
    private NotificationManager notificationManager;
    private int notifyID = 100;
    private String channelId = "EXAMPLE";
    private Button small;
    private Button big;
    private Button pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        small = findViewById(R.id.notification_small_button);
        big = findViewById(R.id.notification_big_button);
        pic = findViewById(R.id.notification_pic_button);

        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(NotificationActivity.this, channelId);
                    mBuilder.setContentTitle("Title")
                            .setContentText("Text")
                            .setNumber(10)
                            .setAutoCancel(true)
                            .setDefaults(Notification.DEFAULT_VIBRATE)
                            .setSmallIcon(R.mipmap.ic_launcher);
            }
        });
    }
}
