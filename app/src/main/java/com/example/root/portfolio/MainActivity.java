package com.example.root.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button movieButton;
    Button hawkButton;
    Button buildButton;
    Button materialButton;
    Button goButton;
    Button capstoneButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieButton = (Button) findViewById(R.id.movie);
        movieButton.setText(getResources().getString(R.string.movie_app));
        movieButton.setOnClickListener(this);
        hawkButton = (Button) findViewById(R.id.hawk);
        hawkButton.setText(getResources().getString(R.string.stock_app));
        hawkButton.setOnClickListener(this);
        buildButton = (Button) findViewById(R.id.build);
        buildButton.setText(getResources().getString(R.string.build_app));
        buildButton.setOnClickListener(this);
        materialButton  = (Button) findViewById(R.id.material);
        materialButton.setText(getResources().getString(R.string.material_app));
        materialButton.setOnClickListener(this);
        goButton = (Button) findViewById(R.id.go);
        goButton.setText(getResources().getString(R.string.go_app));
        goButton.setOnClickListener(this);
        capstoneButton = (Button) findViewById(R.id.capstone);
        capstoneButton.setText(getResources().getString(R.string.capstone_app));
        capstoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        String text = b.getText().toString();
        showToast(view,text);
    }

    public void showToast(View view,String text){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
}
