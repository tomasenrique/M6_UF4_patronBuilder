package patronBuilder.constructores;

import patronBuilder.builder.BuilderCoche;

/**
 * Esta clase sera para poder definir un constructor concreto de coche
 */

public class ConstructorCocheFull extends BuilderCoche {

    // Contructor
    public ConstructorCocheFull() {
    }

    // Metodos heredados
    @Override
    public void construirMotor() {
        this.coche.setMotor("Motor de potencia alta");
    }


    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carrocería de alta protección");
    }


    @Override
    public void construirAireAcond() {
        this.coche.setAireAcond(true);
    }


    @Override
    public void construirElevalunas() {
        this.coche.setElevalunasElec(true);
    }
}
