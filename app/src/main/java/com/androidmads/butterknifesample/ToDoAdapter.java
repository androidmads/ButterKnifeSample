package com.androidmads.butterknifesample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

class ToDoAdapter extends RecyclerView.Adapter<ToDoViewHolder> {
    private Context context;
    private List<ToDoObject> toDoObjectList;

    ToDoAdapter(Context context, List<ToDoObject> toDoObjectList) {
        this.context = context;
        this.toDoObjectList = toDoObjectList;
    }

    @Override
    public ToDoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false);
        return new ToDoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ToDoViewHolder holder, final int position) {
        ToDoObject toDoObject = toDoObjectList.get(position);
        holder.todoType.setText(toDoObject.getTodoType());
        holder.todo.setText(toDoObject.getTodoName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Selected index " + position, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return toDoObjectList.size();
    }
}

