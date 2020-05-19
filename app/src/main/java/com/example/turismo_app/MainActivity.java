package com.example.turismo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout first,second;

    private Button registerUser;

    private Button visitPlacesRestaurants;

    private Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            first.setVisibility(View.VISIBLE);
            second.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (RelativeLayout) findViewById(R.id.login_secondRlayout);
        second = (RelativeLayout) findViewById(R.id.login_RLayoutBotton);

        handler.postDelayed(runnable, 3000);

        registerUser = (Button) findViewById(R.id.login_RegisterUser);
        click();

        visitPlacesRestaurants = (Button) findViewById(R.id.login_VisitPlacesRestaurants);
        //click2();

    }

    private void click() {
        registerUser.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Sign_Up.class);
                startActivity(intent);
            }
        });

    }

    private void click2() {

        visitPlacesRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Looking_For.class);
                startActivity(intent);
            }
        });
    }
}
