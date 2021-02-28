package sv.edu.udb.ejercicio_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void calcular(View v){

        double x1, x2;

        EditText CoeficienteA = (EditText)findViewById(R.id.txtCoeficienteA);
        EditText CoeficienteB = (EditText)findViewById(R.id.txtCoeficienteB);
        EditText CoeficienteC = (EditText)findViewById(R.id.txtCoeficienteC);
        TextView Resultado = (TextView) findViewById(R.id.lblResultado);

        double a = Double.parseDouble(CoeficienteA.getText().toString());
        double b = Double.parseDouble(CoeficienteB.getText().toString());
        double c = Double.parseDouble(CoeficienteC.getText().toString());

        double d = ((b*b)-4*a*c);

        if(d<0){
            Resultado.setText("No existen soluciones reales");
        }
        else{

            x1 = ( -b + Math.sqrt(d))/(2*a);

            x2 = ( -b - Math.sqrt(d))/(2*a);

            Resultado.setText("Solución X1: " +x1 + "\n Solución X2: "+x2);


        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}