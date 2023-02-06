public class Poliza extends Usuario{

    private long valorAPagar = 40000;
    public Poliza(String nombre, String apellido, int cedula, String correo) {
        super(nombre, apellido, cedula, correo);
    }

    @Override
    public String obtenerTipo() {
        return "Poliza";
    }

    @Override
    public long valorAPagar() {
        return this.valorAPagar;
    }

}
