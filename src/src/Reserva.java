import java.time.LocalDateTime;

public class Reserva {

    private int id;
    private int reserva ;
    private LocalDateTime horario;

    public Reserva (Usuario usuario, LocalDateTime horario){
        horario.withSecond(0).withNano(0);
    }

    public void aumentar(int quantidade) {
        reserva += quantidade;
    }
    public boolean temDisponivel(int quantidade) {
        return reserva >= quantidade;
    }

    public Object getData() {
         return null;
    }

    public LocalDateTime getHorario() {
        return horario;
    }
}
