package com.my.bmical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button c1;
    TextView a1, b1, d1, e1;
    EditText a2, b2;

    float hight, weight, n = 1, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1.findViewById(R.id.a1);
        a2.findViewById(R.id.a2);
        b1.findViewById(R.id.b1);
        c1.findViewById(R.id.c1);
        d1.findViewById(R.id.d1);
        e1.findViewById(R.id.e1);
        b2.findViewById(R.id.b2);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hight = Float.parseFloat(a1.getText().toString());
                weight = Float.parseFloat(b1.getText().toString());

                float h = hight / 100;
                res = weight / (h * h);

                e1.setText(""+res);
            }
        });
    }
}