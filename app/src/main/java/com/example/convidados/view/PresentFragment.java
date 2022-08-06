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
import com.example.convidados.viewmodel.PresentViewModel;

public class PresentFragment extends Fragment {

    private PresentViewModel presentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        PresentViewModel presentViewModel = new ViewModelProvider(this).get(PresentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_present,container, false);

        final TextView textView = root.findViewById(R.id.text_present);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presentViewModel = null;
    }
}