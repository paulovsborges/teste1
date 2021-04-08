package com.devpb.teste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewHolder mView = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mView.editValue = findViewById(R.id.edit_value);
        this.mView.textDolar = findViewById(R.id.text_dolar);
        this.mView.editDolar = findViewById(R.id.edit_dolar);
        this.mView.buttonCalculate = findViewById(R.id.calculate);

        this.mView.buttonCalculate.setOnClickListener(this);


        this.clearValues();
    }

    private void clearValues() {
        this.mView.textDolar.setText("");



    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.calculate) ;
        String value = this.mView.editValue.getText().toString();
        String dolar = this.mView.editDolar.getText().toString();

        if ("".equals(value)) {
            Toast.makeText(this, this.getString(R.string.informe_valor), Toast.LENGTH_LONG).show();
        } else {
            Double real = Double.valueOf(value);
            Double cota = Double.valueOf(dolar);
            this.mView.textDolar.setText(String.format("$" + " %.2f", (real / cota)));

        }

    }


    private static class ViewHolder {
        EditText editValue;
        TextView textDolar;
        EditText editDolar;
        Button buttonCalculate;

    }
}