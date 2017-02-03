package com.example.frsneves.notificationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoogleApiAvailability.getInstance().makeGooglePlayServicesAvailable(this);
    }
}
