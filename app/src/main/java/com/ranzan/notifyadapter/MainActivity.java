package com.ranzan.notifyadapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClicked {
    private ArrayList<Box> boxList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BoxAdapter boxAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        boxAdapter = new BoxAdapter(boxList, this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(boxAdapter);
    }

    private void buildData() {
        Box box1 = new Box("Books", false);
        Box box2 = new Box("Podcasts", false);
        Box box3 = new Box("News", false);
        Box box4 = new Box("Business", false);
        Box box5 = new Box("Entertainment", false);
        Box box6 = new Box("Sports", false);
        Box box7 = new Box("Technology", false);
        Box box8 = new Box("Pronunciation", false);
        Box box9 = new Box("Grammar", false);
        Box box10 = new Box("Health", false);
        Box box11 = new Box("Gaming", false);
        Box box12 = new Box("Books", false);
        Box box13 = new Box("Podcasts", false);
        Box box14 = new Box("Business", false);
        Box box15 = new Box("Entertainment", false);
        Box box16 = new Box("Sports", false);
        Box box17 = new Box("Technology", false);
        Box box18 = new Box("Pronunciation", false);
        Box box19 = new Box("Grammar", false);
        Box box20 = new Box("Health", false);
        Box box21 = new Box("Gaming", false);
        Box box22 = new Box("Entertainment", false);
        Box box23 = new Box("News", false);
        boxList.add(box1);
        boxList.add(box2);
        boxList.add(box3);
        boxList.add(box4);
        boxList.add(box5);
        boxList.add(box6);
        boxList.add(box7);
        boxList.add(box8);
        boxList.add(box9);
        boxList.add(box10);
        boxList.add(box11);

        boxList.add(box12);
        boxList.add(box13);
        boxList.add(box14);
        boxList.add(box15);
        boxList.add(box16);
        boxList.add(box17);
        boxList.add(box18);
        boxList.add(box19);
        boxList.add(box20);
        boxList.add(box21);
        boxList.add(box22);
        boxList.add(box23);

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void itemClicked(Box box, int position) {
        if (box.getIsClicked()) {
            box.setClicked(false);
        } else box.setClicked(true);
        boxList.set(position, box);
        boxAdapter.notifyDataSetChanged();


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}