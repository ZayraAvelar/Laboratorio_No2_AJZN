package com.example.laboratorio_no2_ajzn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private TextView nombreVehiculo;
    private ImageView imagenVehiculo;
    private TextView informacionVehiculo;
    private Button botonAnterior;

    private Button botonSiguiente;

    private ImageView imageVehiculo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreVehiculo = (TextView) findViewById(R.id.vehiculo_bmw);
        imagenVehiculo = (ImageView) findViewById(R.id.imageView);
        informacionVehiculo = (TextView) findViewById(R.id.informacion);
        botonAnterior = (Button) findViewById(R.id.botonAnterior);
        botonSiguiente = (Button) findViewById(R.id.botonSiguiente);

        botonSiguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                nombreVehiculo.setText(R.string.nissan);
                informacionVehiculo.setText(R.string.informacionNissan);
                imagenVehiculo.setImageResource(R.drawable.nissan);
            }
        });

        botonAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreVehiculo.setText(R.string.bmw);
                informacionVehiculo.setText(R.string.informacionBmw);
                imagenVehiculo.setImageResource(R.drawable.bmw);
            }
        });

    }



}