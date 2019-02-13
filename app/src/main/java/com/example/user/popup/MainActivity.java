package com.example.user.popup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buton=findViewById(R.id.butn);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu pop=new PopupMenu(MainActivity.this,buton);
                pop.getMenuInflater().inflate(R.menu.appear,pop.getMenu());
                pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id=item.getItemId();
                        if(id==R.id.wel){
                            Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                            }
                         else if (id==R.id.cam){
                            Toast.makeText(MainActivity.this, "Camera", Toast.LENGTH_SHORT).show();
                        }
                        else if (id==R.id.music){
                            Toast.makeText(MainActivity.this, "Music Player", Toast.LENGTH_SHORT).show();
                        }
                        else if (id==R.id.phone){
                            Toast.makeText(MainActivity.this, "Phone", Toast.LENGTH_SHORT).show();
                        }
                        return false;
                    }
                });
                pop.show();
            }
        });
    }
}
