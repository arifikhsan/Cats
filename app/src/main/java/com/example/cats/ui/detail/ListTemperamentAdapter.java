/*
 * Created by Arif Ikhsanudin
 * On 8/12/19 3:26 PM
 */

/*
 * Created by Arif Ikhsanudin
 * On 8/12/19 1:36 PM
 */

package com.example.cats.ui.detail;
// Created by Arif Ikhsanudin on 8/12/2019.

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cats.R;

import java.util.ArrayList;

public class ListTemperamentAdapter extends RecyclerView.Adapter<ListTemperamentAdapter.ListViewHolder> {
    private ArrayList<String> temperaments;

    public ListTemperamentAdapter(ArrayList<String> temperaments) {
        this.temperaments = temperaments;
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvTemperament;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTemperament = itemView.findViewById(R.id.tv_temperament);
        }
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_column_temperament, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.tvTemperament.setText(temperaments.get(position));
    }

    @Override
    public int getItemCount() {
        return temperaments.size();
    }
}
