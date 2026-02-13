package com.example.samidashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView bankCard,wifiCard,addCard,linksCard,ideaCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

         bankCard= findViewById(R.id.bank_Card);
        wifiCard= findViewById(R.id.wifi_Card);
        ideaCard= findViewById(R.id.idea_Card);
        linksCard= findViewById(R.id.links_Card);
        addCard= findViewById(R.id.add_Card);
        bankCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);
        ideaCard.setOnClickListener(this);
        linksCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent i;
        int id = v.getId(); // Get the ID of the clicked view

        if (id == R.id.bank_Card) {
            i = new Intent(this, Bank.class);
            startActivity(i);
        } else if (id == R.id.wifi_Card) {
            i = new Intent(this, Wifi.class);
            startActivity(i);
        } else if (id == R.id.idea_Card) {
            i = new Intent(this, Idea.class);
            startActivity(i);
        } else if (id == R.id.add_Card) {
            i = new Intent(this, Add.class);
            startActivity(i);
        } else if (id == R.id.links_Card) {
            i = new Intent(this, Links.class);
            startActivity(i);
        }



    }
}