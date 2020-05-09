package com.example.quiz_07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //옵션메뉴 생성
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        menu.add(0,1,0,"강아지");
        menu.add(0,2,0,"고양이");
        menu.add(0,3,0,"토끼");

        return true;
    }

    //옵션선택 설정
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                ImageView imageView_1 = (ImageView)findViewById(R.id.imageView);
                imageView_1.setImageResource(R.drawable.dog);
                Toast.makeText(this, "강아지", Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                ImageView imageView_2 = (ImageView)findViewById(R.id.imageView);
                imageView_2.setImageResource(R.drawable.cat);
                Toast.makeText(this, "고양이", Toast.LENGTH_SHORT).show();
                return true;
            case 3:
                ImageView imageView_3 = (ImageView)findViewById(R.id.imageView);
                imageView_3.setImageResource(R.drawable.rabbit);
                Toast.makeText(this, "토끼", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}