package model;

import java.util.Random;

public class Usuario {

    private int id;
    private String nome;
    private int idade;
    private String email;
    private static Random random = new Random();

    public Usuario(String email) {
        this.email = email;
    }

    public Usuario (String nome, int idade, String email){
        this.id = random.nextInt(10)+1;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "Nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
