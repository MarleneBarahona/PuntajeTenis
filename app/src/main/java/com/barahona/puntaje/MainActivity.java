package com.barahona.puntaje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView punt1A;
    private int contador1A;
    private TextView punt2A;
    private int contador2A;
    private TextView punt1B;
    private int contador1B;
    private TextView punt2B;
    private int contador2B;
    private int auxA;
    private int auxB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        punt1A = findViewById(R.id.puntaje1A);
        contador1A = 0;
        punt1B = findViewById(R.id.puntaje1B);
        contador1B = 0;
        punt2A = findViewById(R.id.puntaje2A);
        contador2A = 0;
        punt2B = findViewById(R.id.puntaje2B);
        contador2B = 0;
        auxA = 0;
        auxB = 0;
    }
    public void sumarUnPuntoA(View view){
        contador1A++;
        punt1A.setText(contador1A+"");
    }
    public void agregarPuntosA(View view){
        if(contador2A == 0){
            contador2A = 15;
            punt2A.setText(contador2A+"");
            auxA++;
        }else if(contador2A == 15){
            contador2A = 30;
            punt2A.setText(contador2A+"");
            auxA++;
        }else if(contador2A == 30){
            contador2A = 40;
            punt2A.setText(contador2A+"");
            auxA++;
        }else if((contador2A == 40) & (contador2B != 40)){
            contador1A++;
            contador2A = 0;
            contador2B = 0;
            punt1A.setText(contador1A+"");
            punt2A.setText(contador2A+"");
            punt2B.setText(contador2B+"");
        }else if((contador2A == 40) & (contador2B == 40)){
            if(auxA == 3){
                punt2A.setText("A");
                auxA =0;
            }else{
                contador1A++;
                contador2A = 0;
                contador2B = 0;
                punt1A.setText(contador1A+"");
                punt2A.setText(contador2A+"");
                punt2B.setText(contador2B+"");
                auxA = 0;
            }
            Log.d("Mensaje", "Si entra");
        }
    }
    public void sumarUnPuntoB(View view){
        contador1B++;
        punt1B.setText(contador1B+"");
    }
    public void agregarPuntosB(View view){
        if(contador2B == 0){
            contador2B = 15;
            punt2B.setText(contador2B+"");
            auxB++;
        }else if(contador2B == 15){
            contador2B = 30;
            punt2B.setText(contador2B+"");
            auxB++;
        }else if(contador2B == 30){
            contador2B = 40;
            punt2B.setText(contador2B+"");
            auxB++;
        }else if((contador2A != 40) & (contador2B == 40)){
            contador1B++;
            contador2A = 0;
            contador2B = 0;
            punt1B.setText(contador1B+"");
            punt2A.setText(contador2A+"");
            punt2B.setText(contador2B+"");
        }else if((contador2A == 40) & (contador2B == 40)){
            if(auxB == 3) {
                punt2B.setText("A");
                auxB = 0;
            }else{
                contador1B++;
                contador2A = 0;
                contador2B = 0;
                punt1B.setText(contador1B+"");
                punt2A.setText(contador2A+"");
                punt2B.setText(contador2B+"");
                auxB = 0;
            }
        }
    }
    public void reset(View view){
        contador1B = 0;
        contador1A = 0;
        punt1A.setText(contador1A+"");
        punt1B.setText(contador1B+"");
        contador2B = 0;
        contador2A = 0;
        punt2A.setText(contador2A+"");
        punt2B.setText(contador2B+"");
    }
}
