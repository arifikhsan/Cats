/*
 * Created by Arif Ikhsanudin
 * On 8/12/19 3:27 PM
 */

/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.ui.cats;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cats.R;
import com.example.cats.models.Cat;

import java.util.ArrayList;

public class ListCatAdapter extends RecyclerView.Adapter<ListCatAdapter.ListViewHolder> {
    private ArrayList<Cat> cats;

    private OnItemClickCallback onItemClickCallback;

    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Cat cat);
    }

    public ListCatAdapter(ArrayList<Cat> cats) {
        this.cats = cats;
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCat;
        TextView tvName, tvOrigin, tvDescription;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCat = itemView.findViewById(R.id.img_cat);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvOrigin = itemView.findViewById(R.id.tv_item_origin);
            tvDescription = itemView.findViewById(R.id.tv_item_description);
        }
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_cat, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Cat cat = cats.get(position);

        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(holder.itemView.getContext());
        circularProgressDrawable.setStrokeWidth(5f);
        circularProgressDrawable.setCenterRadius(30f);
        circularProgressDrawable.start();

        Glide.with(holder.itemView.getContext())
                .load(cat.getImage())
                .apply(new RequestOptions()
                        .placeholder(circularProgressDrawable)
                        .override(60, 60)
                )
                .into(holder.imgCat);

        holder.tvName.setText(cat.getName());
        holder.tvOrigin.setText(cat.getOrigin());
        holder.tvDescription.setText(cat.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(cats.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }
}
