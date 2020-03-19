package com.test.changasuy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.test.changasuy.R;

public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
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
