package com.jbillote.chocobros.activity;

import com.jbillote.chocobros.R;
import com.jbillote.chocobros.fflogs.model.CharacterRanking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewStub;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CharacterRankingsActivity extends NavigationDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewStub stub = (ViewStub)findViewById(R.id.main_layout_stub);
        stub.setLayoutResource(R.layout.activity_character_rankings);
        stub.inflate();
    }
}
