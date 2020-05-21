package com.example.scoreboard;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> score1,score2;

    public MutableLiveData<Integer> getScore1() {
        if(null == score1){
            score1 = new MutableLiveData<>();
            score1.setValue(0);
        }

        return score1;
    }

    public MutableLiveData<Integer> getScore2() {
        if(null == score2){
            score2 = new MutableLiveData<>();
            score2.setValue(0);
        }
        return score2;
    }

    public void add1(int score){
        score1.setValue(score1.getValue() + score);
    }

    public void add2(int score){
        score2.setValue(score2.getValue() + score);
    }

    public void reset(){
        score1.setValue(0);
        score2.setValue(0);
    }
}
