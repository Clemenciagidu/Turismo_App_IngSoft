package com.example.turismo_app;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Create_UserAccount extends AsyncTask<String,String,String> {

    private String name,email,mobile,nationality,username,password;
    private Context context;

    public Create_UserAccount(EditText name, EditText email, EditText mobile, EditText nationality, EditText username, EditText password, Context context) {
        this.name = name.getText().toString();
        this.email = email.getText().toString();
        this.mobile = mobile.getText().toString();
        this.nationality = nationality.getText().toString();
        this.username = username.getText().toString();
        this.password = password.getText().toString();
        this.context = context;
    }

    protected String doInBackground(String... strings){
        Connection conn = db.connect(context);
        try {
            String sql = "insert into users_account (name,email,mobile,nationality,username,password,Status) values(?,?,?,?,?,?,?)";

            PreparedStatement pst =conn.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,email);
            pst.setString(3,mobile);
            pst.setString(4,nationality);
            pst.setString(5,username);
            pst.setString(6,password);
            pst.setString(7,"Active");
            pst.execute();
            return "Cuenta de Usuario Creada Exitosamente...";

        }catch (Exception e){
            return "Error al ingresar los Datos: "+e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
