package com.sephdebusser.aspiemeltdown;

import android.app.Activity;

import androidx.appcompat.widget.SwitchCompat;

/**
 * Created by Seph De Busser on 18/07/2015.
 */
public class SwitchHelperICS extends SwitchHelper {

    SwitchCompat s;

    public SwitchHelperICS(Activity activity) {
        s = (SwitchCompat) activity.findViewById(R.id.userSwitch);
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
