package com.devpb.teste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private ViewHolder mView = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mView.editValue = findViewById(R.id.edit_value);
        this.mView.textDolar = findViewById(R.id.text_dolar);


        this.clearValues();
    }

    private void clearValues() {
        this.mView.textDolar.setText("");

    }


    private static class ViewHolder {
        EditText editValue;
        TextView textDolar;

    }
}