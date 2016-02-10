package com.example.sadahide.desirenotificationforandroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    @Override
    protected void  onCreate(Bundle savedInstansState){
        super.onCreate(savedInstansState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        Button wordSetBtn = (Button)findViewById(R.id.btn_word_set);

        wordSetBtn.setOnClickListener(this);
    }

    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_word_set:
                Intent intent = new Intent(MainActivity.this,WordSetActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
