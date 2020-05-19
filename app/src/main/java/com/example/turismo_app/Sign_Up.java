package com.example.turismo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sign_Up extends AppCompatActivity {

    private Button createAccount;
    private EditText name, email,mobile,nationality,username,password;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);

        init();

        click();
    }

    private void init(){
        createAccount = findViewById(R.id.signUp_CreateAccount);
        name = findViewById(R.id.signUp_Name);
        email = findViewById(R.id.signUp_EmailName);
        mobile = findViewById(R.id.signUp_MobileNumber);
        nationality = findViewById(R.id.signUp_Nationality);
        username = findViewById(R.id.signUp_UserName);
        password = findViewById(R.id.signUp_Password);


    }


    private void click(){
        createAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Create_UserAccount cua = new Create_UserAccount(name,email,mobile,nationality,username,password,Sign_Up.this);

                cua.execute();
            }
        });

    }
}
