package com.example.recycle;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MeuViewHolder> {
    private List dados;
    public MeuAdapter(List dados) {
        this.dados=dados;
    }

    @NonNull
    @Override
    public MeuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MeuViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dados.size();
    }

    public class MeuViewHolder extends RecyclerView.ViewHolder{
        TextView nome;
        TextView telefone;
        public MeuViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.idNomeL);
            telefone = itemView.findViewById(R.id.idTelefoneL);
        }
    }
}
