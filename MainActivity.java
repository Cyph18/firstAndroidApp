package cyphertechnologies.jahedsoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextPage = (Button) findViewById(R.id.button16);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page2.class);
                startActivity(intent);
            }
        });

            final MediaPlayer sureMP = MediaPlayer.create(this, R.raw.jsure);

        Button sure = (Button) this.findViewById(R.id.button1);

        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sureMP.start();
            }

        });

            final MediaPlayer nottodayMP = MediaPlayer.create(this, R.raw.jnottoday);
        Button nottoday = (Button) this.findViewById(R.id.button2);
        nottoday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nottodayMP.start();

            }
        });

            final MediaPlayer maybelaterMP = MediaPlayer.create(this, R.raw.jmaybelater);

        Button maybelater = (Button) this.findViewById(R.id.button);

        maybelater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maybelaterMP.start();
            }
        });

            final MediaPlayer backyardMP = MediaPlayer.create(this, R.raw.backyard);

        Button backyard = (Button) this.findViewById(R.id.button3);

        backyard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backyardMP.start();

            }
        });

            final MediaPlayer iknowMP = MediaPlayer.create(this, R.raw.jiknow);
        Button iknow = (Button) this.findViewById(R.id.button4);

        iknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iknowMP.start();
            }
        });

            final MediaPlayer jamaicaaveMP = MediaPlayer.create(this, R.raw.jamaicaave);

        Button jamaicaave = (Button) this.findViewById(R.id.button5);

        jamaicaave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                jamaicaaveMP.start();
            }
        });

            final MediaPlayer illseeMP = MediaPlayer.create(this, R.raw.illsee);

        Button illsee = (Button) this.findViewById(R.id.button6);

        illsee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illseeMP.start();
            }

        });

            final MediaPlayer inabitMP = MediaPlayer.create(this, R.raw.inabit);

        Button inabit = (Button) this.findViewById(R.id.button7);

        inabit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                inabitMP.start();
            }
        });

            final MediaPlayer icometommorowMP = MediaPlayer.create(this, R.raw.icometommorow);

        Button icometommorow = (Button) this.findViewById(R.id.button8);

        icometommorow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                icometommorowMP.start();
            }
        });

            final MediaPlayer buyingmilkMP = MediaPlayer.create(this, R.raw.buyingmilk);

        Button buyingmilk = (Button) this.findViewById(R.id.button9);

        buyingmilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyingmilkMP.start();
            }
        });

            final MediaPlayer imtutoringMP = MediaPlayer.create(this, R.raw.imtutoring);

        Button imtutoring = (Button) this.findViewById(R.id.button10);

        imtutoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imtutoringMP.start();
            }
        });

            final MediaPlayer fivetwosixMP = MediaPlayer.create(this, R.raw.fivetwosix);

        Button imcomingout = (Button) this.findViewById(R.id.button11);

        imcomingout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fivetwosixMP.start();
            }
        });

            final MediaPlayer letmeaskMP = MediaPlayer.create(this, R.raw.letmeask);

        Button letmeask = (Button) this.findViewById(R.id.button12);

        letmeask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                letmeaskMP.start();
            }
        });

            final MediaPlayer forsayMP = MediaPlayer.create(this, R.raw.forsay);

        Button forsay = (Button) this.findViewById(R.id.button13);

        forsay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                forsayMP.start();
            }
        });

            final MediaPlayer ineverMP = MediaPlayer.create(this, R.raw.inever);

        Button ineversaidthat = (Button) this.findViewById(R.id.button14);

        ineversaidthat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ineverMP.start();
            }
        });


    }
}
