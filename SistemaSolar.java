import java.util.List;
import java.util.ArrayList;

// Crea una clase SistemaSolar con instanciando el sol y una lista de planetas

public class SistemaSolar {

            Sol sun;
            private  List<Planetas> planets;

        public SistemaSolar(){
        
        }

        public void bigBang(){

            sun = new Sol(700, 15000, 149600);

            planets = new ArrayList<>();

            planets.add(new Planetas("Mercurio", 0,2.439, 700.15,91700, 57900));
            planets.add(new Planetas("Venus", 0,6.052, 243.15, 41400, 108200));
            planets.add(new Planetas("Tierra", 1, 6.378, 289.00, 0, 149600));
            planets.add(new Planetas("Marte", 2, 3.396, 293.15, 78400, 227940));
            planets.add(new Planetas("Jupiter", 16, 70.85, 303.15,628800, 778300));
            planets.add(new Planetas("Saturno", 23, 60.00, 148.15,1277400, 1429400));
            planets.add(new Planetas("Urano", 15, 25.40, 80.15,2719700, 2871000));
            planets.add(new Planetas("Neptuno", 8, 24.30, 120.15,4347400, 4504300));
    
            }

        // crear un metodo que revise la lista de planetas y busque el planeta con radioEcuato mas grandes  
        // y lo imprima en pantalla
        
        public void printBiggestPlanet(){

            Planetas biggestPlanet = null;

            for (Planetas planet : planets) {
                if (biggestPlanet == null || planet.getRadioEcuato() > biggestPlanet.getRadioEcuato()) {
                    biggestPlanet = planet;
                }
            }

            System.out.println("El planeta con el radio ecuatorial mas grande es: " + biggestPlanet.getNombrePlaneta());
        }

        // crear un metodo que solicite al usuario el nombre de un planeta y le diga su distancia al sol
        // si el planeta no existe, debe imprimir un mensaje de error

        public void printDistanceToSun(String planetName){

            for (Planetas planet : planets) {
                if (planet.getNombrePlaneta().equals(planetName)) {
                    System.out.println("La distancia del planeta " + planetName + " al sol es: " + planet.getDistanciaSol());
                    return;
                }
            }

            System.out.println("El planeta " + planetName + " no existe");
        }
}





