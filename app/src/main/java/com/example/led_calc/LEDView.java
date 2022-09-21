package com.example.led_calc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class LEDView extends RelativeLayout {
    public LEDView(Context context, AttributeSet attrs) {
        super(context, attrs);
        View view = inflate(getContext(), R.layout.led_view, null);
        addView(view);
    }

    public void clear() {
        setLED(R.id.a, false);
        setLED(R.id.b, false);
        setLED(R.id.c, false);
        setLED(R.id.d, false);
        setLED(R.id.e, false);
        setLED(R.id.f, false);
        setLED(R.id.g, false);
    }

    public void turnOnA() {
        setLED(R.id.a, true);
    }

    public void turnOnB() {
        setLED(R.id.b, true);
    }

    public void turnOnC() {
        setLED(R.id.c, true);
    }

    public void turnOnD() {
        setLED(R.id.d, true);
    }

    public void turnOnE() {
        setLED(R.id.e, true);
    }

    public void turnOnF() {
        setLED(R.id.f, true);
    }

    public void turnOnG() {
        setLED(R.id.g, true);
    }

    public void turn(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
        clear();
        if (a) {
            turnOnA();
        }
        if (b) {
            turnOnB();
        }
        if (c) {
            turnOnC();
        }
        if (d) {
            turnOnD();
        }
        if (e) {
            turnOnE();
        }
        if (f) {
            turnOnF();
        }
        if (g) {
            turnOnG();
        }
    }

    private void setLED(int id, boolean state) {
        ImageView segment = findViewById(id);
        segment.setColorFilter(getContext().getResources().getColor(state ? R.color.led_on : R.color.led_off));
    }
}
