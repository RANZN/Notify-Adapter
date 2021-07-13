package com.ranzan.notifyadapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class BoxViewHolder extends RecyclerView.ViewHolder {
    private TextView text;
    private OnItemClicked itemClicked;
    private ConstraintLayout layout;

    public BoxViewHolder(@NonNull View itemView, OnItemClicked onItemClicked) {
        super(itemView);
        this.itemClicked = onItemClicked;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        text = itemView.findViewById(R.id.setText);
        layout = itemView.findViewById(R.id.layout);
    }

    public void setData(Box box) {
        text.setText(box.getText());
        if (box.getIsClicked()) {
            layout.setBackgroundColor(ContextCompat.getColor(layout.getContext(), R.color.blue));
            text.setTextColor(ContextCompat.getColor(text.getContext(), R.color.white));
        } else {
            layout.setBackgroundColor(ContextCompat.getColor(layout.getContext(), R.color.white));
            text.setTextColor(ContextCompat.getColor(text.getContext(), R.color.blue));

        }
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClicked.itemClicked(box, getAdapterPosition());
            }
        });
    }
}
