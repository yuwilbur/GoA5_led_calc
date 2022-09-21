package com.example.led_calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Week1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.num0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(0);
            }
        });
        findViewById(R.id.num1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(1);
            }
        });
        findViewById(R.id.num2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(2);
            }
        });
        findViewById(R.id.num3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(3);
            }
        });
        findViewById(R.id.num4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(4);
            }
        });
        findViewById(R.id.num5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(5);
            }
        });
        findViewById(R.id.num6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(6);
            }
        });
        findViewById(R.id.num7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(7);
            }
        });
        findViewById(R.id.num8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(8);
            }
        });
        findViewById(R.id.num9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(9);
            }
        });

        Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber(0);
            }
        });
    }

    void setNumber(int number) {
        LEDView led = findViewById(R.id.led0);
        led.clear();
        if (number == 0) {
            led.turnOnA();
            led.turnOnB();
            led.turnOnC();
            led.turnOnD();
            led.turnOnE();
            led.turnOnF();
        } else if (number == 1) {
            led.turnOnB();
            led.turnOnC();
        } else if (number == 2) {
            led.turnOnA();
            led.turnOnB();
            led.turnOnD();
            led.turnOnE();
            led.turnOnG();
        } else if (number == 3) {
            led.turnOnA();
            led.turnOnB();
            led.turnOnC();
            led.turnOnD();
            led.turnOnG();
        } else if (number == 4) {
            led.turnOnB();
            led.turnOnC();
            led.turnOnF();
            led.turnOnG();
        } else if (number == 5) {
            led.turnOnA();
            led.turnOnC();
            led.turnOnD();
            led.turnOnF();
            led.turnOnG();
        } else if (number == 6) {
            led.turnOnA();
            led.turnOnC();
            led.turnOnD();
            led.turnOnE();
            led.turnOnF();
            led.turnOnG();
        } else if (number == 7) {
            led.turnOnA();
            led.turnOnB();
            led.turnOnC();
        } else if (number == 8) {
            led.turnOnA();
            led.turnOnB();
            led.turnOnC();
            led.turnOnD();
            led.turnOnE();
            led.turnOnF();
            led.turnOnG();
        } else if (number == 9) {
            led.turnOnA();
            led.turnOnB();
            led.turnOnC();
            led.turnOnD();
            led.turnOnF();
            led.turnOnG();
        }
    }
}