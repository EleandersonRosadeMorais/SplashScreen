package br.ulbra.SplashScreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textViewMessage;
    private Button buttonChangeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMessage = findViewById(R.id.textViewMessage);
        buttonChangeText = findViewById(R.id.buttonChangeText);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewMessage.setText("Texto modificado!");
            }
        });
    }
}
