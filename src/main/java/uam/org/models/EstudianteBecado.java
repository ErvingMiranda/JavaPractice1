package uam.org.models;

public class EstudianteBecado extends  Estudiante {
    public EstudianteBecado(Double promedio) {
        super(promedio);
    }

    public Double calcularBeca(){
    return 0.5; //Tarea: Hacer est reg de 0.3 y est exc de 0.9
    }

    public EstudianteBecado(String cif, String nombre, String apellido, String correo, Double promedio) {
        super(cif, nombre, apellido, correo, promedio);
    }
}
