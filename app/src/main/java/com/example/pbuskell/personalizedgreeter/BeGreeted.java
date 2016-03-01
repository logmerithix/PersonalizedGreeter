package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {

    String strFirstName = "";
    String strLastName = "";
    String strTitleName = "";

    Button btnGreetMe;
    EditText edtxtFirstNameField;
    TextView txtvwGreetingSpace;
    EditText edtxtLastNameField;
    EditText edtxtTitleNameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtFirstNameField = (EditText) findViewById(R.id.edtxtFirstNameField);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
        edtxtLastNameField = (EditText) findViewById(R.id.edtxtLastNameField);
        edtxtTitleNameField = (EditText) findViewById(R.id.edtxtTitleNameField);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strFirstName = edtxtFirstNameField.getText().toString();
        strLastName = edtxtLastNameField.getText().toString();
        strTitleName = edtxtTitleNameField.getText().toString();

        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), strTitleName, strFirstName, strLastName));
    }
}
