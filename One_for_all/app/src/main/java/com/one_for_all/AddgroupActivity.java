package com.one_for_all;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AddgroupActivity extends Activity {

    private EditText edtGroupName, edtPassowrd, edtCategories;
    private Button btnsave;
    private Boolean check_group_name, check_password, check_permission;
    private Spinner sprCategory;

    private Intent intent;
    private DatabaseReference reff;
    DatabaseReference reff1;
    Context context1=this;
    Group group;

    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_addgroup);

        // Hide the Activity Status Bar
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
       //  Hide the Activity  Bar
//        try
//        {
//            this.getSupportActionBar().hide();
//        }
//        catch (NullPointerException e){}


        edtGroupName = findViewById(R.id.edtGroupNameId);
        edtPassowrd = findViewById( R.id.edtPassowrdId);
        edtCategories = findViewById( R.id.edtCategoryId );
        btnsave = findViewById( R.id.btnSignUpID );


        group = new Group();
        reff = FirebaseDatabase.getInstance().getReference().child( "Users" );
        btnsave.setOnClickListener(  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            group.setNameGroup( edtGroupName.getText().toString().trim() );
            group.setPassword_group( edtPassowrd.getText().toString().trim() );

            //If one of the details is missing:
            if (edtGroupName.getText().toString().equals( "" )) {
                Toast.makeText( AddgroupActivity.this, "Missing userName", Toast.LENGTH_LONG ).show();
                check_group_name = false;
            } else
                check_group_name = true;
            if (edtPassowrd.getText().toString().equals( "" )) {
                Toast.makeText( AddgroupActivity.this, "Missing password", Toast.LENGTH_LONG ).show();
                check_password = false;
            } else
                check_password = true;
            if(check_group_name && check_password  && check_permission){
                Intent intent = new Intent(getBaseContext(), RoutsActivity.class);
                startActivity(intent);
                Toast.makeText(AddgroupActivity.this, "i!!!!!!!!", Toast.LENGTH_LONG).show();
                reff.child(edtPassowrd.getText().toString().trim()).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            Toast.makeText(AddgroupActivity.this, "password group alredy exits", Toast.LENGTH_LONG).show();
                        }
                        else {
                            // Toast.makeText(SignupActivity.this, "@@@@", Toast.LENGTH_LONG).show();
                            group.setNameGroup( edtGroupName.getText().toString().trim() );
                            group.setPassword_group( edtPassowrd.getText().toString().trim() );


                            reff.child( edtPassowrd.getText().toString().trim() ).setValue( group );
                            SharedPreferences sharedPref = getSharedPreferences("myPref",(Context.MODE_PRIVATE));
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("GROUPNAME",edtGroupName.getText().toString().trim());
                            editor.commit();
//                            setDefaults("USERNAME",edtUserNamed.getText().toString().trim(), context1);
//                            setDefaults("PASSWORD",edtPassowrd.getText().toString().trim(), context1);
                            Toast.makeText( AddgroupActivity.this, "insert!", Toast.LENGTH_SHORT ).show();
                            finish();
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }

        }
    });

}

}





