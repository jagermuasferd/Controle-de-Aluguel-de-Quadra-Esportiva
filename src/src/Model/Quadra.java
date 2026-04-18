package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Quadra {

    private double valor;

    public double getValor() {
        return valor;
    }

    private List<Reserva> reservas = new ArrayList<>();

    public List<Reserva> consultarPorDia(LocalDate data) {

        return reservas.stream()
                .filter(r -> r.getData().equals(data))
                .collect(Collectors.toList());
    }

}
