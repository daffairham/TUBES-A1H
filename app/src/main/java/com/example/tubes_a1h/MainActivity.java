package com.example.tubes_a1h;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tubes_a1h.databinding.ActivityMainBinding;
import com.example.tubes_a1h.databinding.BuatPertemuanBinding;
import com.example.tubes_a1h.databinding.DaftarDokterBinding;
import com.example.tubes_a1h.databinding.FragmentMainBinding;

public class MainActivity extends AppCompatActivity {

    protected ActivityMainBinding binding;
    protected MainFragment mainFragment;
    protected FragmentManager fragmentManager;
    protected Pertemuan pertemuanFragment;
    protected DaftarDokter dokterFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.mainFragment = mainFragment.newInstance();
        this.pertemuanFragment = pertemuanFragment.newInstance();
        this.dokterFragment = dokterFragment.newInstance();
        this.setSupportActionBar(binding.toolbar);

        ActionBarDrawerToggle abdt = new ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.openDrawer, R.string.closeDrawer);
        this.binding.drawerLayout.addDrawerListener(abdt);
        abdt.syncState();

        this.fragmentManager = this.getSupportFragmentManager();

        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container, mainFragment)
                .addToBackStack(null)
                .commit();
        this.getSupportFragmentManager().setFragmentResultListener("changePage", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                int page = result.getInt("page");
                changePage(page);
            }
        });
    }
    public void changePage(int page){
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        if(page==1){
            ft.replace(binding.fragmentContainer.getId(), this.mainFragment).addToBackStack(null).setReorderingAllowed(true);
        }else if(page==2) {
            ft.replace(binding.fragmentContainer.getId(), this.pertemuanFragment).addToBackStack(null).setReorderingAllowed(true);
        }else if(page==3){
            ft.replace(binding.fragmentContainer.getId(), this.dokterFragment).addToBackStack(null).setReorderingAllowed(true);
        }
        else if(page==0){
            this.moveTaskToBack(true);
            this.finish();
        }
        ft.commit();
    }
}
