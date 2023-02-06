import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // usuarios
        Usuario eps = new EPS("Juan","Restrepo",111,"hola@gmail.com");
        Usuario poliza = new Poliza("Luis","Penagos",1112,"chao@hotmail.com");
        Usuario particular = new Particular("Manuel","Restrepo",1113,"1234@gmail.com");

        //especialidades
        Especialidad medGeneral = new Especialidad("Medicina",1,"General");
        Especialidad medInterna = new Especialidad("Medicina",2,"Interna");
        Especialidad medDeporte = new Especialidad("Medicina",3,"Deporte");

        System.out.println("------------------------");
        Hospital hosp = new Hospital(1000000);
        hosp.agendarCita(medGeneral,eps, LocalDate.now());
        System.out.println("------------------------");
        hosp.agendarCita(medInterna,poliza,LocalDate.now());
        System.out.println("------------------------");
        hosp.agendarCita(medDeporte,particular,LocalDate.now());
    }
}