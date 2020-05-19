package com.example.turismo_app;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_);
       // setContentView(R.layout.activity_maps);
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

        mMap = googleMap;


        LatLng Chia = new LatLng(4.8612976, -74.0599286);
        // mMap.addMarker(new MarkerOptions().position(Chia).title("Chia").snippet("Ciudad").icon(BitmapDescriptorFactory.fromResource(R.drawable.ciudad)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Chia,15));
        mMap.getUiSettings().setZoomControlsEnabled(true);

        LatLng BacaTeatro = new LatLng(4.875319, -74.041768);
        //mMap.addMarker(new MarkerOptions().position(BacaTeatro).title("Baca Teatro").snippet("Teatro").icon(BitmapDescriptorFactory.fromResource(R.drawable))
        mMap.addMarker(new MarkerOptions().position(BacaTeatro).title("Baca Teatro").snippet("Teatro").icon(BitmapDescriptorFactory.fromResource(R.drawable.zacatecas)));

        LatLng SpaLuzMarinaYepes = new LatLng(4.863698, -74.049677);
        mMap.addMarker(new MarkerOptions().position(SpaLuzMarinaYepes).title("Spa Luz Marina Yepes").snippet("Spa").icon(BitmapDescriptorFactory.fromResource(R.drawable.spa)));

        LatLng EsteticaySaludEsteticaMedicaSpaChia = new LatLng( 4.863099,  -74.058089);
        mMap.addMarker(new MarkerOptions().position(EsteticaySaludEsteticaMedicaSpaChia).title("Estetica y Salud Estetica Medica Spa Chia").snippet("Spa").icon(BitmapDescriptorFactory.fromResource(R.drawable.spa)));

        LatLng EternalInstitute = new LatLng(4.863446, -74.043575);
        mMap.addMarker(new MarkerOptions().position(EternalInstitute).title("Eternal Institute").snippet("spa").icon(BitmapDescriptorFactory.fromResource(R.drawable.spa)));

        LatLng AguaBendita = new LatLng( 4.861264, -74.059628);
        mMap.addMarker(new MarkerOptions().position(AguaBendita).title("Agua Bendita").snippet("cafe").icon(BitmapDescriptorFactory.fromResource(R.drawable.cafe)));

        LatLng CaféFrances = new LatLng( 4.861784 ,  -74.060499);
        mMap.addMarker(new MarkerOptions().position(CaféFrances).title("Café Frances").snippet("cafe").icon(BitmapDescriptorFactory.fromResource(R.drawable.cafe)));

        LatLng Campanario = new LatLng( 4.861018 ,  -74.060569);
        mMap.addMarker(new MarkerOptions().position(Campanario).title("Campanario").snippet("cafe").icon(BitmapDescriptorFactory.fromResource(R.drawable.cafe)));

        LatLng BreadBakeryPanaderíaArtesanal = new LatLng( 4.865709, -74.043739);
        mMap.addMarker(new MarkerOptions().position(BreadBakeryPanaderíaArtesanal).title("Ika's Bread Bakery Panadería Artesanal").snippet("cafe").icon(BitmapDescriptorFactory.fromResource(R.drawable.cafe)));

        LatLng BarKaraokeSamoad = new LatLng( 4.862287 ,  -74.044009 );
        mMap.addMarker(new MarkerOptions().position(BarKaraokeSamoad ).title("Bar Karaoke Samoad").snippet("bar").icon(BitmapDescriptorFactory.fromResource(R.drawable.bar)));

        LatLng BarCarlitos = new LatLng( 4.864758  , -74.050918  );
        mMap.addMarker(new MarkerOptions().position(BarCarlitos ).title("Bar Carlitos").snippet("bar").icon(BitmapDescriptorFactory.fromResource(R.drawable.bar)));

        LatLng BarLasTablitas = new LatLng(  4.855392  , - 74.026684  );
        mMap.addMarker(new MarkerOptions().position(BarLasTablitas ).title("Bar las tablitas").snippet("bar").icon(BitmapDescriptorFactory.fromResource(R.drawable.bar)));

        LatLng BarElPorvenir = new LatLng( 4.861189  ,  -74.059040);
        mMap.addMarker(new MarkerOptions().position(BarElPorvenir).title("Bar el Porvenir").snippet("bar").icon(BitmapDescriptorFactory.fromResource(R.drawable.bar)));

        LatLng HaciendaCasaStone  = new LatLng( 4.847622   ,  -74.064859  );
        mMap.addMarker(new MarkerOptions().position(HaciendaCasaStone ).title("Hacienda Casa Stone ").snippet("Turismo alternativo").icon(BitmapDescriptorFactory.fromResource(R.drawable.alternativo)));

        LatLng LacasadelLago = new LatLng( 4.913486   ,  -73.995733  );
        mMap.addMarker(new MarkerOptions().position(LacasadelLago).title("La casa del lago").snippet("Turismo alternativo").icon(BitmapDescriptorFactory.fromResource(R.drawable.alternativo)));

        LatLng HaciendaSidonia = new LatLng( 4.862734   ,  -74.067185  );
        mMap.addMarker(new MarkerOptions().position(HaciendaSidonia ).title("Hacienda Sidonia").snippet("Turismo alternativo").icon(BitmapDescriptorFactory.fromResource(R.drawable.alternativo)));

        LatLng LaMontañadelOso = new LatLng( 4.824452    ,  -74.014173   );
        mMap.addMarker(new MarkerOptions().position(LaMontañadelOso).title("La Montaña del Oso").snippet("Turismo alternativo").icon(BitmapDescriptorFactory.fromResource(R.drawable.alternativo)));

        LatLng CastilloMarroquin = new LatLng( 4.862366    ,  -74.026565   );
        mMap.addMarker(new MarkerOptions().position(CastilloMarroquin ).title("Castillo Marroquin").snippet("Turismo alternativo").icon(BitmapDescriptorFactory.fromResource(R.drawable.alternativo)));


    }
}
