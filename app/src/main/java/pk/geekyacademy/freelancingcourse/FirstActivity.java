package pk.geekyacademy.freelancingcourse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.os.LocaleListCompat;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import pk.geekyacademy.freelancingcourse.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    ActivityFirstBinding binding;
    TextView home1;
    ImageView home2;
    ImageView home3;
    ImageView home4;
    ImageView home5;
    ImageView home6;
    ImageView bottom1;
    ImageView bottom2;

    SwitchCompat Switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        AdView adView = binding.adView;
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        home1 = binding.home1;
        home2 = binding.home2;
        home3 = binding.home3;
        home4 = binding.home4;
        home5 = binding.home5;
        home6 = binding.home6;
        bottom1 = binding.bottom1;
        bottom2 = binding.bottom2;
        Switch = binding.switch1;

        Switch.setOnClickListener(view -> {
            if (Switch.isChecked()){
                LocaleListCompat appLocale = LocaleListCompat.forLanguageTags("ur-PK");
                AppCompatDelegate.setApplicationLocales(appLocale);
            } else {
                LocaleListCompat appLocale = LocaleListCompat.forLanguageTags("en-US");
                AppCompatDelegate.setApplicationLocales(appLocale);
            }
        });

        home1.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("number", 1);
            startActivity(intent);
        });

        home2.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("number", 2);
            startActivity(intent);
        });

        home3.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("number", 3);
            startActivity(intent);
        });

        home4.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("number", 4);
            startActivity(intent);
        });

        home5.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("number", 5);
            startActivity(intent);
        });

        home6.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("number", 6);
            startActivity(intent);
        });

        bottom1.setOnClickListener(view -> {
            Intent intent = new Intent(this, WebviewActivity.class);
            startActivity(intent);
        });

        bottom2.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@GeekyAcademyOfficial"));
            startActivity(intent);
        });

    }
}