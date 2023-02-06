public class EPS extends Usuario {

    private long valorAPagar = 30000;

    public EPS(String nombre, String apellido, int cedula, String correo) {
        super(nombre, apellido, cedula, correo);
    }

    @Override
    public String obtenerTipo() {
        return "EPS";
    }

    @Override
    public long valorAPagar() {
        return this.valorAPagar;
    }

}
