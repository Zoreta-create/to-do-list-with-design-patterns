/* Comando é um padrão de design comportamental que transforma uma solicitação em um objeto independente que 
contém todas as informações sobre ela. Essa transformação permite passar solicitações como argumentos de método, 
atrasar ou enfileirar a execução de uma solicitação e oferecer suporte a operações que podem ser desfeitas.*/

package Command;

public interface Command {
    void execute();
}
