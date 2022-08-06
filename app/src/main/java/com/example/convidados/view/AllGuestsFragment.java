package com.example.convidados.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.convidados.R;
import com.example.convidados.databinding.FragmentAllGuestsBinding;
import com.example.convidados.viewmodel.AllGuestsViewModel;

public class AllGuestsFragment extends Fragment {

    private AllGuestsViewModel allGuestsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        AllGuestsViewModel allGuestsViewModel = new ViewModelProvider(this).get(AllGuestsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_all_guests, container, false);

        final TextView textView = root.findViewById(R.id.text_all_guests);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        allGuestsViewModel = null;
    }
}