package com.test.changasuy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.test.changasuy.R;

public class LoginActivity extends AppCompatActivity {

    private Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn = (Button) findViewById(R.id.buttonLogin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = ((EditText) findViewById(R.id.editTextUser)).getText().toString();
                String password = ((EditText) findViewById(R.id.editTextPassword)).getText().toString();
                if (usuario.equals("user") && password.equals("user"))
                {
                    Intent intent = new Intent(LoginActivity.this, PersonalActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña Incorrectos", Toast.LENGTH_SHORT).show();
                }

            }


        });


    }

}
