import Command.AdicionarTarefaCommand;
import Command.GerenciadorDeComandos;
import Command.RemoveTarefaCommand;
import model.Tarefa;
import model.TodoList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        GerenciadorDeComandos gerenciadorDeComandos = new GerenciadorDeComandos();

        Tarefa t1 = (new Tarefa.Builder()).comTitulo("Começar a A3 do Paoli").comDescricao("Ler os requisitos e iniciar a codificação").concluir(true).build();
        Tarefa t2 = (new Tarefa.Builder()).comTitulo("Atribuir as tarefas aos integrantes do grupo").comDescricao("Distribuir partes do código").concluir(true).build();
        Tarefa t3 = (new Tarefa.Builder()).comTitulo("Apagar o código").comDescricao("Remover partes antigas").build();
        Tarefa t4 = (new Tarefa.Builder()).comTitulo("Finalizar o código").comDescricao("Revisar e concluir").build();
        Tarefa t5 = (new Tarefa.Builder()).comTitulo("Fazer documentação do projeto").comDescricao("Apresentação final para o Paoli").build();

        gerenciadorDeComandos.executarComando(new AdicionarTarefaCommand(todoList, t1));
        gerenciadorDeComandos.executarComando(new AdicionarTarefaCommand(todoList, t2));
        gerenciadorDeComandos.executarComando(new AdicionarTarefaCommand(todoList, t3));
        gerenciadorDeComandos.executarComando(new AdicionarTarefaCommand(todoList, t4));
        gerenciadorDeComandos.executarComando(new AdicionarTarefaCommand(todoList, t5));

        System.out.println("Tarefas antes da remoção:");
        todoList.listarTarefas();

        gerenciadorDeComandos.executarComando(new RemoveTarefaCommand(todoList, 3));

        System.out.println("\nTarefas após a remoção:");
        todoList.listarTarefas();


    }
}