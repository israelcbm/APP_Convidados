package com.example.convidados.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AllGuestsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AllGuestsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("All Guests");
    }

    public LiveData<String> getText() {
        return mText;
    }
}