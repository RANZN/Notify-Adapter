package com.ranzan.notifyadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BoxAdapter extends RecyclerView.Adapter<BoxViewHolder> {
    private ArrayList<Box> boxList;
    private OnItemClicked onItemClicked;

    public BoxAdapter(ArrayList<Box> boxList, OnItemClicked onItemClicked) {
        this.boxList = boxList;
        this.onItemClicked = onItemClicked;
    }

    @NonNull

    @Override
    public BoxViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new BoxViewHolder(view, onItemClicked);
    }

    @Override
    public void onBindViewHolder(@NonNull BoxViewHolder holder, int position) {
        Box box = boxList.get(position);
        holder.setData(box);
    }

    @Override
    public int getItemCount() {
        return boxList.size();
    }
}
