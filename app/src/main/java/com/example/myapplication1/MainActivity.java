package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Double firstValues, secondValues, result_op;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result_field);
    }

    public void onNumberClick(View view) throws Exception {

        try {


            switch (view.getId()) {

                case R.id.zero:

                    result.append("0");


                    break;

                case R.id.one:
                    result.append("1");
                    break;

                case R.id.two:
                    result.append("2");
                    break;

                case R.id.three:
                    result.append("3");
                    break;

                case R.id.four:
                    result.append("4");
                    break;
                case R.id.five:
                    result.append("5");
                    break;


                case R.id.six:
                    result.append("6");
                    break;
                case R.id.seven:
                    result.append("7");
                    break;
                case R.id.eight:
                    result.append("8");
                    break;
                case R.id.nine:
                    result.append("9");
                    break;

                case R.id.clear:
                    result.setText("");
                    break;


                case R.id.dot:


                    String string = (result.getText().toString()).trim();
                    if (string.length() > 0) {
                        result.setText(string + ".");

                        break;
                    }


                    break;

            }
        } catch (Exception e) {
        }
    }

    public void onOperationClick(View view) {
        try {


            switch (view.getId()) {

                case R.id.minus:
                    operation = "-";
                    firstValues = Double.valueOf(result.getText().toString());
                    result.setText(firstValues + "-");
                    break;
                case R.id.multiply:
                    operation = "*";
                    firstValues = Double.valueOf(result.getText().toString());
                    result.setText(firstValues + "*");
                    break;
                case R.id.plus:
                    operation = "+";
                    firstValues = Double.valueOf(result.getText().toString());
                    result.setText(firstValues + "+");
                    break;
                case R.id.moduloDivision:
                    operation = "/";
                    firstValues = Double.valueOf(result.getText().toString());
                    result.setText(firstValues + "/");


                case R.id.equal:
                    if (!operation.equals(null)) {
                        String two = result.getText().toString().replace(firstValues.toString() + operation.toString(), "");
                        secondValues = Double.valueOf(two);
                        if (operation == "+") {
                            result_op = firstValues + secondValues;
                            result.setText(result_op.toString());
                            operation = "+";


                        } else if (operation == "-") {
                            result_op = firstValues - secondValues;
                            result.setText(result_op.toString());
                            operation = "-";

                        } else if (operation == "*") {
                            result_op = firstValues * secondValues;
                            result.setText(result_op.toString());
                            operation = "*";


                        } else if (operation == "/") {
                            result_op = firstValues / secondValues;
                            result.setText(result_op.toString());
                            operation = "/";
                        }


                        }
                        }




                    throw new IllegalStateException("Unexpected value: " + view.getId());



            }catch(Exception c){


            }
        }


    }



