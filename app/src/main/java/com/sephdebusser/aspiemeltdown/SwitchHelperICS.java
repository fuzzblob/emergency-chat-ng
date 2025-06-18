package com.sephdebusser.aspiemeltdown;

import android.app.Activity;
import android.content.Context;
import android.widget.CompoundButton;

import androidx.appcompat.widget.SwitchCompat;

/**
 * Created by Seph De Busser on 18/07/2015.
 */

// TODO: rename this as it's specifically to handle non-ICS android versions
public class SwitchHelperICS extends SwitchHelper {

    SwitchCompat s;
    private Context c;

    public SwitchHelperICS(Activity activity, boolean start) {
        s = (SwitchCompat) activity.findViewById(R.id.userSwitch);
        this.c = activity;

        // Set an OnCheckedChangeListener to handle state changes
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Change background color based on checked state
                if (isChecked) {
                    s.setBackgroundColor(c.getResources().getColor(R.color.chat_person_color_l));
                    // Perform action for switch on
                } else {
                    s.setBackgroundColor(c.getResources().getColor(R.color.chat_person_color_r));
                    // Perform action for switch off
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
