package com.one_for_all;


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

public class SignupActivity extends AppCompatActivity {

    private Button btnSignup;
    private EditText edtUserNamed, edtid, edtPassowrd;
    private Boolean check_username, check_password, check_id;
    private Intent intent;
    private DatabaseReference reff;
    DatabaseReference reff1;
    Context context1=this;
    Users users;
    Users chec_users;
    private int permition=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_logup);

        // Hide the Activity Status Bar
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hide the Activity  Bar
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        btnSignup = findViewById(R.id.btnSignUpID);
        edtUserNamed = findViewById( R.id.edtUserNamedId);
        edtid = findViewById( R.id.edtId );
        edtPassowrd = findViewById( R.id.edtPassowrdId );

        users = new Users();
        chec_users=new Users();
        reff = FirebaseDatabase.getInstance().getReference().child( "Users" );
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                users.setUserName( edtUserNamed.getText().toString().trim() );
                users.setPassword( edtPassowrd.getText().toString().trim() );
                users.setidUser(Integer.parseInt(edtid.getText().toString().trim()));

                //If one of the details is missing:
                if (edtUserNamed.getText().toString().equals( "" )) {
                    Toast.makeText( SignupActivity.this, "Missing userName", Toast.LENGTH_LONG ).show();
                    check_username = false;
                } else
                    check_username = true;
                if (edtPassowrd.getText().toString().equals( "" )) {
                    Toast.makeText( SignupActivity.this, "Missing password", Toast.LENGTH_LONG ).show();
                    check_password = false;
                } else
                    check_password = true;
                if (edtid.getText().toString().equals( "" )) {
                    Toast.makeText( SignupActivity.this, "Missing id", Toast.LENGTH_LONG ).show();
                    check_id = false;
                } else {
                    check_id = true;
                }
                if(check_username && check_password  && check_id){

                    reff.child(edtid.getText().toString().trim()).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                        public void onDataChange(DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                Toast.makeText(SignupActivity.this, "id alredy exits", Toast.LENGTH_LONG).show();
                        }
                            else {
                                users.setUserName( edtUserNamed.getText().toString().trim() );
                                users.setPassword( edtPassowrd.getText().toString().trim() );
                                users.setidUser(Integer.parseInt(edtid.getText().toString().trim()));


                                reff.child( edtid.getText().toString().trim() ).setValue( users );
                                SharedPreferences sharedPref = getSharedPreferences("myPref",(Context.MODE_PRIVATE));
                                SharedPreferences.Editor editor = sharedPref.edit();
                                editor.putString("USERNAME",edtUserNamed.getText().toString().trim());
                                editor.putString("PASSWORD",edtPassowrd.getText().toString().trim());
                                editor.commit();
//                              setDefaults("USERNAME",edtUserNamed.getText().toString().trim(), context1);
//                              setDefaults("PASSWORD",edtPassowrd.getText().toString().trim(), context1);
                                Toast.makeText( SignupActivity.this, "insert!", Toast.LENGTH_SHORT ).show();
                                finish();
                            }

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                    Intent intent = new Intent(getBaseContext(), RoutsActivity.class);
                    startActivity(intent);

                }

            }
        });

    }

}
