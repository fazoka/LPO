package br.edu.ifsul.controller;

import br.edu.ifsul.model.Conta;

public class AppConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println(conta);
        System.out.println(conta.getSaldo());
        conta.deposita(500);
        System.out.println(conta.getSaldo());
        conta.saca(250);
        System.out.println(conta.getSaldo());
        conta.atualiza(0.10);
        System.out.println(conta.getSaldo());

        Conta conta2 = new Conta(1000);
        System.out.println(conta2);
        conta2.saca(900);
        conta2.deposita(400);
        conta2.atualiza(0.2);
        conta2.saca(5500);
        System.out.println(conta2);
    }
}