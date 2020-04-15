package com.example.chucknorrisassignment;

import Helper.Helper;
import Models.ChuckNorris;
import Models.Value;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ThemedSpinnerAdapter;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private String API_URL = "https://api.chucknorris.io/jokes/random";

    Button btnJoke;
    TextView txtJoke;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtJoke = (TextView)findViewById(R.id.txtJoke);
        btnJoke = (Button)findViewById(R.id.btnJoke);

        btnJoke.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
startActivity(new Intent(MainActivity.this,jokesActivity.class));
                                       }}   ) ;
    }
}
