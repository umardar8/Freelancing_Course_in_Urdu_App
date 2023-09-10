package pk.geekyacademy.freelancingcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import pk.geekyacademy.freelancingcourse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent1 = new Intent(this, FirstActivity.class);
        Intent intent2 = getIntent();
        int value = intent2.getIntExtra("number", 1);

        number = value;
        changeFragment(number);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.back_button) {
                if (number > 0) {
                    number -= 1;
                }
            } else if (item.getItemId() == R.id.next_button) {
                if (number < 2) {
                    number += 1;
                }
            } else {
                number = 0;
            }

            if (number == 0) {
                startActivity(intent1);
            } else {
                changeFragment(number);
            }

            return true;
        });
    }

    private void changeFragment(int num){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (num == 1){
            fragmentTransaction.replace(R.id.frameLayout,new Article1Fragment());
        } else {
            fragmentTransaction.replace(R.id.frameLayout,new Article2Fragment());
        }

        fragmentTransaction.commit();

    }
}