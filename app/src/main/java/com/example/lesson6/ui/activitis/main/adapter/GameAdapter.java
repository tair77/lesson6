package com.example.lesson6.ui.activitis.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson6.data.GameModel;
import com.example.lesson6.databinding.ListHolderBinding;
import com.example.lesson6.interfaces.OnItemClickListener;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameHolder> {
    private List<GameModel> list;
    OnItemClickListener onItemClickListener;
    private LayoutInflater inflater;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public GameAdapter(List<GameModel> list, Context context) {
        this.list = list;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public GameAdapter.GameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GameHolder(ListHolderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.GameHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class GameHolder extends RecyclerView.ViewHolder {
        ListHolderBinding binding;

        public GameHolder(@NonNull ListHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(GameModel gameModel) {
            binding.tvTitle.setText(gameModel.getLevel());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.OnItemClick(getAdapterPosition(), gameModel);
                }
            });
        }
    }
}
