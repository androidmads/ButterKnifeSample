package com.androidmads.butterknifesample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ToDoActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    public Toolbar toolbar;

    @BindView(R.id.fab)
    public FloatingActionButton fab;

    @BindView(R.id.recycler)
    public RecyclerView recyclerView;

    @BindView(R.id.title)
    public TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        title.setText("ToDo List");
        title.setTextSize(20);

        LinearLayoutManager layoutManager = new LinearLayoutManager(ToDoActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        ToDoAdapter mAdapter = new ToDoAdapter(ToDoActivity.this, getTestData());
        recyclerView.setAdapter(mAdapter);

    }

    public List<ToDoObject> getTestData() {
        List<ToDoObject> cars = new ArrayList<>();
        cars.add(new ToDoObject("Shopping", "Cake"));
        cars.add(new ToDoObject("Shopping", "Cloth"));
        cars.add(new ToDoObject("Shopping", "Color Paper"));
        cars.add(new ToDoObject("HomeWork", "Science"));
        cars.add(new ToDoObject("HomeWork", "Maths"));
        cars.add(new ToDoObject("HomeWork", "Chemistry"));
        return cars;
    }

}
