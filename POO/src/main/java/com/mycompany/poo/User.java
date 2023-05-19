/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.poo;

/*
 *
 * @author SENAC
 */
public class User {

    public int id;
    public String nome;
    public String cpf;
    public String cel;
    public double valor;

    public User(int id, String nome, String cpf, String cel, double valor) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cel = cel;
        this.valor = valor;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void deposita() {

    }
    
    @Override 
    public String toString(){
            return this.id + this.nome + this.cpf;
}
}    
