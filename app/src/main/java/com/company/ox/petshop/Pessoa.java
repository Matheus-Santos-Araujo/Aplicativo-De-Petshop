package com.company.ox.petshop;
import java.util.Random;

/**
 * Created by matheus_araujo on 15/11/17.
 */

public class Pessoa {


    public Pessoa(String UID) {
        this.UID = UID;
    }

    private final String UID;
    private String nome;
    private int idade;
    private double pesoanimal;
    private boolean animal;

    public String getUID() {
        return UID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAnimal() {
        return animal;
    }

    public void setAnimal(boolean animal) {
        this.animal = animal;
    }

    public double getPesoanimal() {
        return pesoanimal;
    }

    public void setPesoanimal(double pesoanimal) {
        this.pesoanimal = pesoanimal;
    }

    /**
     * @return Uma identificaçao unica para o objeto Pessoa.
     */
    public static String criarUID() {
        return "@Pessoa:" + System.currentTimeMillis() + new Random().nextDouble();
    }
}

