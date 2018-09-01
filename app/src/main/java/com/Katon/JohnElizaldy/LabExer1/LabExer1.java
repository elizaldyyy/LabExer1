package com.Katon.JohnElizaldy.LabExer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LabExer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_exer1);

        Button pressButton = (Button) findViewById(R.id.PressButton);
        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView TextView2 = (TextView) findViewById(R.id.TextView2);
                final TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);
                for (int i = 0; i<=19; i++){
                    if ((i % 2) == 0){
                        ResultTextView.append(i + ", ");
                    }

                }
            }
        });
    }
}

