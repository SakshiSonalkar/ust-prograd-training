
import java.util.*;
public class NoteKeeper {

    PriorityQueue<String> todoListCompleted = new PriorityQueue<String>();
    PriorityQueue<String> todoListNotCompleted = new PriorityQueue<String>();
    PriorityQueue<String> todoList = new PriorityQueue<String>();
    ArrayList<String> removedList = new ArrayList<>();

    public void addList(String item, boolean completedOrNotCompleted) {
        if (completedOrNotCompleted) {
            todoListCompleted.add(item);
            todoList.addAll(todoListCompleted);
        } else {
            todoListNotCompleted.add(item);
            todoList.addAll(todoListNotCompleted);
        }

    }

    public String checkList(String item) {
        String existingItem = null;
        for (String list : todoList) {
            if (list == item) {
                existingItem = item;
                break;
            }
        }
        return existingItem;
    }


    public boolean removeList(String item){
        //        boolean task = false;
        return todoList.removeIf(list -> list == item);

    }


    public boolean unRemoveList(String item) {
        boolean task = false;
        removedList.add(item);
        todoList.removeIf(list -> list == item);
        todoList.addAll(removedList);
        if (todoList.contains(item)) {
            task = true;
        }
        removedList.clear();
        return task;
    }

    public void removeAll() throws Exception {
        removedList.addAll(todoList);
        todoList.removeAll(removedList);
        if(todoList.size()==0){
            throw new Exception("ToDoList cannot be empty");
        }
        todoList.addAll(removedList);
        removedList.clear();
    }

    public boolean completedOrNotCompleted(String completedOrNotCompletedList) {
        boolean task = false;
        for (String list : todoListCompleted) {
            if (list.equals(completedOrNotCompletedList)) {
                task = false;
            }
        }
        for (String list : todoListNotCompleted) {
            if (list.equals(completedOrNotCompletedList)) {
                task = true;
            }
        
        }
        return task;
    }


}