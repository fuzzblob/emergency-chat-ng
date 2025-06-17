package com.sephdebusser.aspiemeltdown;

import android.app.Activity;
import android.widget.Switch;

/**
 * Created by Seph De Busser on 18/07/2015.
 */
public class SwitchHelperICS extends SwitchHelper {

    Switch s;

    public SwitchHelperICS(Activity activity) {
        s = (Switch) activity.findViewById(R.id.userSwitch);
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
