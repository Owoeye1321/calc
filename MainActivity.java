package com.tobiloba.calculator;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Double is;
    private Double or;
    private String operation;
    private int last;
    private Double total;
    private String end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final TextView value =(TextView) findViewById(R.id.value);
        final TextView result = (TextView)findViewById(R.id.result);
        final Button one =(Button)findViewById(R.id.one);
        final Button two =(Button)findViewById(R.id.two);
        final Button three =(Button)findViewById(R.id.three);
        final Button four =(Button)findViewById(R.id.four);
        final Button five =(Button)findViewById(R.id.five);
        final Button six =(Button)findViewById(R.id.six);
        final Button seven =(Button)findViewById(R.id.seven);
        final Button eight =(Button)findViewById(R.id.eight);
        final Button nine =(Button)findViewById(R.id.nine);
        final Button zero =(Button)findViewById(R.id.zero);
        final Button dbzero =(Button)findViewById(R.id.dbzero);
        final Button plus =(Button)findViewById(R.id.plus);
        final Button minus =(Button)findViewById(R.id.minus);
        final Button divide =(Button)findViewById(R.id.divide);
        final Button multiply =(Button)findViewById(R.id.multiply);
        final Button equal =(Button)findViewById(R.id.equal);
        final Button clear =(Button)findViewById(R.id.clear);
        final Button dot =(Button)findViewById(R.id.dot);


        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + one.getText());

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + two.getText());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + three.getText());
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + four.getText());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + five.getText());
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + six.getText());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + seven.getText());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + eight.getText());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + nine.getText());
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + zero.getText());
            }
        });
        dbzero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + dbzero.getText());
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText(value.getText().toString() + dot.getText());

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(value.getText().equals("")){
                    Toast.makeText(MainActivity.this, "Expected numbers", Toast.LENGTH_LONG).show();
                }else {
                    is = Double.parseDouble((String) value.getText());
                    result.setText(value.getText().toString() + plus.getText());
                    operation = "+";
                    value.setText("");
                }

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(value.getText().equals("")){
                    Toast.makeText(MainActivity.this, "Expected numbers", Toast.LENGTH_LONG).show();
                }else {
                    is = Double.parseDouble((String) value.getText());
                    result.setText(value.getText().toString() + minus.getText());
                    operation = "-";
                    value.setText("");
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (value.getText().equals("")) {
                    Toast.makeText(MainActivity.this, "Expected numbers", Toast.LENGTH_LONG).show();
                } else {
                    is = Double.parseDouble((String) value.getText());
                    result.setText(value.getText().toString() + multiply.getText());
                    operation = "*";
                    value.setText("");
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (value.getText().equals("")) {
                    Toast.makeText(MainActivity.this, "Expected numbers", Toast.LENGTH_LONG).show();
                } else {
                    is = Double.parseDouble((String) value.getText());
                    result.setText(value.getText().toString() + divide.getText());
                    operation = "/";
                    value.setText("");
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                value.setText("");
                result.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                switch(operation){
                        case("+"):
                            or = Double.parseDouble((String) value.getText());
                            total = is + or;
                            last=(int)Math.round(total);
                            end =String.valueOf(last);
                            result.setText(end);
                            value.setText(end);
                            break;
                        case("-"):
                            or = Double.parseDouble((String) value.getText());
                            total = is - or;
                            last=(int)Math.round(total);
                            end =String.valueOf(last);
                            result.setText(end);
                            value.setText(end);
                            break;
                        case("/"):
                                or = Double.parseDouble((String) value.getText());
                            total = is / or;
                            last=(int)Math.round(total);
                            end =String.valueOf(last);
                            result.setText(end);
                            value.setText(end);
                                break;
                         case("*"):
                        or = Double.parseDouble((String) value.getText());
                        total = is * or;
                             last=(int)Math.round(total);
                             end =String.valueOf(last);
                        result.setText(end);
                        value.setText(end);
                        break;
                    case(""):
                        end  = result.getText().toString();
                        result.setText(end);
                        value.setText(end);
                        break;

                }

            }
        });


    }
}