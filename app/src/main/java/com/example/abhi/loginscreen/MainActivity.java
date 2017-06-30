package com.example.abhi.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private EditText email;
    private EditText password;
    static String Bundle = "Bundle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

    }
    public void click(View v){
        String em = email.getText().toString();
        String ps = password.getText().toString();
        if(em.trim().isEmpty()){
            email.setError("Enter email");
        }
        else if (ps.trim().isEmpty()){
            password.setError("Enter Password");
        }
        else{
            Toast.makeText(getApplicationContext(), "Verifying", Toast.LENGTH_SHORT).show();
            if((em.equals("arpithagr@gmail.com" ))&& ps.equals("rocking")){
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(Bundle,email.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }else{
                Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
