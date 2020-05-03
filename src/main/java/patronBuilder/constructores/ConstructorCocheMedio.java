package patronBuilder.constructores;

import patronBuilder.builder.BuilderCoche;

/**
 * Esta clase sera para poder definir un constructor concreto de coche
 */

public class ConstructorCocheMedio extends BuilderCoche {

    // Contructor
    public ConstructorCocheMedio() {
    }

    // Metodos heredados
    @Override
    public void construirMotor() {
        this.coche.setMotor("Motor de potencia media");
    }


    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carrocería de protección media");
    }


    @Override
    public void construirAireAcond() {
        this.coche.setAireAcond(false);
    }


    @Override
    public void construirElevalunas() {
        this.coche.setElevalunasElec(true);
    }
}
