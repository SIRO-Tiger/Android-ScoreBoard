package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.scoreboard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    MyViewModel myViewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(this);
//        myViewModel.getScore1().observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer integer) {
//                binding.textView3.setText(String.valueOf(integer));
//            }
//        });
//        myViewModel.getScore2().observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer integer) {
//                binding.textView4.setText(String.valueOf(integer));
//            }
//        });
//        binding.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myViewModel.add1(1);
//            }
//        });
//        binding.button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myViewModel.add2(1);
//            }
//        });
//        binding.button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myViewModel.add1(2);
//            }
//        });
    }
}
