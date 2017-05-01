package com.example.diehard.iakejar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView mTextView;
    Button mButton1;
    Button mButton2;
    Button mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTextView = (TextView)findViewById(R.id.text);
        mButton1 = (Button) findViewById(R.id.btnDown);
        mButton2 = (Button) findViewById(R.id.btnUp);
        mButton3 = (Button) findViewById(R.id.reset);

        mButton1.setOnClickListener(clickListener);
        mButton2.setOnClickListener(clickListener);
        mButton3.setOnClickListener(clickListener);

    }
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnDown:
                    String mins=mTextView.getText().toString();
                    int min =Integer.valueOf(mins);
                    min -=1;
                    mins =String.valueOf(min);
                    mTextView.setText(mins);
                    break;

                case R.id.btnUp:
                    String sums=mTextView.getText().toString();
                    int sum =Integer.valueOf(sums);
                    sum +=1;
                    sums =String.valueOf(sum);
                    mTextView.setText(sums);
                    break;

                case R.id.reset:
                    mTextView.setText("0");
                    break;
                default:
                    break;
            }
        }
    };
}
