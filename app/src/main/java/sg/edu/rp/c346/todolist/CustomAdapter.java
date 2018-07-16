package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


import sg.edu.rp.c346.todolist.R;
import sg.edu.rp.c346.todolist.ToDoItem;

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> ToDoList;

    //TODO
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ToDoItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        ToDoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvItems = rowView.findViewById(R.id.textViewItems);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        ToDoItem currentItem = ToDoList.get(position);
        String items = currentItem.getItems();
        String date = currentItem.getDate();
        tvItems.setText(items);
        tvDate.setText(date);

        return rowView;
    }
}
