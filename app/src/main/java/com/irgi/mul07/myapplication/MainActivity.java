package com.irgi.mul07.myapplication;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username, password;
    Button login;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.EdUsername);
        password = (EditText) findViewById(R.id.EdPassword);
        login = (Button) findViewById(R.id.BtnLogin);
        logout = (Button) findViewById(R.id.BtnLogout);
        login.setOnClickListener(this);
        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // String aksi = v.toString();

            if (v.getId() == R.id.BtnLogin) {
                String TxtUsername = username.getText().toString();
                String TxtPassword = password.getText().toString();
                Toast.makeText(getApplicationContext(),
                        "Username : " + TxtUsername + "\n" + "Password : " + TxtPassword, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "Tombol logout di klik", Toast.LENGTH_LONG) .show();
            }

    }
}