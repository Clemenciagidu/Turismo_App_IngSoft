package com.example.turismo_app;

import android.content.Context;
import android.widget.Toast;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {

    public static Connection connect(Context context){
        try{
            Connection conn = null;

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://10.0.2.2/turismo_app", "root", "");
            System.out.println("Base de Datos Conectada");

            return conn;
        } catch (Exception e){
            Toast.makeText(context, e.getMessage(),Toast.LENGTH_SHORT).show();
        }

        return null;

    }
}
