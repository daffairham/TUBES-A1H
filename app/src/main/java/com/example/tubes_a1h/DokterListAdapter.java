package com.example.tubes_a1h;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tubes_a1h.databinding.BuatPertemuanBinding;
import com.example.tubes_a1h.databinding.DaftarDokterBinding;

import java.util.ArrayList;

class Dokter extends Fragment {
    public String nama;
    public String spesialis;

    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }


    public class DokterListAdapter extends BaseAdapter {
        protected ArrayList<Dokter> dokter;
        protected Activity activity;

        public DokterListAdapter(Activity activity) {
            this.activity = activity;
            this.dokter = new ArrayList<Dokter>();
        }

        public void addLine(String nama, String spesialis) {
            this.dokter.add(new Dokter(nama, spesialis));
            this.notifyDataSetChanged();
        }

        @Override
        public Object getItem(int i) {
            return dokter.get(i);
        }

        @Override
        public int getCount() {
            return dokter.size();
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View itemView = this.activity.getLayoutInflater().inflate(R.layout.list_dokter, null);
            TextView nama = itemView.findViewById(R.id.nama);
            TextView spesialis = itemView.findViewById(R.id.spesialis);
            return nama;
        }
    }
}