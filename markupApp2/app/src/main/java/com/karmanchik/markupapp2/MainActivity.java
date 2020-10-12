package com.karmanchik.markupapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSend;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextId);
        btnSend = findViewById(R.id.sendButtonId);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onClick(View view) {
                if(editText.getText() != null) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    intent.putExtra("textView", editText.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Введите что-нибудь",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    public EditText getEditText() {
        return editText;
    }

    public void setEditText(EditText editText) {
        this.editText = editText;
    }

    public Button getBtnSend() {
        return btnSend;
    }

    public void setBtnSend(Button btnSend) {
        this.btnSend = btnSend;
    }
}