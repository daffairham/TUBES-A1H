package com.example.tubes_a1h;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tubes_a1h.databinding.BuatPertemuanBinding;
import com.example.tubes_a1h.databinding.DaftarDokterBinding;

public class DaftarDokter extends Fragment {
    private DaftarDokterBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DaftarDokterBinding.inflate(inflater, container, false);
        View view = this.binding.getRoot();
        return view;
    }

    public static DaftarDokter newInstance(){
        DaftarDokter fragment = new DaftarDokter();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
}
