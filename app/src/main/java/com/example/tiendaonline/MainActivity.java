package com.example.tiendaonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText valueOne;
    private EditText valueTwo;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueOne = (EditText)findViewById(R.id.txt_Num1);
        valueTwo = (EditText)findViewById(R.id.txt_Num2);
        result = (TextView)findViewById(R.id.txt_Result);
    }

    public void sum(View view) {
        String sumOne = valueOne.getText().toString();
        String sumTwo = valueTwo.getText().toString();

        int numOne = Integer.parseInt(sumOne);
        int numTwo = Integer.parseInt(sumTwo);

        int suma = numOne + numTwo;

        String resultado = String.valueOf(suma);

        result.setText(resultado);

        Intent routerRegister = new Intent(this, RegistroActivity.class);
        startActivity(routerRegister);
    }

    // Estado de una actividad
  /*  @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }
*/

}