package com.example.pract2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SupActivity extends AppCompatActivity {
    private static final String TAG = "MyCarShowroom";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup);

        TextView sign_up_text = findViewById(R.id.signup_text);
        sign_up_text.setText("Sign Up");
        TextView or_with_text = findViewById(R.id.or_with2);
        or_with_text.setText("Or with");

        TextView your_email = findViewById(R.id.emailInput);
        String emailname = getIntent().getStringExtra("email_name_key");
        your_email.setText(your_email.getText().toString() + emailname);
    }

    public void onSignInClick(View v) {
        String emailname = getIntent().getStringExtra("email_name_key");
        sendEmailName(emailname);
    }

    private void sendEmailName(String message) {
        Intent data = new Intent();
        data.putExtra(SinActivity.ACCESS_EMAIL, message);
        setResult(RESULT_OK, data);
        finish();
        Log.i(TAG, "Переход к SignInActivity");
    }
}
