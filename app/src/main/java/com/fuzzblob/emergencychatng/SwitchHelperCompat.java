package com.fuzzblob.emergencychatng;

import android.app.Activity;
import androidx.appcompat.widget.SwitchCompat;
/**
 * Created by Seph De Busser on 18/07/2015.
 *
 *  referenced by SwitchHelper only Build.VERSION_CODES.ICE_CREAM_SANDWICH or less
 */
public class SwitchHelperCompat extends SwitchHelper {
    SwitchCompat s = null;

    public SwitchHelperCompat(Activity activity, boolean start) {
        this.s = (SwitchCompat) activity.findViewById(R.id.userSwitch);
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
