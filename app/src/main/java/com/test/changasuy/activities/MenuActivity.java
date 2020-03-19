package com.test.changasuy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.test.changasuy.R;

public class MenuActivity extends AppCompatActivity {

    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_1 = (Button) findViewById(R.id.buttonPersonal);
        btn_2 = (Button) findViewById(R.id.buttonTrabajos);
        btn_3 = (Button) findViewById(R.id.buttonPostulados);
        btn_4 = (Button) findViewById(R.id.buttonReferencias);
        btn_5 = (Button) findViewById(R.id.buttonConfiguracion);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PersonalActivity.class);
                startActivity(intent);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, TrabajosActivity.class);
                startActivity(intent);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PostuladosActivity.class);
                startActivity(intent);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ReferenciasActivity.class);
                startActivity(intent);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ConfiguracionActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuprincipal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                Toast.makeText(getApplicationContext(),"Buscar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.configuracion:
                Toast.makeText(getApplicationContext(),"Configuracion",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,ConfiguracionActivity.class));
                return super.onOptionsItemSelected(item);
            case R.id.menu:
                Toast.makeText(getApplicationContext(),"Menu",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,MenuActivity.class));
                return super.onOptionsItemSelected(item);
            case R.id.personal:
                Toast.makeText(getApplicationContext(),"Área Personal",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,PersonalActivity.class));
                return super.onOptionsItemSelected(item);
            case R.id.trabajos:
                Toast.makeText(getApplicationContext(),"Mis Trabajos",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,TrabajosActivity.class));
                return super.onOptionsItemSelected(item);
            case R.id.compartir:
                Toast.makeText(getApplicationContext(),"Compartir",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.acerca_de:
                Toast.makeText(getApplicationContext(),"Acerca de",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ayuda:
                Toast.makeText(getApplicationContext(),"Ayuda",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.cerrar:
                startActivity(new Intent(this,LoginActivity.class));
                finishAffinity();
                return super.onOptionsItemSelected(item);


            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
