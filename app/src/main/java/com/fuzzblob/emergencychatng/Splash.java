package com.fuzzblob.emergencychatng;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fuzzblob.emergencychatng.dao.Dao;
import com.fuzzblob.emergencychatng.dao.SplashScreen;
import com.fuzzblob.emergencychatng.dao.SplashScreenDao;

public class Splash extends Activity {

    public static final String SPLASH_ID = "SPLASH_ID";
    public static final String SETTINGS_SHOW = "SETTINGS_SHOW";

    SplashScreenDao dao;
    long id;
    SplashScreen screen;

    boolean showSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        id = this.getIntent().getLongExtra(SPLASH_ID,0);
        dao = Dao.getSession(this).getSplashScreenDao();
        showSettings = this.getIntent().getBooleanExtra(SETTINGS_SHOW,true);
        if(!showSettings) {
            View settings_button = findViewById(R.id.settingsButton);
            ((ViewGroup)settings_button.getParent()).removeView(settings_button);
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        screen = dao.load(id);
        if(showSettings && (screen == null || dao.count() != 1)) {
            //Number of splash screens changed, or the current one got deleted. need to go back to main
            Intent next = new Intent().setClass(Splash.this,Main.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(next);
        } else {
            TextView text_h = (TextView) findViewById(R.id.splash_header);
            text_h.setText(screen.getTitle());

            TextView text = (TextView) findViewById(R.id.splash_message);
            text.setText(screen.getText());

            SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
            int textsize = Integer.parseInt(pref.getString(SettingsActivity.KEY_PREF_SIZE, "26"));
            text.setTextSize(TypedValue.COMPLEX_UNIT_SP, textsize);
        }
    }

    public void Continue(View view) {
        Intent next = new Intent().setClass(Splash.this,Chat.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(next);
    }

    public void openSettings(View view) {
        Intent next = new Intent().setClass(Splash.this, SettingsChooserActivity.class);
        startActivity(next);
    }
}
