package com.jbillote.chocobros.activity;

import com.jbillote.chocobros.R;
import com.jbillote.chocobros.fflogs.model.CharacterRanking;
import com.jbillote.chocobros.fflogs.util.ClassUtil;
import com.jbillote.chocobros.fflogs.util.EncounterUtil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CharacterRankingsActivity extends NavigationDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewStub stub = (ViewStub)findViewById(R.id.main_layout_stub);
        stub.setLayoutResource(R.layout.activity_character_rankings);
        stub.inflate();

        String characterName = getIntent().getStringExtra(CharacterRankingSearchActivity.EXTRA_CHARACTER_NAME);
        String server = getIntent().getStringExtra(CharacterRankingSearchActivity.EXTRA_CHARACTER_SERVER);
        String region = getIntent().getStringExtra(CharacterRankingSearchActivity.EXTRA_CHARACTER_REGION);

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

        Gson gson = new Gson();
        Type classType = new TypeToken<ArrayList<CharacterRanking>>(){}.getType();
        List<CharacterRanking> rankings = gson.fromJson(getIntent().getStringExtra(CharacterRankingSearchActivity.EXTRA_RANKINGS), classType);

        ((TextView)findViewById(R.id.character_ranking_title)).setText(title);
        ((ListView)findViewById(R.id.character_ranking_list)).setAdapter(new CharacterRankingAdapter(rankings));
    }

    private class CharacterRankingAdapter extends ArrayAdapter<CharacterRanking> {

        public CharacterRankingAdapter(List<CharacterRanking> data) {
            super(CharacterRankingsActivity.this, R.layout.character_ranking_item, data);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            CharacterRanking ranking = getItem(position);

            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.character_ranking_item, parent, false);
            }

            int percentile = (int)((float)(ranking.getOutOf() - ranking.getRank()) / ranking.getOutOf() * 100.0);

            try {
                ((TextView)convertView.findViewById(R.id.char_ranking_item_encounter_name)).setText(EncounterUtil.getEncounterName(ranking.getEncounterID()));
                ((TextView)convertView.findViewById(R.id.char_ranking_item_class)).setText(ClassUtil.getClass(ranking.getSpec()));
                ((TextView)convertView.findViewById(R.id.char_ranking_item_percentile)).setText(String.valueOf(percentile) + "th Percentile");
                ((TextView)convertView.findViewById(R.id.char_ranking_item_dps)).setText(String.valueOf(ranking.getTotal()));
            } catch (Exception e) {
                e.printStackTrace();;
            }

            return convertView;
        }
    }
}
