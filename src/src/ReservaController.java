import java.time.LocalDateTime;


public class ReservaController {

    private ReservaService reservaService;
    private double valortotal;


    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    public Reserva registrarReserva(Usuario usuario, LocalDateTime horario) {

        return new Reserva(usuario, horario);

    }

    public double calcularTotalValorDia(Usuario cliente, double valor, int quantidadeReservas) {
        double valortotal=1;
        valortotal= valortotal + valor;
        if (quantidadeReservas > 1) {

            valortotal++;
        }

        return valortotal;
    }

}