package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvItems;
    ArrayList<ToDoItem> alToDoItem;
    CustomAdapter caToDoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.listViewItems);

        alToDoItem = new ArrayList<>();
        ToDoItem item1 = new ToDoItem("MSA", "1/7/2018");
        ToDoItem item2 = new ToDoItem("Go for haircut", "22/9/2018");
        alToDoItem.add(item1);
        alToDoItem.add(item2);


        caToDoList = new CustomAdapter(this, R.layout.todo_item, alToDoItem);
        lvItems.setAdapter(caToDoList);
    }
}
