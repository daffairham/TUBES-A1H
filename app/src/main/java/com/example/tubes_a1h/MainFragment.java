package com.example.tubes_a1h;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.tubes_a1h.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {
    private FragmentMainBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        binding = FragmentMainBinding.inflate(inflater,container,false);
        View view = this.binding.getRoot();
        binding.btnStart.setOnClickListener(this::onClick);
        return view;
    }
    public static MainFragment newInstance(){
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    public void onClick(View view) {
        Bundle res = new Bundle();
        res.putInt("page", 2);
        this.getParentFragmentManager().setFragmentResult("changePage", res);
    }




}
