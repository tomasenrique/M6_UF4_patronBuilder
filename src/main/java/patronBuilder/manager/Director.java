package patronBuilder.manager;

import patronBuilder.builder.BuilderCoche;

/**
 * Esta clase se encarga de gestionar la creacion de coches actuando como intermediario entre el usuario de los
 * Constructores y los propios Constructores de cada clase.
 */

public class Director {

    // Contructor
    public Director() {
    }

    // Metodo que llamara a la clase abstracta para construir los coches y sus atributos
    public void construir(BuilderCoche builder) {
        builder.crearNuevoCoche();

        builder.construirMotor();
        builder.construirCarroceria();
        builder.construirElevalunas();
        builder.construirAireAcond();
    }
}
