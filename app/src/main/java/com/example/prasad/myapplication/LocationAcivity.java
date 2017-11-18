package com.example.prasad.myapplication;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class LocationAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_acivity);

        final TextView text = (TextView) findViewById(R.id.text);

        LocationListener listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                text.setText("Current Location: " + location.getLatitude() + ", " + location.getLongitude());
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        try {
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5, 5000, listener);
            Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            text.setText("Current Location: " + location.getLatitude() + ", " + location.getLongitude());


        }
        catch(SecurityException e){
            text.setText(e.getMessage());
        }
        //text.setText("Messi is great");

    }

}
