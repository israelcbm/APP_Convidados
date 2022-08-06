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
import com.example.convidados.databinding.FragmentAbsentBinding;
import com.example.convidados.viewmodel.AbsentViewModel;

public class AbsentFragment extends Fragment {

    private AbsentViewModel absentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        this.absentViewModel = new ViewModelProvider(this).get(AbsentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_absent, container, false);

        final TextView textView = root.findViewById(R.id.text_absent);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        absentViewModel = null;
    }
}