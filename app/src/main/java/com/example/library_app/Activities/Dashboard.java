package com.example.library_app.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.library_app.Adapters.CategoryAdapter;
import com.example.library_app.Adapters.PopularAdapter;
import com.example.library_app.Domains.CategoryDomain;
import com.example.library_app.Domains.PopularDomain;
import com.example.library_app.R;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular,adapterCat;
    private  RecyclerView recyclerViewPopular,recyclerViewCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain>items=new ArrayList<>();
        items.add(new PopularDomain("Rich Dad Poor Dad ","Robert Kiyosaki","Rich Dad Poor Dad by Robert Kiyosaki offers financial wisdom through contrasting the mindsets of two fathers, guiding towards wealth accumulation.",2,true,4.8,"c1",true,1000));
        items.add(new PopularDomain("The Alchemist","Paulo Coelho","The Alchemist follows Santiago, a shepherd boy, on a journey of self-discovery and fulfilling his dreams amidst magical encounters.",3,true,4.3,"c2",false,1500));
        items.add(new PopularDomain("To Kill a Mockingbird","Harper Lee","To Kill a Mockingbird explores racial injustice and moral growth in the 1930s American South through the eyes of young Scout Finch.",1,true,4.9,"c3",false,13000));

        recyclerViewPopular=findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterPopular=new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);


        ArrayList<CategoryDomain> catsList=new ArrayList<>();
        catsList.add(new CategoryDomain("Books","cate1"));
        catsList.add(new CategoryDomain("Magazine","cate2"));
        catsList.add(new CategoryDomain("Newspapers","cate3"));
        catsList.add(new CategoryDomain("Research","cate4"));
        catsList.add(new CategoryDomain("DVD","cate5"));
        catsList.add(new CategoryDomain("Tools","cate6"));


        recyclerViewCategory=findViewById((R.id.view_cat));
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterCat= new CategoryAdapter(catsList);
        recyclerViewCategory.setAdapter(adapterCat);

    }
}
