package Command;

import model.TodoList;

public class RemoveTarefaCommand implements Command{
    private TodoList todoList;
    private int index;

    public RemoveTarefaCommand(TodoList todolist, int index) {
        this.todoList = todolist;
        this.index = index;
    }

    public void execute() {
        this.todoList.removerTarefa(this.index);
    }
}
