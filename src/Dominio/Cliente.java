package Dominio;


public class Cliente {
    private String nome;

    public String getNome() {
        return nome;
    }

    private Tipo_Pessoa tipo_pessoa;

    public Cliente(String nome, Tipo_Pessoa tipo_pessoa) {
        this.nome = nome;

        this.tipo_pessoa = tipo_pessoa;
    }
}
