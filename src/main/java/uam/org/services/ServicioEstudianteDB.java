package uam.org.services;

import uam.org.config.Global;
import uam.org.models.Estudiante;

public class ServicioEstudianteDB implements IEstudianteServiceDB{
    @Override
    public Estudiante insertarEstudiante(Estudiante e) {
        Global.listaEstudiantes.add(e);
        return e;
    }

    @Override
    public void eliminarEstudiante(Estudiante e) {
        Global.listaEstudiantes.remove(e);
    }

    @Override
    public Estudiante obtenerEstudiante(Estudiante e) {
        return Global.listaEstudiantes.stream().filter(x -> x.getCif().equals(x.getCif()))
                .findFirst().orElse(null);
    }

    @Override
    public Estudiante updateEstudiante(Estudiante estudiante) {
        return null;
    }

    /*public static Estudiante insertarEstudiante(Estudiante estudiante){
        Global.listaEstudiantes.add(estudiante);
        return estudiante;
    }

    public static void listarEstudiantes(){
        for (Estudiante estudiante : Global.listaEstudiantes) {
            System.out.println(estudiante);
        }
    }

    public static void actualizarEstudiante(Estudiante estudiante){
        for(int i=0;i<Global.listaEstudiantes.size();i++){
            Estudiante estudiante1 = Global.listaEstudiantes.get(i);
            if (estudiante1.equals(estudiante)){
                estudiante1.setNombre(estudiante.getNombre());
                estudiante1.setApellido(estudiante.getApellido());
                estudiante1.setCif(estudiante.getCif());
                estudiante1.setCorreo(estudiante.getCorreo());
            }
        }

     public static void removeEstudiante(Estudiante estudiante){
        Global.listaEstudiantes.remove(estudiante);
            }
        }*/

}

