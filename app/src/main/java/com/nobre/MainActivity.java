package com.nobre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Bundle savedInstanceState;
    private Bundle nAddition;

    @Override
    protected <nAddition, nSubtract, nMultiplication, nDivision> void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn0;
        Button btn1;
        Button btn2;
        Button btn3;
        Button btn4;
        Button btn5;
        Button btn6;
        Button btn7;
        Button btn8;
        Button btn9;
        Button btnSub;
        Button btnMul;
        Button btnDiv;
        Button btnC;
        Button btnIgual;
        Button btnSoma;
        final EditText edt1;
        final double[] Valor1 = new double[1];
        final double[] Valor2 = new double[1];
        final nAddition
        final nSubtract
        final nMultiplication
        final nDivision


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnSoma[0] = (Button) findViewById(R.id.btnSoma);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnC = (Button) findViewById(R.id.btnC);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        edt1 = (EditText)findViewById(R.id.edt1);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText().toString()+0);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText().toString()+1;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText().toString()+2;


    }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText().toString()+3;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText().toString()+4;
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText().toString()+5;
            }
        });

                btn6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText().toString()+6);
                    }
                });

                btn7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText().toString()+7);
                    }
                });

                btn8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText().toString()+8);
                    }
                });

                btn9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        edt1.setText(edt1.getText().toString()+9);
                    }
                });

                btnSoma[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (edt1 ==null){
                            edt1.setText("");
                        }else {
                            Valor1[0] = Double.valueOf(edt1.getText().toString() + "");
                            nAddition[0] =true;
                            edt1.setText(null);
                        }
                    }
                });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 ==null){
                    edt1.setText("");
                }else {
                    Valor1[0] = Double.valueOf(edt1.getText().toString() + "");
                    nSubtract[0] =true;
                    edt1.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 ==null){
                    edt1.setText("");
                }else {
                    Valor1[0] = Double.valueOf(edt1.getText().toString() + "");
                    nMultiplication[0] =true;
                    edt1.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 ==null){
                    edt1.setText("");
                }else {
                    Valor1[0] = Double.valueOf(edt1.getText().toString() + "");
                    nDivision[0] =true;
                    edt1.setText(null);
                }
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor2[0] = Double.valueOf(edt1.getText().toString() + "");

                if (btnSoma[0] == true) {
                    edt1.setText(Valor1[0] + Valor2[0] + "");
                    btnSoma[0] = false;
                }

                if (nSubtract[0] == true) {
                    edt1.setText(Valor1[0] - Valor2[0] + "");
                    nSubtract[0] = false;
                }

                if (nMultiplication[0] == true) {
                    edt1.setText(Valor1[0] * Valor2[0] + "");
                    nMultiplication[0] = false;
                }

                if (nDivision[0] == true) {
                    edt1.setText(Valor1[0] / Valor2[0] + "");
                    nAddition[0] = false;
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });





}
}
