package com.jbillote.chocobros.activity;

import com.jbillote.chocobros.R;
import com.jbillote.chocobros.fflogs.model.CharacterRanking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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

        String characterName = getIntent().getStringExtra(CharacterSearchActivity.EXTRA_CHARACTER_NAME);
        String server = getIntent().getStringExtra(CharacterSearchActivity.EXTRA_CHARACTER_SERVER);
        String region = getIntent().getStringExtra(CharacterSearchActivity.EXTRA_CHARACTER_REGION);

        String[] splitName = characterName.split(" ");
        for (int i = 0; i < splitName.length; i++) {
            char[] temp = splitName[i].toCharArray();
            temp[0] = Character.toUpperCase(temp[0]);
            splitName[i] = new String(temp);
        }

        char[] temp = server.toCharArray();
        temp[0] = Character.toUpperCase(temp[0]);
        server = new String(temp);

        String title = "Rankings for " + splitName[0] + " " + splitName[1] + " on " + server + " (" + region + ")";

        ((TextView)findViewById(R.id.character_ranking_title)).setText(title);
    }
}
