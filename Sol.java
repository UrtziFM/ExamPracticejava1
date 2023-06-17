// Crea una clase Sol que tenga los siguientes parametros: 
// radioEcuato, temperaturaNucleo, distanciaTierra;
// con sus metodos get y set
public class Sol{
    private double radioEcuato;
    private double temperaturaNucleo;
    private double distanciaTierra;

    public Sol(double radioEcuato, double temperaturaNucleo, double distanciaTierra){
        this.radioEcuato = radioEcuato;
        this.temperaturaNucleo = temperaturaNucleo;
        this.distanciaTierra = distanciaTierra;
    }

    public double getRadioEcuato(){
        return this.radioEcuato;
    }

    public void setRadioEcuato(double radioEcuato){
        this.radioEcuato = radioEcuato;
    }

    public double getTemperaturaNucleo(){
        return this.temperaturaNucleo;
    }

    public void setTemperaturaNucleo(double temperaturaNucleo){
        this.temperaturaNucleo = temperaturaNucleo;
    }

    public double getDistanciaTierra(){
        return this.distanciaTierra;
    }

    public void setDistanciaTierra(double distanciaTierra){
        this.distanciaTierra = distanciaTierra;
    }

    public String toString(){
        return "Radio Ecuatorial: " + this.radioEcuato + "\nTemperatura del Nucleo: " + this.temperaturaNucleo + "\nDistancia a la Tierra: " + this.distanciaTierra;
    }
}