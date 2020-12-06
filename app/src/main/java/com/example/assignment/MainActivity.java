package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    //    private View animator;
//    private float arrowUpX;
//    private float arrowUpY;
//    private float arrowDownX;
//    private float arrowDownY;
//    private float arrowRightX;
//    private float arrowRightY;
    private float arrowLeftX;
    private float arrowLeftY;
    ImageView car;
    //    TextView textView1;
//    ImageView firstsmallimage, secondsmallimage, thirdsmallimage, fourthsmallimage, firstroad,
//            secondroad, thirdroad, biggreenflag, bigredflag1, bigredflag2, bigredflag3, bigredflag4,
//            bigredflag5, smallredflag1, smallredflag2, smallredflag3, homeicon, car;
    // Initialize Class
    private Handler handler = new Handler();
    private Timer timer = new Timer();

    // Status Check
    private boolean pause_flg = false;

    // Screen Size
    private int screenWidth;
    private int screenHeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        animator = findViewById(R.id.la_view);

        //hooks
//        textView1 = findViewById(R.id.textView1);
//        firstsmallimage = findViewById(R.id.firstsmall);

//        secondsmallimage = findViewById(R.id.secondsmallimage);
//        thirdsmallimage = findViewById(R.id.thirdsmallimage);
//        fourthsmallimage = findViewById(R.id.smallimagefourth);
//        firstroad = findViewById(R.id.firstroad);
//        secondroad = findViewById(R.id.secondroad);
//        thirdroad = findViewById(R.id.thirdroad);
//        biggreenflag = findViewById(R.id.biggreenflag);
//        bigredflag1 = findViewById(R.id.bigredflag1);
//        bigredflag3 = findViewById(R.id.bigredflag3);
//        bigredflag4 = findViewById(R.id.bigredflag4);
//        bigredflag5 = findViewById(R.id.bigredflag5);
//        smallredflag1 = findViewById(R.id.smallredflag1);
//        smallredflag2 = findViewById(R.id.smallredflag2);
//        smallredflag3 = findViewById(R.id.smallredflag3);
//        homeicon = findViewById(R.id.homeicon);

        car = findViewById(R.id.car);
        // Get Screen Size.
        WindowManager wm = getWindowManager();
        Display disp = wm.getDefaultDisplay();
        Point size = new Point();
        disp.getSize(size);
        screenWidth = size.x;
        screenHeight = size.y;

        // Move to out of screen.
//        car.setX(-80.0f);
//        car.setY(-80.0f);
//        car.setX(-80.0f);
//        car.setY(screenHeight + 80.0f);
//        car.setX(screenWidth + 80.0f);
//        car.setY(-80.0f);
        car.setX(-80.0f);
        car.setY(-80.0f);


        // Start the timer.
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        changePos();
                    }
                });
            }
        }, 0, 20);

    }

    public void changePos() {
//        // Up
//        arrowUpY -= 10;
//        if (car.getY() + car.getHeight() < 0) {
//            arrowUpX = (float) Math.floor(Math.random() * (screenWidth - car.getWidth()));
//            arrowUpY = screenHeight + 100.0f;
//        }
//        car.setX(arrowUpX);
//        car.setY(arrowUpY);
//
//        // Down
//        arrowDownY += 10;
//        if (car.getY() > screenHeight) {
//            arrowDownX = (float) Math.floor(Math.random() * (screenWidth - car.getWidth()));
//            arrowDownY = -100.0f;
//        }
//        car.setX(arrowDownX);
//        car.setY(arrowDownY);
//
//        // Right
//        arrowRightX += 10;
//        if (car.getX() > screenWidth) {
//            arrowRightX = -100.0f;
//            arrowRightY = (float) Math.floor(Math.random() * (screenHeight - car.getHeight()));
//        }
//        car.setX(arrowRightX);
//        car.setY(arrowRightY);

        // Left
        arrowLeftX -= 10;
        if (car.getX() + car.getWidth() < 0) {
            arrowLeftX = screenWidth + 100.0f;
            arrowLeftY = (float) Math.floor(Math.random() * (screenHeight - car.getHeight()));
        }
        car.setX(arrowLeftX);
        car.setY(arrowLeftY);

    }


}