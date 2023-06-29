public abstract class EstrellaAbstract {

    // En la clase abstracta no se definen los atributos sino en las clases hijas

    // Constructor de la clase abstracta que hereden las clases hijas
    public EstrellaAbstract(){

    }

    // Metodos de la clase abstracta que hereden las clases hijas
    public abstract double getRadioEcuato();

    public abstract double getTemperaturaNucleo();

    public abstract double getDistanciaTierra();

    public abstract void setRadioEcuato(double radioEcuato);

    public abstract void setTemperaturaNucleo(double temperaturaNucleo);

    public abstract void setDistanciaTierra(double distanciaTierra);
}
