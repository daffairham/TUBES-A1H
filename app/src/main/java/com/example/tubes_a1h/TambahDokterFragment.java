package com.example.tubes_a1h;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tubes_a1h.databinding.FragmentTambahdokterBinding;

public class TambahDokterFragment extends Fragment {
    private FragmentTambahdokterBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentTambahdokterBinding.inflate(inflater, container, false);
        View view = this.binding.getRoot();
        return view;
    }

    public static TambahDokterFragment newInstance(){
        TambahDokterFragment fragment = new TambahDokterFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
}