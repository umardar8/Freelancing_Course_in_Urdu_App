package pk.geekyacademy.freelancingcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.os.LocaleListCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import pk.geekyacademy.freelancingcourse.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    ActivityFirstBinding binding;
    ImageView home1, home2, home3;

    SwitchCompat Switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        home1 = binding.home1;
        home2 = binding.home2;
        home3 = binding.home3;
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
            Intent intent = new Intent(this, WebviewActivity.class);
            startActivity(intent);
        });

    }
}