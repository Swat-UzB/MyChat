package com.example.mychat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mychat.databinding.ActivityRegistryBinding;

public class RegistryActivity extends AppCompatActivity {
    private ActivityRegistryBinding registryBinding;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registryBinding = ActivityRegistryBinding.inflate(getLayoutInflater());
        setContentView(registryBinding.getRoot());
    }
}