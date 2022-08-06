package com.example.convidados.ui.all;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.convidados.databinding.FragmentAllGuestsBinding;

public class AllGuestsFragment extends Fragment {

    private FragmentAllGuestsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        AllGuestsViewModel allGuestsViewModel =new ViewModelProvider(this).get(AllGuestsViewModel.class);
        binding = FragmentAllGuestsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAllGuests;
        allGuestsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}