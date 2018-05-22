package com.taruc.activityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    //declare view
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button= findViewById(R.id.button2);
        editText= findViewById(R.id.editText);

        //set listener to button
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        //grab text formeditText
        String message=editText.getText().toString();
        Intent intent= new Intent();
        intent.putExtra("key",message);

        setResult(0,intent);
        finish();

    }
}
