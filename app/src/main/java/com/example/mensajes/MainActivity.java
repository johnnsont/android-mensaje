package com.example.mensajes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        etUsuario=findViewById(R.id.txtUsuario);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickIngresar(View view){
        Intent intent = new Intent(this, ChatActivity.class);
        String usuario = etUsuario.getText().toString();
        intent.putExtra("nombre", usuario);
        startActivity(intent);
    }


    public void onClickCancelar(View view){
        finish();
    }
    public void onClickAcercade(View view){
        Intent intent = new Intent(this,AcercadeActivity.class);
        startActivity(intent);
    }
    public void onClickEstudiante(View view) {
    Intent intent =new Intent(this,EstudianteActivity.class);
    startActivity(intent);

    }

}
