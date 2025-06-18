package com.fuzzblob.emergencychatng;

import android.app.Activity;
import android.content.Context;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.widget.SwitchCompat;

/**
 * Created by Seph De Busser on 18/07/2015.
 */

// TODO: rename this as it's specifically to handle non-ICS android versions
public class SwitchHelperICS extends SwitchHelper {

    SwitchCompat s;
    TextView label;
    private Context c;

    public SwitchHelperICS(Activity activity, boolean start) {
        s = (SwitchCompat) activity.findViewById(R.id.userSwitch);
        label = (TextView) activity.findViewById(R.id.switchNextUserLabel);
        this.c = activity;

        // Set an OnCheckedChangeListener to handle state changes
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Change background color based on checked state
                if (isChecked) {
                    label.setText(c.getResources().getString(R.string.switch_hint_left));
                    label.setTextColor(c.getResources().getColor(R.color.chat_person_color_me));
                } else {
                    label.setText(c.getResources().getString(R.string.switch_hint_right));
                    label.setTextColor(c.getResources().getColor(R.color.chat_person_color_you));
                }
            }
        });
        s.setChecked(start);
    }

    @Override
    public boolean checked() {
        return s.isChecked();
    }

    @Override
    public void toggle() {
        s.toggle();
    }
}
