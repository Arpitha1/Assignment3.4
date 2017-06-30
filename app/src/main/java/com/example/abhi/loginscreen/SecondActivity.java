package com.example.abhi.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        welcome = (TextView)findViewById(R.id.welcome);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            welcome.setTextSize(15.00f);
            welcome.setText("Welcome User: "+bundle.getString(MainActivity.Bundle));
        }
    }
}
