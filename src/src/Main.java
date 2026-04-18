import Model.Reserva;
import Model.Quadra;
import Model.Usuario;
import Controller.ReservaController;
import Service.ReservaService;

public static void main(String[] args){

    Usuario usuario = new Usuario("jabas","4499432083",1);
    Reserva registrarReserva = new Reserva(usuario,LocalDateTime.now());
    ReservaService reservaService = new ReservaService();
    ReservaController controller = new ReservaController(reservaService);
    controller.calcularTotalValorDia(usuario,17.75,3);

}

