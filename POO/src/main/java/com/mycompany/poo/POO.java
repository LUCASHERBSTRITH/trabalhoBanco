package com.mycompany.poo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class POO {

    public static void main(String[] args) {
        ArrayList<User> lista = new ArrayList<User>();
        //variaveis
        int i;
        int op = 100, id = 0;
        double valor = 0, valor2 = 0;
        double saldo = 0;
        String nome = null, cpf = null, cel = null, cpfAchou;
        boolean positivo = false;

        while (op != 0) {

            op = Integer.parseInt(JOptionPane.showInputDialog("Digite o número correspondente a operação que deseja realizar: \n 1 - Cadastrar \n 2 - Atualizar \n 3 - Mostrar \n 4 - Depositar \n 5 - Sacar \n 6 - Delete \n "));

            switch (op) {
                case 1:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Informe id usuário:"));
                    nome = JOptionPane.showInputDialog("Informe seu nome:");
                    cpf = JOptionPane.showInputDialog("Informe seu cpf:");
                    cel = JOptionPane.showInputDialog("Informe seu celular:");
                    /*tranforma string em double*/
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor:"));
                    User usuario = new User(id, nome, cpf, cel, valor);
                    lista.add(usuario);
                    break;

                case 2:

                    cpfAchou = JOptionPane.showInputDialog("informe o cpf:");

                    for (i = 0; i < lista.size(); i++) {
                        positivo = lista.get(i).getCpf().equals(cpfAchou);

                        if (positivo == true) {
                            cel = JOptionPane.showInputDialog("Informe o celular para alterar:");
                            lista.get(i).setCel(cel);
                            i = 10000;
                        }
                    }
                    if (positivo == false) {
                        JOptionPane.showMessageDialog(null, "Usuario não encontrado");
                    }

                    break;
                //for recebe os dados
                case 3:
                    for (User usuario2 : lista) {
                        JOptionPane.showMessageDialog(null,
                                "\nId:" + usuario2.getId()
                                + " \nNome: " + usuario2.getNome()
                                + "\nCpf:" + usuario2.getCpf()
                                + "\nCelular: " + usuario2.getCel()
                                + "\nValor: " + usuario2.getValor()
                        );

                    }

                    break;
//for percorre array e if compara cpf para somar
                case 4:
                     cpfAchou = JOptionPane.showInputDialog("informe o cpf:");

                    for (i = 0; i < lista.size(); i++) {
                        positivo = lista.get(i).getCpf().equals(cpfAchou);

                        if (positivo == true) {
                            valor = lista.get(i).getValor() + Double.parseDouble(JOptionPane.showInputDialog("Adcione saldo:"));
                            lista.get(i).setValor(valor);
                            i = 10000;
                        }
                    }
                    if (positivo == false) {
                        JOptionPane.showMessageDialog(null, "Usuario não encontrado");
                    }
                    
                    
                    
                    break;
////for percorre array e if compara cpf para subtrair
                case 5:
                    cpfAchou = JOptionPane.showInputDialog("informe o cpf:");

                    for (i = 0; i < lista.size(); i++) {
                        positivo = lista.get(i).getCpf().equals(cpfAchou);

                        if (positivo == true) {
                            valor = lista.get(i).getValor() - Double.parseDouble(JOptionPane.showInputDialog("Retire saldo:"));
                            lista.get(i).setValor(valor);
                            i = 10000;
                        }
                    }
                    if (positivo == false) {
                        JOptionPane.showMessageDialog(null, "Usuario não encontrado");
                    }
                   
                    break;

                case 6:
                    cpfAchou = JOptionPane.showInputDialog("informe o cpf:");

                    for (i = 0; i < lista.size(); i++) {
                        positivo = lista.get(i).getCpf().equals(cpfAchou);

                        if (positivo == true) {
                        lista.remove(i);
                        }
                    }
                    if (positivo == false) {
                        JOptionPane.showMessageDialog(null, "Usuario não encontrado");
                    }
                    break;

            }
        }
    }
}
