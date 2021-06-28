package com.example.mychat;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mychat.adapters.ChatAdapter;
import com.example.mychat.databinding.ActivityMainBinding;
import com.example.mychat.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ChatAdapter adapter;

    private List<Message> messages;
    private String author;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adapter = new ChatAdapter();
        binding.recyclerViewChat.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        binding.recyclerViewChat.setAdapter(adapter);
        messages = new ArrayList<>();
        author = "swat";
    }

    public void sendMsg(View v) {
        String message = binding.editTextTextMultiLine.getText().toString().trim();
        binding.editTextTextMultiLine.setText("");
        if (!message.isEmpty()) {
            messages.add(new Message(author, message));
            adapter.setMessages(messages);
        }
    }
}