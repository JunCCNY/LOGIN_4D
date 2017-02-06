package com.example.vaiojun.login_4d.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vaiojun.login_4d.R;

/**
 * Created by VaioJun on 01/31/2017.
 */

public class LoginActivity extends AppCompatActivity{

    private EditText userName;
    private EditText passWord;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText) findViewById(R.id.input_user);
        passWord = (EditText) findViewById(R.id.input_password);
        login = (Button) findViewById(R.id.btn_login);

    }
}
