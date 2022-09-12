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

    public void clearLED() {
        turnOffLED('a');
        turnOffLED('b');
        turnOffLED('c');
        turnOffLED('d');
        turnOffLED('e');
        turnOffLED('f');
        turnOffLED('g');
    }

    public void turnOnLED(char position) {
        setLED(position, true);
    }

    public void turnOffLED(char position) {
        setLED(position, false);
    }

    private void setLED(char position, boolean state) {
        int id = R.id.a;
        switch (position) {
            case 'a':
                id = R.id.a;
                break;
            case 'b':
                id = R.id.b;
                break;
            case 'c':
                id = R.id.c;
                break;
            case 'd':
                id = R.id.d;
                break;
            case 'e':
                id = R.id.e;
                break;
            case 'f':
                id = R.id.f;
                break;
            case 'g':
                id = R.id.g;
                break;
        }
        ImageView segment = findViewById(id);
        segment.setColorFilter(getContext().getResources().getColor(state ? R.color.led_on : R.color.led_off));
    }
}
