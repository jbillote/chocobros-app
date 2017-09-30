package com.jbillote.chocobros.activity;

import com.jbillote.chocobros.R;

import android.os.Bundle;
import android.view.ViewStub;

public class GuildReportSearchActivity extends NavigationDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewStub stub = (ViewStub)findViewById(R.id.main_layout_stub);
        stub.setLayoutResource(R.layout.activity_guild_report_search);
        stub.inflate();
    }
}
