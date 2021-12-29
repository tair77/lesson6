package com.example.lesson6.ui.activitis;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.lesson6.R;
import com.example.lesson6.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getData();
    }

    private void getData() {
        Intent arguments = getIntent();
        String quiz = arguments.getStringExtra("kol");
        binding.tvText.setText(quiz);
        String answerOne = arguments.getStringExtra("lk");
        binding.btnOne.setText(answerOne);
        String answerTwo = arguments.getStringExtra("l");
        binding.btnTwo.setText(answerTwo);
        String answerTree = arguments.getStringExtra("s");
        binding.btnTree.setText(answerTree);
        String answerFour = arguments.getStringExtra("a");
        binding.btnFour.setText(answerFour);


        binding.btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arguments.getStringExtra("kol") == arguments.getStringExtra("kol")) {
                    Toast.makeText(SecondActivity.this, "правильно", Toast.LENGTH_SHORT).show();
                    binding.btnOne.setBackgroundColor(Color.GREEN);
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(1)
                            .playOn(findViewById(binding.btnOne.getId()));
                    new CountDownTimer(3000, 1000) {

                        public void onTick(long millisUntilFinished) {
                            binding.btnOne.setText("Правильно " + millisUntilFinished / 1000);
                        }

                        @RequiresApi(api = Build.VERSION_CODES.M)
                        public void onFinish() {
                            binding.btnOne.setBackgroundColor(getColor(R.color.purple_200));
                            binding.btnOne.setText(arguments.getStringExtra("lk"));
                        }
                    }.start();
                }
            }
        });

        binding.btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arguments.getStringExtra("kol") == arguments.getStringExtra("lk")) {
                    Toast.makeText(SecondActivity.this, "правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SecondActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                    binding.btnTwo.setBackgroundColor(Color.RED);
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(1)
                            .playOn(findViewById(binding.btnTwo.getId()));
                    new CountDownTimer(3000, 1000) {

                        public void onTick(long millisUntilFinished) {
                            binding.btnTwo.setText("Не правильно " + millisUntilFinished / 1000);
                        }

                        @RequiresApi(api = Build.VERSION_CODES.M)
                        public void onFinish() {
                            binding.btnTwo.setBackgroundColor(getColor(R.color.purple_200));
                            binding.btnTwo.setText(arguments.getStringExtra("l"));
                        }
                    }.start();
                }
            }
        });
        binding.btnTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arguments.getStringExtra("kol") == arguments.getStringExtra("l")) {
                    Toast.makeText(SecondActivity.this, "правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SecondActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                    binding.btnTree.setBackgroundColor(Color.RED);
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(1)
                            .playOn(findViewById(binding.btnTree.getId()));
                    new CountDownTimer(3000, 1000) {

                        public void onTick(long millisUntilFinished) {
                            binding.btnTree.setText("Не правильно " + millisUntilFinished / 1000);
                        }

                        @RequiresApi(api = Build.VERSION_CODES.M)
                        public void onFinish() {
                            binding.btnTree.setBackgroundColor(getColor(R.color.purple_200));
                            binding.btnTree.setText(arguments.getStringExtra("s"));
                        }
                    }.start();
                }
            }
        });
        binding.btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arguments.getStringExtra("kol") == arguments.getStringExtra("a")) {
                    Toast.makeText(SecondActivity.this, "правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SecondActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                    binding.btnFour.setBackgroundColor(Color.RED);
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(1)
                            .playOn(findViewById(binding.btnFour.getId()));
                    new CountDownTimer(3000, 1000) {

                        public void onTick(long millisUntilFinished) {
                            binding.btnFour.setText(" Не правильно " + millisUntilFinished / 1000);
                        }

                        @RequiresApi(api = Build.VERSION_CODES.M)
                        public void onFinish() {
                            binding.btnFour.setBackgroundColor(getColor(R.color.purple_200));
                            binding.btnFour.setText(arguments.getStringExtra("a"));
                        }
                    }.start();
                }
            }
        });

    }


}


