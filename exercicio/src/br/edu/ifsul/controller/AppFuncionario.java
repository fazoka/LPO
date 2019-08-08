package br.edu.ifsul.controller;
import br.edu.ifsul.model.Funcionario;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        System.out.println(funcionario);
        funcionario.setNome("mauricio");
        funcionario.setSalario(20000.00);
        System.out.println(funcionario);

        Funcionario funcionario2 = new Funcionario("teteu", 5000);
        System.out.println(funcionario2);



    }
}
