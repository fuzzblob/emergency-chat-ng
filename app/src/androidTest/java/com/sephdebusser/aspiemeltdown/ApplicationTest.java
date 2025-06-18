package com.sephdebusser.aspiemeltdown;

import android.app.Application;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.core.app.ApplicationProvider;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertNotNull;

/**
 * <a href="https://developer.android.com/studio/test">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
public class ApplicationTest {

    @Test
    public void testApplicationNotNull() {
        // Get the application context
        Application app = ApplicationProvider.getApplicationContext();
        // Assert that the application is not null
        assertNotNull(app);
    }
}