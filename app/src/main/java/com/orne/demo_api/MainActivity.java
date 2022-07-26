package com.orne.demo_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewLogin;
    private  TextView textViewName;
    private  TextView textViewId;
    private EditText editTextIdentifiant;
    private ProgressBar progressBar;
    private Button buttonseconecte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initilisation();
        setEcouteurEvenement();


    }
    private void setEcouteurEvenement(){
      buttonseconecte.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String idText = editTextIdentifiant.getText().toString();
              if(idText.isEmpty()){
                  Toast.makeText(MainActivity.this, "le champs ne peut etre vide", Toast.LENGTH_SHORT).show();
              }else{
                  int id = Integer.parseInt(idText);
                  recupererGitHubUser(id);
              }
          }
      });
    }
    private void recupererGitHubUser(int id){
        progressBar.setVisibility(View.VISIBLE);
    }
    private void initilisation(){
        textViewLogin = findViewById(R.id.login);
        textViewName = findViewById(R.id.name);
        textViewId = findViewById(R.id.id);
        editTextIdentifiant = findViewById(R.id.identifier);
        buttonseconecte = findViewById(R.id.connecter);
        progressBar = findViewById(R.id.progresbar);
    }

}