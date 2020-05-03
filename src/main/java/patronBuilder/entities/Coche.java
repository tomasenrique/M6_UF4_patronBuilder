package patronBuilder.entities;

/**
 * Clase entidad basica con la que se trabajara.
 */

public class Coche {
    private String motor = "";
    private String carroceria = "";
    private Boolean elevalunasElec = false;
    private Boolean aireAcond = false;


    // Contructor
    public Coche() {
    }


    // Setter y Getter
    public String getMotor() {
        return this.motor;
    }


    public void setMotor(String motor) {
        this.motor = motor;
    }


    public String getCarroceria() {
        return this.carroceria;
    }


    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }


    public Boolean getElevalunasElec() {
        return elevalunasElec;
    }

    public void setElevalunasElec(Boolean elevalunasElec) {
        this.elevalunasElec = elevalunasElec;
    }

    public Boolean getAireAcond() {
        return aireAcond;
    }


    public void setAireAcond(Boolean aireAcond) {
        this.aireAcond = aireAcond;
    }
}
