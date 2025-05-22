package Command;

import model.Tarefa;
import model.TodoList;

public class AdicionarTarefaCommand implements Command {
    private TodoList todoList;
    private Tarefa tarefa;

    public AdicionarTarefaCommand(TodoList todoList, Tarefa tarefa) {
        this.todoList = todoList;
        this.tarefa = tarefa;
    }

    public void execute() {
        this.todoList.adicionarTarefa(this.tarefa);
    }
}
