package modelo;

import java.util.LinkedHashMap;

public class GestionEstudiante {

    private static GestionEstudiante instanciaGestionEstudiante;
    private LinkedHashMap<Integer, Estudiante> estudiantes;

    public GestionEstudiante() {
        this.estudiantes = new LinkedHashMap<>();
    }

    public static GestionEstudiante consultarInstancia() {
        if (instanciaGestionEstudiante == null) {
            instanciaGestionEstudiante = new GestionEstudiante();
        }
        return instanciaGestionEstudiante;
    }

    public LinkedHashMap<Integer, Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void crearEstudiante(Estudiante estudiante) {
        this.estudiantes.put(estudiante.getCedula(), estudiante);
    }

    public Estudiante consultarEstudiante(int cedula) {
        return this.estudiantes.get(cedula);
    }
    public void actualizarEstudiante(Estudiante estudiante){
    this.estudiantes.put(estudiante.getCedula(),estudiante);
    }
    public void eliminarEstudiante(int cedula){
    this.estudiantes.remove(cedula);
    }
    public byte consultarCantidad(){
    return(byte)this.estudiantes.size();
    }
}
