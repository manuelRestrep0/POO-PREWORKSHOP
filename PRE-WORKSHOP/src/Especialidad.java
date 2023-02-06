public class Especialidad {
    private String nombre;
    private int codigo;
    private String tipo;

    public Especialidad(String nombre, int codigo, String tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
