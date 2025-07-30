package controlador;

import modelo.Estudiante;
import modelo.GestionEstudiante;

public class PracticaMVC {

    public static void main(String[] args) {
        GestionEstudiante.consultarInstancia().crearEstudiante(new Estudiante(208590589, "Josep Andres", "Moya Pichardo"));
        GestionEstudiante.consultarInstancia().crearEstudiante(new Estudiante(208120558, "Maria Jose", "Esquivel Canales"));
        GestionEstudiante.consultarInstancia().crearEstudiante(new Estudiante(207960222, "Freddy", "Salas Aguilar"));

        for (Estudiante estudiante : GestionEstudiante.consultarInstancia().getEstudiantes().values()) {
            System.out.println(estudiante);
        }
        System.out.println(GestionEstudiante.consultarInstancia().consultarEstudiante(208120558));
        GestionEstudiante.consultarInstancia().actualizarEstudiante(new Estudiante(208120558, "Maria Jose", "Ortega Murillo"));
        System.out.println(GestionEstudiante.consultarInstancia().consultarEstudiante(208120558));
        GestionEstudiante.consultarInstancia().eliminarEstudiante(208120558);
        for(Estudiante estudiante : GestionEstudiante.consultarInstancia().getEstudiantes().values()){
        System.out.println(estudiante);
        }
        System.out.println(GestionEstudiante.consultarInstancia().consultarCantidad());
    }

}
