public abstract class Usuario {
    private String nombre;
    private String apellido;
    private int cedula;
    private String correo;
    public abstract String obtenerTipo();

    public abstract long valorAPagar();

    public Usuario(String nombre, String apellido, int cedula, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
    };

    public String getNombre() {
        return nombre;
    }
}
