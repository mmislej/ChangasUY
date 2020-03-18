package com.test.changasuy.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.test.changasuy.R;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TrabajosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabajos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fabAddBoard);
        showAlertForCreatingBoard("title", "message");

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    private void showAlertForCreatingBoard(String title, String message){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        if (title!= null) builder.setTitle(title);
        if (message != null) builder.setTitle(message);

        View viewInflated = LayoutInflater.from(this).inflate(R.layout.dialog_create_board, null);
        builder.setView(viewInflated);

        final EditText input = (EditText) viewInflated.findViewById(R.id.editTextNewBoard);

        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String boardName = input.getText().toString().trim();
                if(boardName.length()> 0)
                    createNewBoard(boardName);
                    else
                        Toast.makeText(getApplicationContext(), "El nombre es requerido para crear un nuevo trabajo", Toast.LENGTH_SHORT).show();

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void createNewBoard(String boardName) {
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

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}