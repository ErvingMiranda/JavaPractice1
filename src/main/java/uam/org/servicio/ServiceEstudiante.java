package uam.org.servicio;

import uam.org.models.Estudiante;

public class ServiceEstudiante {
    public static Estudiante insertarEstudiante(String cif, String nombre, String apellido, String correo){
        Estudiante estudiante = new Estudiante();
        estudiante.setCif(cif);
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setCorreo(correo);
        return estudiante;
    }
}
