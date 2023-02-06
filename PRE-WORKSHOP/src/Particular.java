public class Particular extends Usuario{

    private long valorAPagar = 70000;
    public Particular(String nombre, String apellido, int cedula, String correo) {
        super(nombre, apellido, cedula, correo);
    }

    @Override
    public String obtenerTipo() {
        return "Particular";
    }

    @Override
    public long valorAPagar() {
        return this.valorAPagar;
    }

}
