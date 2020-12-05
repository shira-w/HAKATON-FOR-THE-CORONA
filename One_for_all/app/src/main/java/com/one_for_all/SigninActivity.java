package com.one_for_all;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SigninActivity extends AppCompatActivity {

    private EditText edtid, edtPassowrd;
    private Button btnSignup;
    private Intent intent;
    private Boolean check_password, check_id;
    private DatabaseReference reff;
    DatabaseReference reff1;
    Context context1 = this;
    Users users;
    Users chec_users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        // Hide the Activity Status Bar
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        // Hide the Activity  Bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

        btnSignup = findViewById( R.id.btnSignUpID );
        edtid = findViewById( R.id.edtId );
        edtPassowrd = findViewById( R.id.edtPassowrdId );

        users = new Users();
        chec_users = new Users();

        reff = FirebaseDatabase.getInstance().getReference().child( "Users" );
        btnSignup.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent( getBaseContext(), RoutsActivity.class );
                startActivity( intent );
//                users.setPassword( edtPassowrd.getText().toString().trim() );
//                users.setidUser( Integer.parseInt( edtid.getText().toString().trim() ) );

                //If one of the details is missing:
//                if (edtPassowrd.getText().toString().equals( "" )) {
//                    Toast.makeText( SigninActivity.this, "Missing password", Toast.LENGTH_LONG ).show();
//                    check_password = false;
//                } else
//                    check_password = true;
//                if (edtid.getText().toString().equals( "" )) {
//                    Toast.makeText( SigninActivity.this, "Missing id", Toast.LENGTH_LONG ).show();
//                    check_id = false;
//                } else {
                  //  check_id = true;
              //  }
//                if (check_password && check_id) {
//                    reff.child( edtid.getText().toString().trim() ).addListenerForSingleValueEvent( new ValueEventListener() {
//                        @Override
//
//                        public void onDataChange(DataSnapshot snapshot) {
//                            if (snapshot.exists()) {
//                                Intent intent = new Intent( getBaseContext(), RoutsActivity.class );
//                                startActivity( intent );
//                            } else {
//                                Toast.makeText( SigninActivity.this, "incorect", Toast.LENGTH_LONG ).show();
//                                // just if id is exists but if the password is diferents its login.
//                            }
//
//                        }
//
//                        @Override
//                        public void onCancelled(@NonNull DatabaseError error) {
//
//                        }
//                    } );
//                }

            }
        } );
    }
}


