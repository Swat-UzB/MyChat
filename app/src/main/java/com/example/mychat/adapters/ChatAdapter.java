package com.example.mychat.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mychat.databinding.ItemMessageBinding;
import com.example.mychat.model.Message;

import java.util.ArrayList;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {
    private List<Message> messages;

    public void setMessages(List<Message> messages) {
        this.messages.clear();
        this.messages.addAll(messages);
        notifyDataSetChanged();
    }

    public ChatAdapter() {
        messages = new ArrayList<>();
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatViewHolder(ItemMessageBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ChatViewHolder holder, int position) {
        Message message = messages.get(position);
        holder.messageBinding.textViewMessage.setText(message.getMessage());
        holder.messageBinding.textViewOwner.setText(message.getOwner());

    }

    @Override
    public int getItemCount() {
        return messages == null ? 0 : messages.size();
    }

    static class ChatViewHolder extends RecyclerView.ViewHolder {
        private ItemMessageBinding messageBinding;

        public ChatViewHolder(@NonNull ItemMessageBinding messageBinding) {
            super(messageBinding.getRoot());
            this.messageBinding = messageBinding;
        }
    }
}
