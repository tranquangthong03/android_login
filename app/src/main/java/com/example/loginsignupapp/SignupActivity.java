package com.example.loginsignupapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText etFullName, etEmail, etPassword, etConfirmPassword;
    Button btnSignup, btnBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Ánh xạ view
        etFullName = findViewById(R.id.etFullName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnSignup = findViewById(R.id.btnSignup);
        btnBackToLogin = findViewById(R.id.btnBackToLogin);

        // Xử lý tạo tài khoản tạm thời
        btnSignup.setOnClickListener(v -> {
            String name = etFullName.getText().toString();
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();
            String confirm = etConfirmPassword.getText().toString();

            if (!password.equals(confirm)) {
                Toast.makeText(SignupActivity.this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(SignupActivity.this, "Account Created for: " + name, Toast.LENGTH_SHORT).show();
            }
        });

        // Quay lại LoginActivity
        btnBackToLogin.setOnClickListener(v -> {
            finish(); // đóng SignupActivity để quay về LoginActivity
        });
    }
}
