package com.claytoneduard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageView ;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageView = findViewById(R.id.imageViewResultado);
        btnVoltar = findViewById(R.id.buttonVoltar);

        //recuperar os dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");
        if(numero == 0){
            imageView.setImageResource(R.drawable.moeda_cara);
        }else{
            imageView.setImageResource(R.drawable.moeda_coroa);
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   finish();
            }
        });
    }
}