package com.example.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
/*        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);//设置布局方向*/
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits(){
        for (int i = 0; i < 2; i++) {
            Fruit blackverry = new Fruit(getRandomLengthName("Blackverry"),R.drawable.blackberry);
            fruitList.add(blackverry);

            Fruit cherry = new Fruit(getRandomLengthName("Cherry"),R.drawable.cherry);
            fruitList.add(cherry);

            Fruit chestnuts = new Fruit(getRandomLengthName("Chestnuts"),R.drawable.chestnuts);
            fruitList.add(chestnuts);

            Fruit coconut = new Fruit(getRandomLengthName("Coconut"),R.drawable.coconut);
            fruitList.add(coconut);

            Fruit grape = new Fruit(getRandomLengthName("Grape"),R.drawable.grape);
            fruitList.add(grape);

            Fruit orange = new Fruit(getRandomLengthName("Orange"),R.drawable.orange);
            fruitList.add(orange);

            Fruit papaya = new Fruit(getRandomLengthName("Papaya"),R.drawable.papaya);
            fruitList.add(papaya);

            Fruit peach = new Fruit(getRandomLengthName("Peach"),R.drawable.peach);
            fruitList.add(peach);

            Fruit pear = new Fruit(getRandomLengthName("Pear"),R.drawable.pear);
            fruitList.add(pear);

            Fruit persimmon = new Fruit(getRandomLengthName("Persimmon"),R.drawable.persimmon);
            fruitList.add(persimmon);

            Fruit pomegranate = new Fruit(getRandomLengthName("Pomegranate"),R.drawable.pomegranate);
            fruitList.add(pomegranate);

            Fruit strawberry = new Fruit(getRandomLengthName("Strawberry"),R.drawable.strawberry);
            fruitList.add(strawberry);

            Fruit sugarapple = new Fruit(getRandomLengthName("Sugarapple"),R.drawable.sugarapple);
            fruitList.add(sugarapple);
        }
    }

    private String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }

}
