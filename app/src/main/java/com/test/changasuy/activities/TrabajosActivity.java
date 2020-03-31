package com.test.changasuy.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.test.changasuy.R;
import com.test.changasuy.models.Trabajo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

import io.realm.Realm;


public class TrabajosActivity extends AppCompatActivity {
    private Realm realm;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabajos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = (FloatingActionButton) findViewById(R.id.fabAddBoard);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showAlertForCreatingBoard("Agrega nuevo Trabajo", "Crea tu nueva solicitud de trabajo");
            }
        });

        realm = Realm.getDefaultInstance();
        
        


    }

    private void createNewBoardTrabajo(String setearTitulo, String setearDescripcion, String setearlimiteHorario1,  String setearlimiteHorario2, String setearsalario,
                                       String setearfechaInicio, String setearfechaFinal) {

        realm.beginTransaction();
        Trabajo trabajo = new Trabajo(setearTitulo, setearDescripcion, setearlimiteHorario1, setearlimiteHorario2, setearsalario,
                setearfechaInicio, setearfechaFinal);
        realm.copyToRealm(trabajo);
        realm.commitTransaction();
    }
    private void createNewBoardPostulado(){

    }
    private void showAlertForCreatingBoard(String titulo, String message){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        if (titulo!= null) builder.setTitle(titulo);
        if (message != null) builder.setTitle(message);

        View viewInflated = LayoutInflater.from(this).inflate(R.layout.dialog_create_board, null);
        builder.setView(viewInflated);

        final EditText inputTitulo = (EditText) viewInflated.findViewById(R.id.editTextNewBoardTitulo);
        final EditText inputDescripcion = (EditText) viewInflated.findViewById(R.id.editTextNewBoardTitulo);
        final EditText inputLimiteHorario1 = (EditText) viewInflated.findViewById(R.id.editTextNewBoardTitulo);
        final EditText inputLimiteHorario2 = (EditText) viewInflated.findViewById(R.id.editTextNewBoardTitulo);
        final EditText inputSalario = (EditText) viewInflated.findViewById(R.id.editTextNewBoardTitulo);
        final EditText inputFechaInicio = (EditText) viewInflated.findViewById(R.id.editTextNewBoardTitulo);
        final EditText inputFechaFinal = (EditText) viewInflated.findViewById(R.id.editTextNewBoardTitulo);

        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String setearTitulo = inputTitulo.getText().toString().trim();
                String setearDescripcion = inputDescripcion.getText().toString().trim();
                String setearLimiteHorario1 = inputLimiteHorario1.getText().toString().trim();
                String setearLimiteHorario2 = inputLimiteHorario2.getText().toString().trim();
                String setearSalario = inputSalario.getText().toString().trim();
                String setearFechaInicio = inputFechaInicio.getText().toString().trim();
                String setearFechaFinal = inputFechaFinal.getText().toString().trim();
                if(setearTitulo.length()> 0) {
                    createNewBoardTrabajo(setearTitulo, setearDescripcion, setearLimiteHorario1, setearLimiteHorario2, setearSalario,
                            setearFechaInicio, setearFechaFinal);
                    createNewBoardPostulado();
                }
                else
                        Toast.makeText(getApplicationContext(), "El nombre es requerido para crear un nuevo trabajo", Toast.LENGTH_SHORT).show();

            }

        });

        AlertDialog dialog = builder.create();
        dialog.show();
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