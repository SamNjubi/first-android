package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.name);
        EditText password = findViewById(R.id.password);
        Button buttonLogin = findViewById(R.id.loginButton);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, LoginActivity.class);
                startActivity(loginIntent);
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("password")){
                    Toast.makeText(getApplicationContext(), "Successful login. Redirecting ...", Toast.LENGTH_SHORT).show();         //correcct password
                }else{
                    Toast.makeText(getApplicationContext(), "Incorrect credentials, please try again", Toast.LENGTH_SHORT).show();         //correcct password
                }
            }
        });

//        Spinner planets_dropdown = findViewById(R.id.spinner1);
//        String[] planets_array = new String[] {
//                "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Jupiter"
//        };
//
//        ArrayAdapter<String> planet_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, planets_array);
//        planets_dropdown.setPrompt("Select Planet");
//        planets_dropdown.setAdapter(planet_adapter);
//
//        Spinner countries_dropdown = findViewById(R.id.spinner2);
//        String[] countries_array = new String[] {
//                "Kenya", "Uganda", "Tanzania", "Somalia", "Sudan", "Ethiopia"
//        };
//        ArrayAdapter<String> countries_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, countries_array);
//        countries_dropdown.setPrompt("Select Country");
//        countries_dropdown.setAdapter(countries_adapter);
//
//        TextView label = findViewById(R.id.label1id);
//        label.setText(R.string.label1);

    }
}