package model;

public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean concluida;

    private Tarefa(Builder builder) {
        this.titulo = builder.titulo;
        this.descricao = builder.descricao;
        this.concluida = builder.concluida;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean isConcluida() {
        return this.concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    public String toString() {
        String var10000 = this.concluida ? "[s]" : "[n]";
        return var10000 + this.titulo + " - " + this.descricao;
    }

    public static class Builder {
        private String titulo;
        private String descricao;
        private boolean concluida = false;

        public Builder comTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder comDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder concluir(boolean concluida) {
            this.concluida = concluida;
            return this;
        }

        public Tarefa build() {
            return new Tarefa(this);
        }
    }

}
