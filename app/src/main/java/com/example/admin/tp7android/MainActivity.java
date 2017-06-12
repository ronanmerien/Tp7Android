package com.example.admin.tp7android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ResponseActivity.class);
                intent.putExtra("param", "Je viens du bouton2");
                startActivity(intent);
            }
        });
    }

    public void onClick2(View view) {
        Intent intent = new Intent(MainActivity.this,ResponseActivity.class);
        intent.putExtra("param", "Je viens du bouton1");
        startActivity(intent);
    }
}
