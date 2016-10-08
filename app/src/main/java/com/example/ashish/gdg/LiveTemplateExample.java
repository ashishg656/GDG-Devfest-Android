package com.example.ashish.gdg;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by ashish on 08/10/16.
 */
public class LiveTemplateExample {

    /*
    * logt -create log tag easily
    * */

    // logt
    public static final String LOGTAG = "LiveTemplateExample";
    private static final String TAG = "LiveTemplateExample";

    /*
    * const
    * */

    // const
    private static final int VERSION = 100;
    private static final int anything = 838;

    // psf
    public static final int A = 1;
    //psfs
    public static final String name = "Nishant";
    //psfi
    public static final int test = 1;

    // newInstance
    // newInstance - generate new Instance for fragment instantly
    /*public static LiveTemplateExample newInstance() {

        Bundle args = new Bundle();

        LiveTemplateExample fragment = new LiveTemplateExample();
        fragment.setArguments(args);
        return fragment;
    }*/

    // noInstance
    // to disallow any instance from being created
    private LiveTemplateExample() {
        //no instance
    }


    public int justAMethod(String anyStr, int anyInt, Context context) {
        int arg2 = 0;

        // Toast
        Toast.makeText(context, "This is toast", Toast.LENGTH_SHORT).show();

        // logd
        Log.d(TAG, "justAMethod: Debug");

        // logi
        Log.i(TAG, "justAMethod: Info");

        // logw
        Log.w(TAG, "justAMethod: Warning");

        // loge
        Log.e(TAG, "justAMethod: Error");

        // wtf
        Log.wtf(TAG, "justAMethod: WTF");

        // sout
        System.out.println("System");

        // soutm
        System.out.println("LiveTemplateExample.justAMethod");

        // soutp
        System.out.println("anyStr = [" + anyStr + "], anyInt = [" + anyInt + "], context = [" + context + "]");

        // fbc
        // find view by id shortcut
//        (String) findViewById(R.id.text);

        // logm
        // log method name and parameters
        Log.d(TAG, "justAMethod() called with: " + "anyStr = [" + anyStr + "], anyInt = [" + anyInt + "]");

        // logr
        // log return value
        Log.d(TAG, "justAMethod() returned: " + arg2);

        return arg2;
    }

    void someMore(View view) {
        // visible
        view.setVisibility(View.VISIBLE);

        // gone
        view.setVisibility(View.GONE);
    }

    void ifCheck() {
        int a = 1;
        if (a == 1) {

        } else if (a == 2) {

        } else if (a == 3) {

        } else if (a == 4) {

        } else if (a == 5) {

        }
    }

    void ifCheck1() {
        int a = 1;
        switch (a) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
        }
    }
}
