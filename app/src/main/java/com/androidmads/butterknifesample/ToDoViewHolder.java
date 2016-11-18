package com.androidmads.butterknifesample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

class ToDoViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.todo_type)
    TextView todoType;
    @BindView(R.id.todo)
    TextView todo;

    ToDoViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

}
