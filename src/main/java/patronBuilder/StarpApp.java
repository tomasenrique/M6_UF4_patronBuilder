package patronBuilder;

import patronBuilder.builder.BuilderCoche;
import patronBuilder.manager.Director;
import patronBuilder.constructores.ConstructorCocheBase;
import patronBuilder.constructores.ConstructorCocheFull;
import patronBuilder.constructores.ConstructorCocheMedio;
import patronBuilder.entities.Coche;

/**
 * Esta clase que es la principal que inicia el programa, actuara como el cliente que use el constructor.
 */

public class StarpApp {
    public static void main(String[] args) {

        // Crear el objeto Director
        Director objFabrica = new Director();

        // Crear los objetos ConcreteBuilder (clase abstracta)
        BuilderCoche base = new ConstructorCocheBase();
        BuilderCoche medio = new ConstructorCocheMedio();
        BuilderCoche full = new ConstructorCocheFull();

        // Construir un coche con equipamiento base
        objFabrica.construir(base);
        Coche cocheBase = base.getCoche();

        // Construir un coche con equipamiento medio
        objFabrica.construir(medio);
        Coche cocheMedio = medio.getCoche();

        // Construir un coche con equipamiento full
        objFabrica.construir(full);
        Coche cocheFull = full.getCoche();

        // Mostrar la información de cada coche creado
        mostrarCaracteristicas(cocheBase);
        mostrarCaracteristicas(cocheMedio);
        mostrarCaracteristicas(cocheFull);
    }

    // =================================================================================================================
    // =================================================================================================================

    public static void mostrarCaracteristicas(Coche coche) {
        System.out.println("Motor: " + coche.getMotor());
        System.out.println("Carrocería: " + coche.getCarroceria());
        System.out.println("Eleva lunas eléctrico: " + coche.getElevalunasElec());
        System.out.println("Aire acondicionado: " + coche.getAireAcond());

        System.out.println("===================================");
    }
}
