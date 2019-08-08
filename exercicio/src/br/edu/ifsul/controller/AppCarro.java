package br.edu.ifsul.controller;
import br.edu.ifsul.model.Carro;

public class AppCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro);
        carro.setMarca("Nissan");
        carro.setAnoFabricacao(2009);
        carro.setModelo("Gol");
        System.out.println(carro);

        Carro carro2 = new Carro("fiat", "uno" , 2002);
        System.out.println(carro2);



    }
}
