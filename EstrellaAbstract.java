public abstract class EstrellaAbstract {

    // Atributos de la clase abstracta que hereden las clases hijas
    private double radioEcuato;
    private double temperaturaNucleo;
    private double distanciaTierra;

    // Constructor de la clase abstracta que hereden las clases hijas
    public EstrellaAbstract(double radioEcuato, double temperaturaNucleo, double distanciaTierra){
        this.radioEcuato = radioEcuato;
        this.temperaturaNucleo = temperaturaNucleo;
        this.distanciaTierra = distanciaTierra;

    }

    // Metodos de la clase abstracta que hereden las clases hijas
    public abstract double getRadioEcuato();

    public abstract double getTemperaturaNucleo();

    public abstract double getDistanciaTierra();

    public abstract void setRadioEcuato(double radioEcuato);

    public abstract void setTemperaturaNucleo(double temperaturaNucleo);

    public abstract void setDistanciaTierra(double distanciaTierra);
}
