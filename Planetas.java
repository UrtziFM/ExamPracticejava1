// Crea una clase Planetas que tenga los siguientes parametros:
// nombrePlaneta, numeroSatelites, radioEcuato, temperaturaMediaDiurna, distanciaTierra, distanciaSol
// con sus metodos get y set

public class Planetas {
    private String nombrePlaneta;
    private int numeroSatelites;
    private double radioEcuato;
    private double temperaturaMediaDiurna;
    private double distanciaTierra;
    private double distanciaSol;

    public Planetas(String nombrePlaneta, int numeroSatelites, double radioEcuato, double temperaturaMediaDiurna, double distanciaTierra, double distanciaSol){
        this.nombrePlaneta = nombrePlaneta;
        this.numeroSatelites = numeroSatelites;
        this.radioEcuato = radioEcuato;
        this.temperaturaMediaDiurna = temperaturaMediaDiurna;
        this.distanciaTierra = distanciaTierra;
        this.distanciaSol = distanciaSol;
    }

    public String getNombrePlaneta(){
        return this.nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta){
        this.nombrePlaneta = nombrePlaneta;
    }

    public int getNumeroSatelites(){
        return this.numeroSatelites;
    }

    public void setNumeroSatelites(int numeroSatelites){
        this.numeroSatelites = numeroSatelites;
    }

    public double getRadioEcuato(){
        return this.radioEcuato;
    }

    public void setRadioEcuato(double radioEcuato){
        this.radioEcuato = radioEcuato;
    }

    public double getTemperaturaMediaDiurna(){
        return this.temperaturaMediaDiurna;
    }

    public void setTemperaturaMediaDiurna(double temperaturaMediaDiurna){
        this.temperaturaMediaDiurna = temperaturaMediaDiurna;
    }

    public double getDistanciaTierra(){
        return this.distanciaTierra;
    }

    public void setDistanciaTierra(double distanciaTierra){
        this.distanciaTierra = distanciaTierra;
    }

    public double getDistanciaSol(){
        return this.distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol){
        this.distanciaSol = distanciaSol;
    }

}