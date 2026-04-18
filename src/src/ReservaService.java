import java.time.LocalDateTime;

public class ReservaService {

        public void validarDisponibilidade(Reserva reserva, int quantidade) {
            if (!reserva.temDisponivel(quantidade)) {
                throw new IllegalArgumentException("model.Reserva já ocupado");
            }
        }

        public void quantidadeReservas(Reserva reserva, int quantidade) {
            reserva.aumentar(quantidade);
        }

         public Reserva registrarReserva(Usuario usuario, LocalDateTime horario){
        return new Reserva(usuario,horario);
         }

}
