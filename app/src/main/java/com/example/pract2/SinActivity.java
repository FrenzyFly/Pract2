package com.example.pract2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SinActivity extends AppCompatActivity {
    private static final String TAG = "MyApplication";
    private EditText email;
    static final String ACCESS_EMAIL = "ACCESS_EMAIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin);

        TextView sign_in_text = findViewById(R.id.signin_text);
        sign_in_text.setText("Sign In");
        TextView or_with_text = findViewById(R.id.or_with);
        or_with_text.setText("Or with");

        email = findViewById(R.id.emailInput);
        TextView sign_up_text = findViewById(R.id.signup_link);
        Intent intent_signup = new Intent(this, SupActivity.class);

        sign_up_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_signup.putExtra("email_name_key", email.getText().toString());
                startActivity(intent_signup);
                Log.i(TAG, "Переход к SignUp");
            }
        });
    }

    public void onSignUpClick(View view) {
        Intent intent = new Intent(this, SupActivity.class);
        startActivity(intent);
    }
}
