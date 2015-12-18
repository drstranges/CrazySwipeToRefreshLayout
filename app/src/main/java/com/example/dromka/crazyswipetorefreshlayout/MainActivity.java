package com.example.dromka.crazyswipetorefreshlayout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        replaceFragment();
    }

    private void replaceFragment() {

        FragmentManager fm = getSupportFragmentManager();
        boolean isSecond = fm.findFragmentById(R.id.container) instanceof SecondFragment;
        Fragment fragment;
        if (isSecond) {
            fragment = new FirstFragment();
        } else {
            fragment = new SecondFragment();
        }
        fm.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}
