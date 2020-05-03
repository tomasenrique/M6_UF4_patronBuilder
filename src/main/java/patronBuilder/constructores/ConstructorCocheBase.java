package patronBuilder.constructores;

import patronBuilder.builder.BuilderCoche;

/**
 * Esta clase sera para poder definir un constructor concreto de coche
 */

public class ConstructorCocheBase extends BuilderCoche {

    // Contructor
    public ConstructorCocheBase() {
    }

    // Metodos heredados
    @Override
    public void construirMotor() {
        this.coche.setMotor("Motor de potencia mínima");
    }


    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carrocería de baja protección");
    }


    @Override
    public void construirAireAcond() {
        this.coche.setAireAcond(false);
    }


    @Override
    public void construirElevalunas() {
        this.coche.setElevalunasElec(false);
    }
}
