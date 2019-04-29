package com.mastert.bookmyseat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.Food13_Adapter;
import model.Food13_Model;

public class activity_food13 extends AppCompatActivity {

   String[] Food13_RestaurantName_Id = {"Chicken & Seafood","Fajitas & Enchiladas"};
   String[] Food13_Address_Id = {"7204 Cronin Station Apt. 678","60 Kub Pines Apt. 797"};

   Integer[] Food_13_Image_Id = {R.drawable.checken,R.drawable.friedf};

   private RecyclerView recyclerView;
   private ArrayList<Food13_Model> modelArrayList;
   private Food13_Adapter food13_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food13);


        recyclerView = findViewById(R.id.RecyclerView_food13_id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(activity_food13.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelArrayList = new ArrayList<>();

        for (int i=0;i<Food13_RestaurantName_Id.length;i++){
            Food13_Model food13_model = new Food13_Model(Food13_RestaurantName_Id[i],Food13_Address_Id[i],Food_13_Image_Id[i]);
            modelArrayList.add(food13_model);
        }
        food13_adapter = new Food13_Adapter(activity_food13.this,modelArrayList);
        recyclerView.setAdapter(food13_adapter);
    }
}
