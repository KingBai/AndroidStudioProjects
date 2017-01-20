package com.example.listviewtest;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


/*    private String[] data = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }*/

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initFruits(){
        for (int i = 0; i < 2; i++) {
            Fruit blackverry = new Fruit("Blackverry",R.drawable.blackberry);
            fruitList.add(blackverry);

            Fruit cherry = new Fruit("Cherry",R.drawable.cherry);
            fruitList.add(cherry);

            Fruit chestnuts = new Fruit("Chestnuts",R.drawable.chestnuts);
            fruitList.add(chestnuts);

            Fruit coconut = new Fruit("Coconut",R.drawable.coconut);
            fruitList.add(coconut);

            Fruit grape = new Fruit("Grape",R.drawable.grape);
            fruitList.add(grape);

            Fruit orange = new Fruit("Orange",R.drawable.orange);
            fruitList.add(orange);

            Fruit papaya = new Fruit("Papaya",R.drawable.papaya);
            fruitList.add(papaya);

            Fruit peach = new Fruit("Peach",R.drawable.peach);
            fruitList.add(peach);

            Fruit pear = new Fruit("Pear",R.drawable.pear);
            fruitList.add(pear);

            Fruit persimmon = new Fruit("Persimmon",R.drawable.persimmon);
            fruitList.add(persimmon);

            Fruit pomegranate = new Fruit("Pomegranate",R.drawable.pomegranate);
            fruitList.add(pomegranate);

            Fruit strawberry = new Fruit("Strawberry",R.drawable.strawberry);
            fruitList.add(strawberry);

            Fruit sugarapple = new Fruit("Sugarapple",R.drawable.sugarapple);
            fruitList.add(sugarapple);
        }
    }


}
