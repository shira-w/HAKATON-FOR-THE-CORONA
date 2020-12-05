package com.one_for_all;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RoutsActivity extends AppCompatActivity {

    private Button btnHomePage, btnAddGroup, btnMyGroup, btnUpdateSick1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_routs );

        // Hide the Activity Status Bar
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //  Hide the Activity  Bar
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        btnAddGroup = findViewById( R.id.btnAddGroupId );
        btnMyGroup = findViewById( R.id.btnMyGroupId );
        btnHomePage = findViewById( R.id.btnHomePageID );
        btnUpdateSick1 = findViewById( R.id.btnUpdateSick1Id );


        btnAddGroup.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getBaseContext(), AddgroupActivity.class );
                startActivity( intent );
            }
        } );
        btnMyGroup.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getBaseContext(), MygroupActivity.class );
                startActivity( intent );
            }
        } );
        btnHomePage.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getBaseContext(), HomePageActivity.class );
                startActivity( intent );
            }
        } );

        btnUpdateSick1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getBaseContext(), UpdatesickActivity.class );
                startActivity( intent );
            }
        } );

    }
}
