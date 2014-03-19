package com.example.redditreader;

import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;

/**
 * Created by Nakhimovich on 3/19/14.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2 {

    private Solo solo;

    public MainActivityTest() {
              super(MainActivity.class);
          }
     public void setUp() throws Exception {
             super.setUp();
             solo = new Solo(getInstrumentation(), getActivity());
         }
    public void testMainActivity() throws Exception {
        solo.assertCurrentActivity("Main Activity Never Loaded", MainActivity.class);
    }
}
