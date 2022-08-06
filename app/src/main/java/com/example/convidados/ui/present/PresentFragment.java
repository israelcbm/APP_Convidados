package com.example.convidados.ui.present;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.convidados.databinding.FragmentAllGuestsBinding;

public class PresentFragment extends Fragment {

    private FragmentAllGuestsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PresentViewModel presentViewModel =
                new ViewModelProvider(this).get(PresentViewModel.class);

        binding = FragmentAllGuestsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAllGuests;
        presentViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}