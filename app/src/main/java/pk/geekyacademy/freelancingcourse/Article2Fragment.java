package pk.geekyacademy.freelancingcourse;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import pk.geekyacademy.freelancingcourse.databinding.FragmentArticle2Binding;

public class Article2Fragment extends Fragment {

    FragmentArticle2Binding binding;

    public Article2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentArticle2Binding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AdView adView1 = binding.adView1;
        AdRequest adRequest1 = new AdRequest.Builder().build();
        adView1.loadAd(adRequest1);

        AdView adView2 = binding.adView2;
        AdRequest adRequest2 = new AdRequest.Builder().build();
        adView2.loadAd(adRequest2);
    }
}