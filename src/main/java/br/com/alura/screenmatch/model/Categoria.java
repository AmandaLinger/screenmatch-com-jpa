package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action"), //criando o tipo da categoria e passando o valor correspondente
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }


    public static Categoria fromString(String text) { //interpreta o valor do ombd e converte para as categorias listadas acima
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}


//o ENUM cria constantes na nossa aplicação