package com.jbillote.chocobros.activity;

import com.jbillote.chocobros.R;
import com.jbillote.chocobros.activity.NavigationDrawerActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewStub;

public class CharacterSearchActivity extends NavigationDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        ViewStub stub = (ViewStub)findViewById(R.id.main_layout_stub);
        stub.setLayoutResource(R.layout.activity_main);
        stub.inflate();
    }
}
