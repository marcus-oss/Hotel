package Agencia;

import java.util.ArrayList;
import java.util.Iterator;

public class Cadastrohotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);
        if (hoteis.contains(hotel)) {
            throw new HotelExistenteException("Hotel já foi adicionado!");
        }

        hoteis.add(hotel);
//        hoteis.add(0, hotel);
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerCidade(String cidade) {
        ArrayList<Hotel> hoteisParaRemovacao = new ArrayList<>();
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove();

            }
        }

        //        for (int i = 0; i < hoteis.size(); i++) {
//            Hotel hotel = hoteis.get(i);
//            if (hotel.getCidade().equals(cidade)) {
//                hoteisParaRemovacao.add(hotel);
////                hoteis.remove(i);
////                i--;
//            }
//        }
        hoteis.removeAll(hoteisParaRemovacao);

    }


    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if (!removido) {
            throw new HotelNaoRemovidoException("Hotel não encontrado para remoção,  tente novamente!");

        }
    }

    public void removerTodos() {
        hoteis.clear();
    }
}
