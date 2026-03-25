package uam.org.services;
import uam.org.models.Estudiante;
public class ClaseBecaB implements InterfaceEstrategiaBeca {
    @Override
    public Double calcularBeca(Estudiante estudiante) {
        if (estudiante.getPromedio() >= 80)
            return 0.3;

        return 0.0;
    }
}
