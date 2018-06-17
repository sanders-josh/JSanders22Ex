package com.example.jsand.jsanders22ex.activity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jsand.jsanders22ex.R;

public class NotificationActivity extends AppCompatActivity
{
    private NotificationManager mNotificationManager;
    private int notifyID = 100;
    private String channelId = "EXAMPLE";

    private Button small;
    private Button big;
    private Button pic;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        small = findViewById(R.id.notification_small_button);
        big = findViewById(R.id.notification_big_button);
        pic = findViewById(R.id.notification_pic_button);

        mNotificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        small.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(NotificationActivity.this, channelId);
                    mBuilder.setContentTitle("Title")
                            .setContentText("Text")
                            .setContentIntent(getDefaultIntent(Notification.FLAG_AUTO_CANCEL))
                            .setNumber(10)
                            .setTicker("Ticker")
                            .setWhen(System.currentTimeMillis())
                            .setPriority(Notification.PRIORITY_DEFAULT)
                            .setAutoCancel(true)
                            .setOngoing(false)
                            .setDefaults(Notification.DEFAULT_SOUND)
                            .setDefaults(Notification.DEFAULT_VIBRATE)
                            .setSmallIcon(R.mipmap.ic_launcher);

                    mNotificationManager.notify(notifyID, mBuilder.build());
            }
        });

        big.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(NotificationActivity.this, channelId);
                mBuilder.setContentTitle("Title")
                        .setContentText("Text")
                        .setContentIntent(getDefaultIntent(Notification.FLAG_AUTO_CANCEL))
                        .setNumber(11)
                        .setTicker("Ticker")
                        .setWhen(System.currentTimeMillis())
                        .setPriority(Notification.PRIORITY_DEFAULT)
                        .setAutoCancel(true)
                        .setOngoing(false)
                        .setDefaults(Notification.DEFAULT_SOUND)
                        .setDefaults(Notification.DEFAULT_VIBRATE)
                        .setSmallIcon(R.mipmap.ic_launcher);

                NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                String[] events = new String[]{"Line 1", "Line 2", "Line 3", "Line 4", "Line 5"};
                inboxStyle.setBigContentTitle("BigContentTitle");

                for (String event : events)
                {
                    inboxStyle.addLine(event);
                }
                inboxStyle.setBuilder(mBuilder);
                mBuilder.setStyle(inboxStyle);
                mNotificationManager.notify(notifyID, mBuilder.build());
            }
        });

        pic.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(NotificationActivity.this, channelId);
                mBuilder.setContentTitle("Title")
                        .setContentText("Text")
                        .setContentIntent(getDefaultIntent(Notification.FLAG_AUTO_CANCEL))
                        .setNumber(12)
                        .setTicker("Ticker")
                        .setWhen(System.currentTimeMillis())
                        .setPriority(Notification.PRIORITY_DEFAULT)
                        .setAutoCancel(true)
                        .setOngoing(false)
                        .setDefaults(Notification.DEFAULT_SOUND)
                        .setDefaults(Notification.DEFAULT_VIBRATE)
                        .setSmallIcon(R.mipmap.ic_launcher);

                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                mBuilder.setStyle(bigPictureStyle);
                bigPictureStyle.setBuilder(mBuilder);
                bigPictureStyle.setBigContentTitle("BigContentTitle");
                bigPictureStyle.setSummaryText("SummaryText");
                Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.pic1);
                bigPictureStyle.bigPicture(bitmap1);
                mBuilder.setStyle(bigPictureStyle);

                mNotificationManager.notify(notifyID, mBuilder.build());
            }
        });
    }

    public PendingIntent getDefaultIntent(int flags)
    {
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 1, new Intent(), flags);
        return pendingIntent;
    }
}
