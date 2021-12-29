package com.example.lesson6.ui.activitis.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.lesson6.ui.activitis.SecondActivity;
import com.example.lesson6.ui.activitis.main.adapter.GameAdapter;
import com.example.lesson6.сlient.GameClient;
import com.example.lesson6.data.GameModel;
import com.example.lesson6.databinding.ActivityMainBinding;
import com.example.lesson6.interfaces.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private List<GameModel> list = new ArrayList<>();
   private GameAdapter gameAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialization();
        listeners();
    }

    private void initialization() {
        list = GameClient.getGameList();
        gameAdapter = new GameAdapter(list, this);
        binding.recyclerView.setAdapter(gameAdapter);

    }
    private void listeners() {
       gameAdapter.setOnItemClickListener(new OnItemClickListener() {
           @Override
           public void OnItemClick(int position, GameModel gameModel) {
               Intent intent = new Intent(MainActivity.this, SecondActivity.class);
               intent.putExtra("kol",gameModel.getQuiz());
               intent.putExtra("lk",gameModel.getAnswerOne());
               intent.putExtra("l",gameModel.getAnswerTwo());
               intent.putExtra("s",gameModel.getAnswerTree());
               intent.putExtra("a",gameModel.getAnswerFour());
               startActivity(intent);
           }
       });
    }
}