public class EstrellaSol extends EstrellaAbstract {

    // Atributos de la clase hija
    private double radioEcuato;
    private double temperaturaNucleo;
    private double distanciaTierra;

        // Constructor de la clase hija
        public EstrellaSol(double radioEcuato, double temperaturaNucleo, double distanciaTierra){
            super();
            this.radioEcuato = radioEcuato;
            this.temperaturaNucleo = temperaturaNucleo;
            this.distanciaTierra = distanciaTierra;

        }

            // Metodos de la clase hija
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
}