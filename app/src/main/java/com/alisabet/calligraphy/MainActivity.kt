package com.alisabet.calligraphy

import android.os.Bundle

class MainActivity : ContextActivity() {

    //1.add calligraphy library
    //2.make contextactivity
    //3.all activities should extend contextactivity instead of appcompatactivity
    //4.make App class that extends Application class and introduce it in manifest
    //5.make fonts folder and put fonts in it

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
