package com.one_for_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private Button btnSignIn, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        btnSignIn = findViewById( R.id.btnSignInID );
        btnSignUp = findViewById( R.id.btnSignUpID );

        btnSignIn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getBaseContext(), SignupActivity.class );
                startActivity( intent );
            }
        } );
        btnSignUp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getBaseContext(), SigninActivity.class );
                startActivity( intent );
            }
        } );
    }
}