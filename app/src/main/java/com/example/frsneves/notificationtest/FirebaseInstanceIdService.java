package com.example.frsneves.notificationtest;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by frsneves on 03/02/17.
 */

public class FirebaseInstanceIdService extends com.google.firebase.iid.FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("INSTANTID_SERVICE", "Refreshed token: " + refreshedToken);

        // TODO: Implement this method to send any registration to your app's servers.
        //sendRegistrationToServer(refreshedToken);
    }
}
