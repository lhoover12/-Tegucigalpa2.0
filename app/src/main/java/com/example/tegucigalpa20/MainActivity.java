package com.example.tegucigalpa20;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.tegucigalpa20.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        setContentView(R.layout.activity_main);
       // setSupportActionBar(binding.toolbar);

        final ImageButton button = (ImageButton) findViewById(R.id.Button2);
        final ImageButton button2 = (ImageButton) findViewById(R.id.Button);
        final ImageButton button3 = (ImageButton) findViewById(R.id.Button3);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView imageView3= (ImageView) findViewById(R.id.imageView3);
        final ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        final ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        final ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        final ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                final TextView text = (TextView) findViewById(R.id.textView2);
                text.setText("Michael Smells");
                button.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);


                new CountDownTimer(7000, 200) {
                    public void onFinish() {
                        text.setText("Tegucigalpa");
                        text.setTextSize(24);
                        button.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);


                    }

                    public void onTick(long millisUntilFinished) {
                        // millisUntilFinished    The amount of time until finished.

                        Random rand = new Random();
                        int n = rand.nextInt(50);
                        text.setTextSize(n);
                        text.setTextColor(Color.rgb(getN(), getN(), getN()));

                    }
                }.start();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                final TextView text = (TextView) findViewById(R.id.textView2);

                text.setText("How Smelly is Michael?");
                button.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                progressBar.setVisibility(View.VISIBLE);


                new CountDownTimer(10000, 100) {
                    int c = 0;
                    boolean b;
                    public void onFinish() {
                        text.setTextColor(Color.BLACK);
                        text.setText("Smelliness Overload");
                        text.setTextSize(24);
                        button.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);
                        progressBar.setVisibility(View.INVISIBLE);


                    }

                    public void onTick(long millisUntilFinished) {
                        // millisUntilFinished    The amount of time until finished.
                        c++;

                        if (c < 50) {
                            text.setText("How Smelly is Michael? " + c + " %");
                        } else if (c > 50 && c < 75) {
                            text.setText("Critical Smelliness " + c + " %");
                        } else if (c > 75) {
                            text.setText("Danger! " + c + " %");
                            if (b == true) {
                                text.setTextColor(Color.WHITE);
                                b = false;
                            } else {
                                text.setTextColor(Color.RED);
                                b = true;
                            }
                        }
                        progressBar.setProgress(c);

                    }
                }.start();

            }


        });

        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {
                final TextView text = (TextView) findViewById(R.id.textView2);

                text.setText("How Smelly is Michael?");
                button.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.VISIBLE);
                imageView7.setVisibility(View.VISIBLE);

                imageView2.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.VISIBLE);
                imageView5.setVisibility(View.VISIBLE);
                imageView6.setVisibility(View.VISIBLE);
                imageView2.setScaleY(500);



                new CountDownTimer(5000, 5) {
                    int c = 0;

                    public void onFinish() {
                        text.setText("Tegucigalpa");
                        text.setTextSize(24);
                        button.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);
                        imageView2.setVisibility(View.INVISIBLE);
                        imageView3.setVisibility(View.INVISIBLE);
                        imageView4.setVisibility(View.INVISIBLE);
                        imageView5.setVisibility(View.INVISIBLE);
                        imageView6.setVisibility(View.INVISIBLE);
                        imageView7.setVisibility(View.INVISIBLE);
                        imageView.setVisibility(View.INVISIBLE);
                        imageView2.setY(500);

                        imageView3.setY(500);

                        imageView4.setY(500);
                        imageView5.setY(500);
                        imageView6.setY(500);


                    }

                    public void onTick(long millisUntilFinished) {
                        // millisUntilFinished    The amount of time until finished.
                        float ro = imageView.getRotationX();
                        ro= ro +10;
                        imageView.setRotationX(ro);
                        imageView2.setY(imageView2.getY() -2);

                        imageView3.setY(imageView3.getY() -4);

                        imageView4.setY(imageView4.getY() -3);
                        imageView5.setY(imageView5.getY() -8);
                        imageView6.setY(imageView6.getY() -10);



                    }
                }.start();

            }


        });



        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client2 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private int getN() {
        Random rand = new Random();
        int n = rand.nextInt(255);
        return n;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}