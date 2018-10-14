package dsa.eetac.upc.edu.mycalculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.R;
//import android.R.*;

public class MainActivity extends AppCompatActivity {


    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bsin, bcos, btan, bsuma, bresta, bmulti, bdiv, bpunto, bC, bigual;
    EditText editortexto;

    float primerValor, segonValor;

    boolean suma, resta, multiplicacio, divisio, sinus, cosinus, tangent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.button_19);
        b1 = findViewById(R.id.button_1);
        b2 = findViewById(R.id.button_2);
        b3 = findViewById(R.id.button_3);
        b4 = findViewById(R.id.button_4);
        b5 = findViewById(R.id.button_5);
        b6 = findViewById(R.id.button_6);
        b7 = findViewById(R.id.button_7);
        b8 = findViewById(R.id.button_8);
        b9 = findViewById(R.id.button_9);
        bsin = findViewById(R.id.button_10);
        bcos = findViewById(R.id.button_11);
        btan = findViewById(R.id.button_12);
        bsuma = findViewById(R.id.button_13);
        bresta = findViewById(R.id.button_14);
        bmulti = findViewById(R.id.button_15);
        bdiv = findViewById(R.id.button_17);
        bC = findViewById(R.id.button_20);
        bigual = findViewById(R.id.button_21);
        editortexto = findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "1"));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "2"));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "3"));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "4"));
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "5"));
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "6"));
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "7"));
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "8"));
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "9"));
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "0"));
            }
        });

        bsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editortexto == null) {
                    editortexto.setText("");
                } else {
                    primerValor = Float.parseFloat(editortexto.getText() + "");
                    suma = true;
                    editortexto.setText(null);
                }
            }
        });
        

        bresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primerValor = Float.parseFloat(editortexto.getText() + "");
                resta = true;
                editortexto.setText(null);
            }
        });

        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primerValor = Float.parseFloat(editortexto.getText() + "");
                multiplicacio = true;
                editortexto.setText(null);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primerValor = Float.parseFloat(editortexto.getText() + "");
                divisio = true;
                editortexto.setText(null);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primerValor = Float.parseFloat(editortexto.getText() + "");
                sinus = true;
                editortexto.setText(null);
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primerValor = Float.parseFloat(editortexto.getText() + "");
                cosinus = true;
                editortexto.setText(null);
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primerValor = Float.parseFloat(editortexto.getText() + "");
                tangent = true;
                editortexto.setText(null);
            }
        });

        bigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (suma) {
                    segonValor = Float.parseFloat(editortexto.getText() + "");
                    editortexto.setText((primerValor + segonValor + ""));
                    suma = false;
                }

                if (resta) {
                    segonValor = Float.parseFloat(editortexto.getText() + "");
                    editortexto.setText((primerValor - segonValor + ""));
                    resta = false;
                }

                if (multiplicacio) {
                    segonValor = Float.parseFloat(editortexto.getText() + "");
                    editortexto.setText((primerValor * segonValor + ""));
                    multiplicacio = false;
                }

                if (divisio) {
                    segonValor = Float.parseFloat(editortexto.getText() + "");
                    editortexto.setText((primerValor / segonValor + ""));
                    divisio = false;
                }

                if (sinus) {
                    editortexto.setText((Math.sin(primerValor) + ""));
                    sinus = false;
                }
                if (cosinus) {
                    editortexto.setText((Math.cos(primerValor) + ""));
                    cosinus = false;
                }
                if (tangent) {
                    editortexto.setText((Math.tan(primerValor) + ""));
                    tangent = false;
                }
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText("");
            }
        });
/*
        bpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editortexto.setText((editortexto.getText() + "."));
            }
        });
        */
    }


}