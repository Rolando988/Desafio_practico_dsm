package sv.edu.udb.ejercicio_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner opciones;

    EditText txtName1, txthoras1, txtName2, txthoras2, txtName3, txthoras3;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName1 = findViewById(R.id.txtName1);
        txthoras1 = findViewById(R.id.txthoras1);
        txtName2 = findViewById(R.id.txtName2);
        txthoras2 = findViewById(R.id.txthoras2);
        txtName3 = findViewById(R.id.txtName3);
        txthoras3 = findViewById(R.id.txthoras3);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener((v) -> {
            String name1 = txtName1.getText().toString();
            String horas1 = txthoras1.getText().toString();
            String name2 = txtName1.getText().toString();
            String horas2 = txthoras1.getText().toString();
            String name3 = txtName1.getText().toString();
            String horas3 = txthoras1.getText().toString();
            if (!name1.equals("") && !horas1.equals("") && !name2.equals("") && !horas2.equals("") && !name3.equals("") && !horas3.equals("")) {

                if (!isNumeric(name1)) {
                    Toast toastMessage = Toast.makeText(this, " Solo ingresar  valor numérico", Toast.LENGTH_LONG);
                    toastMessage.show();
                }
                else if (!isNumeric(name2)) {
                    Toast toastMessage = Toast.makeText(this, " Solo ingresar  valor numérico", Toast.LENGTH_LONG);
                    toastMessage.show();
                }
                else if (!isNumeric(name3)) {
                    Toast toastMessage = Toast.makeText(this, " Solo ingresar  valor numérico", Toast.LENGTH_LONG);
                    toastMessage.show();
                }
                else if(Double.parseDouble(horas1) <= 0.0) {
                    Toast toastMessage = Toast.makeText(this,"Los años deben ser mayor a cero",Toast.LENGTH_LONG);
                    toastMessage.show();
                }
            }


        });
        opciones = (Spinner) findViewById(R.id.cargo_spin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item);
        opciones.setAdapter(adapter);
    }


    public static boolean isNumeric(String string) {
        boolean result;
        try {
            Double.parseDouble(string);
            result = true;
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }
}



