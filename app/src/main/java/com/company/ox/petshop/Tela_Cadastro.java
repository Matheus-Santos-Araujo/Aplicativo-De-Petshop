package com.company.ox.petshop;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tela_Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro);

        FloatingActionButton cadastropet = (FloatingActionButton) findViewById(R.id.cadastropet_FBTtelaCadastro);

        cadastropet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Tela_Cadastro.this,Tela_Cadastro_Pet.class);
                startActivity(intent1);
                Toast.makeText(Tela_Cadastro.this, "Cadastro Pets...", Toast.LENGTH_SHORT).show();
            }

        });

    } /*Button envia_cadastro = (Button) findViewById(R.id.BTenvia_cadastro);
        envia_cadastro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Tela_Cadastro.this,.class);
            startActivity(intent);
            Toast.makeText(Tela_Cadastro.this, "Quem somos nós...", Toast.LENGTH_SHORT).show();

        }

    });**/
}
