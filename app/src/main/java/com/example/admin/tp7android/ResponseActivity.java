package com.example.admin.tp7android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);

        Intent intent = getIntent();
        String text = intent.getStringExtra("param");
        TextView editText = (TextView) findViewById(R.id.textView2);
        editText.setText(text);
    }

    public void onClickrepa(View view) {
        Intent intent = new Intent(ResponseActivity.this,MainActivity.class);
        intent.putExtra("param", "Je viens du bouton1");
        startActivity(intent);
    }

    public void onClickrepb(View view) {
        Intent intent = new Intent(ResponseActivity.this,MainActivity.class);
        intent.putExtra("param", "Je viens du bouton2");
        startActivity(intent);
    }
}
