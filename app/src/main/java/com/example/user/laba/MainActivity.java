package com.example.user.laba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

import static org.junit.Assert.assertEquals;

public class MainActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GameSession session = new GameSession();
        DaggerGameComponent.create().inject(session);
        assertEquals("Hello Dagger", session.data.hello);
    }
}
