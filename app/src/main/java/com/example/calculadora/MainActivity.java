  package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroNum = "";
    private String segundoNum = "";
    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Calculadora");
        display = findViewById(R.id.tv_display);
    }

    public void onClickBtn1 (View v) {
        atualizarNumDigitado("1");
        atualizarDisplay("1");
    }

    public void onClickBtn2 (View v) {
        atualizarNumDigitado("2");
        atualizarDisplay("2");
    }

      public void onClickBtn3 (View v) {
          atualizarNumDigitado("3");
          atualizarDisplay("3");
      }

      public void onClickBtn4 (View v) {
          atualizarNumDigitado("4");
          atualizarDisplay("4");
      }

      public void onClickBtn5 (View v) {
          atualizarNumDigitado("5");
          atualizarDisplay("5");
      }

      public void onClickBtn6 (View v) {
          atualizarNumDigitado("6");
          atualizarDisplay("6");
      }

      public void onClickBtn7 (View v) {
          atualizarNumDigitado("7");
          atualizarDisplay("7");
      }

      public void onClickBtn8 (View v) {
          atualizarNumDigitado("8");
          atualizarDisplay("8");
      }

      public void onClickBtn9 (View v) {
          atualizarNumDigitado("9");
          atualizarDisplay("9");
      }

      public void onClickBtn0 (View v) {
          atualizarNumDigitado("0");
          atualizarDisplay("0");
      }

      public void onClickAdicao (View v) {
        if (!primeiroNum.isEmpty()) {
            operacao = "+";
            atualizarDisplay("+");
        } else {
            Toast.makeText(MainActivity.this, "Informe um número antes", Toast.LENGTH_LONG).show();
        }
    }

      public void onClickSubtracao (View v) {
          if (!primeiroNum.isEmpty()) {
              operacao = "-";
              atualizarDisplay("-");
          } else {
              Toast.makeText(MainActivity.this, "Informe um número antes", Toast.LENGTH_LONG).show();
          }
      }

      public void onClickDivisao (View v) {
          if (!primeiroNum.isEmpty()) {
              operacao = "/";
              atualizarDisplay("/");
          } else {
              Toast.makeText(MainActivity.this, "Informe um número antes", Toast.LENGTH_LONG).show();
          }
      }

      public void onClickMultiplicacao (View v) {
          if (!primeiroNum.isEmpty()) {
              operacao = "*";
              atualizarDisplay("*");
          } else {
              Toast.makeText(MainActivity.this, "Informe um número antes", Toast.LENGTH_LONG).show();
          }
      }

    public void onClickIgual (View v) {
        if(!primeiroNum.isEmpty() && !segundoNum.isEmpty()) {
            int numero1 = Integer.parseInt(primeiroNum);
            int numero2 = Integer.parseInt(segundoNum);
            if (operacao.equals("+")) {
                int resultado = numero1 + numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("-")) {
                int resultado = numero1 - numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("*")) {
                int resultado = numero1 * numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("/")) {
                if (numero2 != 0) {
                    int resultado = numero1 / numero2;
                    display.setText(String.valueOf(resultado));
                } else {
                    Toast.makeText(MainActivity.this, "Não é possível difidir por zero", Toast.LENGTH_LONG).show();
                }
            }
        } else {
            Toast.makeText(MainActivity.this, "Operação inválida", Toast.LENGTH_LONG).show();
        }
    }

     private void atualizarDisplay(String texto) {
       String textoDisplay = display.getText().toString();
       textoDisplay = textoDisplay + texto;
       display.setText(textoDisplay);
    }

    private void atualizarNumDigitado(String numero) {
        if (operacao.isEmpty()) {
            primeiroNum = primeiroNum + numero;
        } else {
            segundoNum = segundoNum + numero;
        }
    }
}