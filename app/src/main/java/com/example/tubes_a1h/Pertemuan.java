package com.example.tubes_a1h;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tubes_a1h.databinding.BuatPertemuanBinding;

public class Pertemuan extends Fragment {
    private BuatPertemuanBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = BuatPertemuanBinding.inflate(inflater, container, false);
        View view = this.binding.getRoot();
        return view;
    }

    public static Pertemuan newInstance(){
        Pertemuan fragment = new Pertemuan();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
}