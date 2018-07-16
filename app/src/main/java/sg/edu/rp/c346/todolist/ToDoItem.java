package sg.edu.rp.c346.todolist;

public class ToDoItem {

    private String items;
    private String date;

    public ToDoItem(String items, String date) {
        this.items = items;
        this.date = date;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "items='" + items + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
