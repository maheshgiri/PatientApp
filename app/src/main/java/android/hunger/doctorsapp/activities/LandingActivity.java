package android.hunger.doctorsapp.activities;

import android.content.Intent;
import android.hunger.doctorsapp.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by hunger on 4/20/2017.
 */

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    void startMainActivity(){
        final Intent intent=new Intent(this,MainActivity.class);
         startActivity(intent);
    }

    public void loginClickHandler(View view){
      startMainActivity();
    }
    public void sigupClickHandler(View view){
        startMainActivity();
    }

    public void signinwithfacebookClickHandler(View view){
        startMainActivity();
    }

}
