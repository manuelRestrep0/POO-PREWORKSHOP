import java.time.LocalDate;

public class Hospital {

    private long valorBase;

    public Hospital(long valorBase) {
        this.valorBase = valorBase;
    }

    public void agendarCita(Especialidad especialidad, Usuario usuario, LocalDate fecha){
        System.out.println("Nombre: "+usuario.getNombre());
        System.out.println("Tipo de usuario: "+usuario.obtenerTipo());
        System.out.println("Tipo de especialidad: "+ especialidad.getTipo());
        System.out.println("Fecha de la cita: "+fecha);

        long valorTotal = valorBase + usuario.valorAPagar();

        System.out.println("Valor a pagar: "+valorTotal);
    };


}
