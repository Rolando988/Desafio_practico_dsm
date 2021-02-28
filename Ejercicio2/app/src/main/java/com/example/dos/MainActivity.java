package com.example.dos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public double numero=14,primero=0,segundo=0,tercero=0,cuarto=0;
    Button btnPrimero,btnSegundo,btnTercero,btnCuarto;
    TextView txtResolucion,txtDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPrimero=findViewById(R.id.btnPrimero);
        btnSegundo=findViewById(R.id.btnSegundo);
        btnTercero=findViewById(R.id.btnTercero);
        btnCuarto=findViewById(R.id.btnCuarto);
        txtResolucion=findViewById(R.id.txtSolucion);
        txtDatos=findViewById(R.id.txtDatos);
    }

    public void primero(View view) {
        if(numero>0){
            numero=numero-1;
            primero=primero+1;
            txtResolucion.append("1-");
            proceso();

        }else{
            btnPrimero.setVisibility(View.INVISIBLE);
            btnSegundo.setVisibility(View.INVISIBLE);
            btnTercero.setVisibility(View.INVISIBLE);
            btnCuarto.setVisibility(View.INVISIBLE);
            txtResolucion.setVisibility(View.VISIBLE);

        }

    }

    public void segundo(View view) {
        if(numero>0){
            numero=numero-1;
            segundo=segundo+1;
            txtResolucion.append("2-");
            proceso();

        }else{
            btnPrimero.setVisibility(View.INVISIBLE);
            btnSegundo.setVisibility(View.INVISIBLE);
            btnTercero.setVisibility(View.INVISIBLE);
            btnCuarto.setVisibility(View.INVISIBLE);
            txtResolucion.setVisibility(View.VISIBLE);
        }
    }

    public void tercero(View view) {
        if(numero>0){
            numero=numero-1;
            tercero=tercero+1;
            txtResolucion.append("3-");
            proceso();
        }else{
            btnPrimero.setVisibility(View.INVISIBLE);
            btnSegundo.setVisibility(View.INVISIBLE);
            btnTercero.setVisibility(View.INVISIBLE);
            btnCuarto.setVisibility(View.INVISIBLE);
            txtResolucion.setVisibility(View.VISIBLE);

        }
    }

    public void cuarto(View view) {
        if(numero>0){
            numero=numero-1;
            cuarto=cuarto+1;
            txtResolucion.append("4-");
            proceso();
        }else{
            btnPrimero.setVisibility(View.INVISIBLE);
            btnSegundo.setVisibility(View.INVISIBLE);
            btnTercero.setVisibility(View.INVISIBLE);
            btnCuarto.setVisibility(View.INVISIBLE);
            txtResolucion.setVisibility(View.VISIBLE);


        }
    }

    public void proceso(){
        txtDatos.setVisibility(View.VISIBLE);
        txtDatos.setText("candidato1: porcentaje: "+Math.round(((primero/14)*100))+"%  candidato2: porcentaje:" +Math.round(((segundo/14)*100))+"% candidato3: porcentaje:"+Math.round(((tercero/14)*100))+"% candidato4: porcentaje:"+Math.round(((cuarto/14)*100))+"%");
    }


}