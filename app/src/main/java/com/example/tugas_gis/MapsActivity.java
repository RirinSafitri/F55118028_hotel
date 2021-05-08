package com.example.tugas_gis;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng home = new LatLng(-0.8840088524965564, 119.83030316598676);
        LatLng hotel = new LatLng(-0.8766970287588953, 119.83613192727746);
        mMap.addPolyline(new PolylineOptions().add(
                home,
                new LatLng(-0.8839818473830082, 119.83028065223883),
                new LatLng(-0.8837331021014018, 119.83023103137631),
                new LatLng(-0.8834655835665013, 119.83024980683764),
                new LatLng(-0.8832577370770335, 119.83028400499963),
                new LatLng(-0.8827447630839528, 119.83038316877627),
                new LatLng(-0.8821061065833927, 119.83048493677633),
                new LatLng(-0.8821552262442595, 119.83087126812859),
                new LatLng(-0.8821786927909347, 119.83115893502058),
                new LatLng(-0.8821921022461051, 119.83126421171534),
                new LatLng(-0.8815055598957808, 119.83123489521914),
                new LatLng(-0.8811676415403136, 119.8312194725182),
                new LatLng(-0.880612489893572, 119.83118125104372),
                new LatLng(-0.8806357925932731, 119.83180057733662),
                new LatLng(-0.8807068627357894, 119.8330290290498),
                new LatLng(-0.8806492020551863, 119.83367141809723),
                new LatLng(-0.8806579182039476, 119.83411934702792),
                new LatLng(-0.8807168806712947, 119.83523061090277),
                new LatLng(-0.8807014788611013, 119.835887832474),
                new LatLng(-0.8803515154686778, 119.83593489916724),
                new LatLng(-0.8801418796843596, 119.83598025429856),
                new LatLng(-0.879886894094979, 119.83608380094492),
                new LatLng(-0.8798287094630669, 119.83616595363559),
                new LatLng(-0.8797730917993594, 119.83623270269678),
                new LatLng(-0.8795412089106001, 119.83673674370813),
                new LatLng(-0.879479601647537, 119.83673160916497),
                new LatLng(-0.879479601647537, 119.83673160916497),
                new LatLng(-0.8787341857899927, 119.83644660352283),
                new LatLng(-0.8776293475610516, 119.83596394958666),
                new LatLng(-0.8774422854219299, 119.83587141337398),
                new LatLng(-0.8769099293304711, 119.83565415445419),
                new LatLng(-0.8767150311948261, 119.83611973435414),
                hotel).width(10).color(Color.BLUE));
        mMap.addMarker(new MarkerOptions().position(home).title("Rin's Home")
                .snippet("Ini adalah Rumah Rin's family"));
        mMap.addMarker(new MarkerOptions().position(hotel).title("Swiss-Bellhotel")
                .snippet("Ini adalah Swiss-Bellhotel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(home,13.5f));
    }
}