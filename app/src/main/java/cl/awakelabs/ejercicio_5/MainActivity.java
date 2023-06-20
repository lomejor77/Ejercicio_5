package cl.awakelabs.ejercicio_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        Button showToast = findViewById(R.id.buttonShowToast);
        Button counter = findViewById(R.id.buttonCounter);
        TextView textview = findViewById(R.id.textView);

        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"hello toast",Toast.LENGTH_SHORT).show();
            }
        });
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer numero = Integer.parseInt(textview.getText().toString());
                numero ++;
                textview.setText(numero.toString());
            }
        });
    }
}