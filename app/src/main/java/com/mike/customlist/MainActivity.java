package com.mike.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    CustomAdapter adapter;
    ArrayList people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listwatu);
        people = new ArrayList<Item>();
        Item Mtu1 = new Item("Mike Mutuma","0710326580",R.drawable.netflix);
        Item Mtu2 = new Item("Eva Karambu","07124042165",R.drawable.netflix);
        Item Mtu3 = new Item("Robi Kigo","0722746766",R.drawable.netflix);
        Item Mtu4 = new Item("Sue Mumbi","0714543767",R.drawable.netflix);
        Item Mtu5 = new Item("Jack Kod","0777854485",R.drawable.netflix);
        Item Mtu6 = new Item("Jessie Murage","0789785464",R.drawable.netflix);
        Item Mtu7 = new Item("Alex Kwambox","0787454567",R.drawable.netflix);
        Item Mtu8 = new Item("Shaffie Weru","0724545634",R.drawable.netflix);
        Item Mtu9 = new Item("Brenda Wairimu","0732536757",R.drawable.netflix);
        Item Mtu10 = new Item("Betsy Murage","0718785675",R.drawable.netflix);

        people.add(Mtu1);
        people.add(Mtu2);
        people.add(Mtu3);
        people.add(Mtu4);
        people.add(Mtu5);
        people.add(Mtu6);
        people.add(Mtu7);
        people.add(Mtu8);
        people.add(Mtu9);
        people.add(Mtu10);

        adapter = new CustomAdapter(MainActivity.this,people);
        list.setAdapter(adapter);

    }
}
