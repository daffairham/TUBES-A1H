//package com.example.tubes_a1h;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.fragment.app.Fragment;
//
//import com.example.tubes_a1h.databinding.FragmentLeftBinding;
//
//public class LeftFragment extends Fragment {
//    protected FragmentLeftBinding binding;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        binding = FragmentLeftBinding.inflate(inflater,container,false);
//        View view = binding.getRoot();
//
//        binding.home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Bundle result = new Bundle();
//                result.putInt("page", 1);
//                getParentFragmentManager().setFragmentResult("changePage", result);
//            }
//        });
//
//        binding.pertemuan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Bundle result = new Bundle();
//                result.putInt("page", 2);
//                getParentFragmentManager().setFragmentResult("changePage", result);
//            }
//        });
//
//        binding.dokter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Bundle result = new Bundle();
//                result.putInt("page", 3);
//                getParentFragmentManager().setFragmentResult("changePage", result);
//            }
//        });
//
//        binding.exit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Bundle result = new Bundle();
//                getParentFragmentManager().setFragmentResult("closeApplication", result);
//            }
//        });
//        return view;
//    }
//}
