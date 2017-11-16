package com.company.ox.petshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class Tela_Cadastro_Pet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro_pet);

        Switch cadastroupet = (Switch) findViewById(R.id.switch1);

        cadastroupet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela_Cadastro_Pet.this,Tela_Cadastro.class);
                startActivity(intent);
                Toast.makeText(Tela_Cadastro_Pet.this, "Cadastrado", Toast.LENGTH_SHORT).show();
            }

        });

    }
}
