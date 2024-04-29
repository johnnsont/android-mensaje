package com.example.mensajes;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChatActivity extends AppCompatActivity {
    EditText txtChat;
    TextView txtMensaje;
    String usuario;
    TextView tvTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtChat= findViewById(R.id.txtChat);
        txtChat.setText("");
        usuario = getIntent().getStringExtra("nombre");
        tvTitulo=findViewById(R.id.txtTitulo);
        tvTitulo.setText(usuario);

    }

    public void buttonPress(View view) {
        txtMensaje = findViewById(R.id.txtMensaje);
        String mensajeString = txtMensaje.getText().toString();
        String textoActual = txtChat.getText().toString();
        String nuevoTexto = textoActual + "\n" + mensajeString;
        txtChat.setText(nuevoTexto);
        txtMensaje.setText("");
    }
        }


