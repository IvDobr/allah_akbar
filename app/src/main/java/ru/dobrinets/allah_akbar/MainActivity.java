package ru.dobrinets.allah_akbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bomb;
    ImageView explosion;
    ImageView smoke;

    Button btnWar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bomb = (ImageView) findViewById(R.id.bomb);
        explosion = (ImageView) findViewById(R.id.explosion);
        smoke = (ImageView) findViewById(R.id.smoke);

        btnWar = (Button) findViewById(R.id.babah);

        btnWar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Animation animBomb = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bomb_fall);

                bomb.startAnimation(animBomb);

                Animation animExplosion = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.booom);

                explosion.startAnimation(animExplosion);

                Animation animSmoke = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.smoker);

                smoke.startAnimation(animSmoke);
            }
        });
    }
}
