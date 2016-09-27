package com.example.android.st0124.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    private EditText numberInput1;
    private EditText numberInput2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput1 = (EditText)findViewById(R.id.numberInput1);
        numberInput1.addTextChangedListener(this);

        numberInput2 = (EditText)findViewById(R.id.numberInput2);
        numberInput2.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        // テキスト変更前によばれる
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        // テキスト変更時に呼ばれる
    }

    @Override
    public void afterTextChanged(Editable s) {
        // テキスト変更後に呼ばれる
    }

}
