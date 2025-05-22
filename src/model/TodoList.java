package model;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<Tarefa> tarefas = new ArrayList();

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(int index) {
        if (index >= 0 && index < this.tarefas.size()) {
            this.tarefas.remove(index);
        }

    }

    public ArrayList<Tarefa> getTarefas() {
        return this.tarefas;
    }

    public void listarTarefas() {
        System.out.println("\nTarefas:");

        for(int i = 0; i < this.tarefas.size(); ++i) {
            System.out.println(i + " - " + String.valueOf(this.tarefas.get(i)));
        }

    }
}
