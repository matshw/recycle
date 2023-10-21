package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Pessoa> pessoas;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.idRecycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("AA1","121"));
        pessoas.add(new Pessoa("AA2","122"));
        pessoas.add(new Pessoa("AA3","123"));

        recyclerView.setAdapter(new MeuAdapter(pessoas));
    }
}