package com.example.tubes_a1h;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tubes_a1h.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {
    private FragmentMainBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        binding = FragmentMainBinding.inflate(inflater,container,false);
        View view = this.binding.getRoot();
        return view;
    }

    public static MainFragment newInstance(String title){
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

}
