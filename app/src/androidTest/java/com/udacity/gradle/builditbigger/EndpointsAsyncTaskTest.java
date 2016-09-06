package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.TimeUnit;

/**
 * Created by James Yang on 9/5/2016.
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase {
    public void runCloudModuleTest() {
                String joke = null;
        EndpointsAsyncTask  EATest= new EndpointsAsyncTask(getContext());
                EATest.execute();
                try {
                        joke = EATest.get(30, TimeUnit.SECONDS);
                        Log.d("EndpointsAsyncTask Test", "Retrieved successfully " + joke);
                    } catch (Exception e) {
                    fail("Timed out!!!!!!!!!");
                    }
                assertNotNull(joke);
            }
}
