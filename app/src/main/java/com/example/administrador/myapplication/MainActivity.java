package com.example.administrador.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.administrador.myapplication.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayLogin(View view){
        Intent intent = new Intent(this, Login.class);
        EditText textUser = (EditText) findViewById(R.id.txt_user);
        EditText textPass = (EditText) findViewById(R.id.txt_pass);
        EditText textCode = (EditText) findViewById(R.id.txt_code);

        String usuario = textUser.getText().toString();
        String contrasena = textPass.getText().toString();
        String codigo = textCode.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, "Tu usuario es: " +usuario + ", contraseña: " + contrasena + ", y tu codigo: " +codigo);
        startActivity(intent);


    }

}
