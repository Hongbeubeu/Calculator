package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonCE, buttonC, buttonBS, buttonDiv, buttonMulti, buttonAdd, buttonSub, buttonEqual,
            buttonSign, buttonDot;

    TextView textView;

    Integer mValueOne, mValueTwo;

    Boolean isClickAdd, isClickSub, isClickMulti, isClickDiv, isClick, isAfterEqual;

    protected  void clear(){
        isClickAdd = false;
        isClickSub = false;
        isClickMulti = false;
        isClickDiv = false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonCE = (Button) findViewById(R.id.btnCE);
        buttonC = (Button) findViewById(R.id.btnC);
        buttonBS = (Button) findViewById(R.id.btnBS);
        buttonDiv = (Button) findViewById(R.id.btnDiv);
        buttonMulti = (Button) findViewById(R.id.btnMulti);
        buttonAdd = (Button) findViewById(R.id.btnAdd);
        buttonSub = (Button) findViewById(R.id.btnSub);
        buttonSign = (Button) findViewById(R.id.btnSign);
        buttonDiv = (Button) findViewById(R.id.btnDiv);
        buttonEqual = (Button) findViewById(R.id.btnEqual);
        buttonDot = (Button) findViewById(R.id.btnDot);
        textView = (TextView) findViewById(R.id.txtview);

        textView.setText("0");
        isClick = false;
        clear();
        isAfterEqual = false;

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() != "0")
                    textView.setText(textView.getText() + "0");

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() != "0")
                    if (isClick == false && isAfterEqual == false)
                        textView.setText(textView.getText() + "1");
                    else {
                        textView.setText("1");
                        isClick = false;
                    }
                else
                    textView.setText("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() != "0")
                    if (isClick == false && isAfterEqual == false)
                        textView.setText(textView.getText() + "2");
                    else {
                        textView.setText("2");
                        isClick = false;
                    }
                else
                    textView.setText("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() != "0")
                    if (isClick == false && isAfterEqual == false)
                        textView.setText(textView.getText() + "3");
                    else {
                        textView.setText("3");
                        isClick = false;
                    }
                else
                    textView.setText("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() != "0")
                    if (isClick == false && isAfterEqual == false)
                        textView.setText(textView.getText() + "4");
                    else {
                        textView.setText("4");
                        isClick = false;
                    }
                else
                    textView.setText("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() != "0")
                    if (isClick == false && isAfterEqual == false)
                        textView.setText(textView.getText() + "5");
                    else {
                        textView.setText("5");
                        isClick = false;
                    }

                else
                    textView.setText("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() != "0")
                    if (isClick == false && isAfterEqual == false)
                        textView.setText(textView.getText() + "6");
                    else {
                        textView.setText("6");
                        isClick = false;
                    }
                else
                    textView.setText("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() != "0")
                    if (isClick == false && isAfterEqual == false)
                        textView.setText(textView.getText() + "7");
                    else {
                        textView.setText("7");
                        isClick = false;
                    }
                else
                    textView.setText("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() != "0")
                    if (isClick == false && isAfterEqual == false)
                        textView.setText(textView.getText() + "8");
                    else{
                        textView.setText("8");
                        isClick = false;
                    }
                else
                    textView.setText("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText() != "0")
                    if (isClick == false && isAfterEqual == false)
                        textView.setText(textView.getText() + "9");
                    else{
                        textView.setText("9");
                        isClick = false;
                    }
                else
                    textView.setText("9");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
                isClick = false;
                clear();
                isAfterEqual = false;
            }
        });

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });

        buttonBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(textView.getText() + "")/10 == 0)
                    textView.setText("0");
                else
                    textView.setText(Integer.parseInt(textView.getText() + "")/10 + "");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Integer.parseInt(textView.getText() + "");
                isClick = true;
                clear();
                isClickAdd = true;
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Integer.parseInt(textView.getText() + "");
                isClick = true;
                clear();
                isClickSub = true;
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Integer.parseInt(textView.getText() + "");
                isClick = true;
                clear();
                isClickMulti = true;
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Integer.parseInt(textView.getText() + "");
                isClick = true;
                clear();
                isClickDiv = true;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Integer.parseInt(textView.getText() + "");

                if(isClickAdd == true){
                    textView.setText(mValueOne + mValueTwo + "");
                    isClickAdd = false;
                }

                if(isClickSub == true){
                    textView.setText(mValueOne - mValueTwo + "");
                    isClickSub = false;
                }

                if(isClickMulti == true) {
                    textView.setText(mValueOne * mValueTwo + "");
                    isClickMulti = false;
                }

                if(isClickDiv == true){
                    if(mValueTwo == 0)
                        textView.setText("Error divide 0");
                    else
                        textView.setText(mValueOne/mValueTwo +"");
                    isClickDiv = false;
                }
                isClick = false;
                isAfterEqual = true;
            }
        });
    }
}
