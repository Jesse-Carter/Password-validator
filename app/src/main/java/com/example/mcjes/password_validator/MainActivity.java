package com.example.mcjes.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText input = (EditText) findViewById(R.id.editText);
        final Button button = (Button) findViewById(R.id.button);
        final TextView output= (TextView) findViewById(R.id.textView);
        final passwordValidator check=new passwordValidator();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                check.setPassword(input.getText().toString());
                if (check.check_password()>=3)
                    output.setText(check.check_password()+"! Your password is strong enough!");
                else
                    output.setText(check.check_password()+"! Your password is not strong enough!");
            }

        });
    }
}
