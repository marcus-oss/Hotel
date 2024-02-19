import Agencia.Cadastrohotel;
import Agencia.Hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Principal {
    public static void main(String[] args) {

        Cadastrohotel cadastro = new Cadastrohotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

//        cadastro.removerCidade("Fortim/CE");
//        cadastro.removerTodos();
//        cadastro.remover(new Hotel("Hotel Fazenda Dona Carolina", "Itatiba/SP", 0));
        ArrayList<Hotel> hoteis = cadastro.obterTodos();
//        int indice = hoteis.indexOf(new Hotel("Mercure", "Uberlândia/MG", 0));
//        hoteis.add(new Hotel("teste", "Miraselva/PR", 0));

//        System.out.println(indice);

//        System.out.println(hoteis.get(indice));
        imprimirHoteis(hoteis);

    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (Hotel hotel : hoteis) {

            System.out.printf("%s (%s) => %.2f%n ", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }


        //        while (hotelIterator.hasNext()) {
//            Hotel hotel = hotelIterator.next();
//            System.out.printf("%s (%s) => %.2f%n ", hotel.getNome(),
//                    hotel.getCidade(), hotel.getPrecoDiaria());
//
//
//        }

//        for (int i = 0; i < hoteis.size(); i++) {
//            Hotel hotel = hoteis.get(i);
//            System.out.printf("%s (%s) => %.2f%n ", hotel.getNome(),
//                    hotel.getCidade(), hotel.getPrecoDiaria());
//        }
    }

}