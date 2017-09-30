package com.jbillote.chocobros.activity;

import com.jbillote.chocobros.R;
import com.jbillote.chocobros.fflogs.FFLogsAPI;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.Gson;

public class CharacterRankingSearchActivity extends NavigationDrawerActivity {

    public static String EXTRA_RANKINGS = "com.jbillote_chocobros.activity.CHARACTER_RANKINGS";
    public static String EXTRA_CHARACTER_NAME = "com.jbillote.chocobros.activity.CHARACTER_NAME";
    public static String EXTRA_CHARACTER_SERVER = "com.jbillote.chocobros.activity.SERVER";
    public static String EXTRA_CHARACTER_REGION = "com.jbillote.chocobros.activity.REGION";

    @SuppressWarnings("deprecation")
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewStub stub = (ViewStub)findViewById(R.id.main_layout_stub);
        stub.setLayoutResource(R.layout.activity_character_ranking_search);
        stub.inflate();
    }

    public void searchPressed(View view) {
        this.progressDialog = new ProgressDialog(CharacterRankingSearchActivity.this);
        this.progressDialog.setMessage(getApplicationContext().getString(R.string.search_in_progress));
        this.progressDialog.setIndeterminate(true);
        this.progressDialog.setCancelable(true);
        this.progressDialog.show();

        String characterName = ((EditText)findViewById(R.id.character_search_name)).getText().toString();
        String server = ((EditText)findViewById(R.id.character_search_server)).getText().toString();
        String region = ((Spinner)findViewById(R.id.character_search_region)).getSelectedItem().toString();

        ExecuteSearch task = new ExecuteSearch(this, characterName, server, region);
        task.execute();
    }

    private class ExecuteSearch extends AsyncTask<Void, Void, String> {

        private Activity activity;
        private String characterName;
        private String server;
        private String region;

        public ExecuteSearch(Activity activity, String characterName, String server, String region) {
            this.activity = activity;
            this.characterName = characterName;
            this.server = server;
            this.region = region;
        }

        @Override
        protected void onPreExecute() {}

        @Override
        protected String doInBackground(Void... unused) {
            String response = null;

            try {
                FFLogsAPI api = new FFLogsAPI("5dfb8a713b0eb301eba693194c00c83b");
                Gson gson = new Gson();

                response = gson.toJson(api.getRanking(this.characterName, this.server, this.region));
            } catch (Exception e) {
                e.printStackTrace();
            }

            return response;
        }

        @Override
        protected void onPostExecute(String res) {
            progressDialog.dismiss();

            if (res != null) {
                Intent intent = new Intent(this.activity, CharacterRankingsActivity.class);
                intent.putExtra(EXTRA_RANKINGS, res);
                intent.putExtra(EXTRA_CHARACTER_NAME, this.characterName);
                intent.putExtra(EXTRA_CHARACTER_SERVER, this.server);
                intent.putExtra(EXTRA_CHARACTER_REGION, this.region);

                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Unable to fetch rankings.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
