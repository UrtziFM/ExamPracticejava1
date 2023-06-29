import java.util.ArrayList;

public class SolarSystem {

    // Atributos de la clase SistemaSolar de agregación debil de las clases EstrellaSol y Planetas
    private EstrellaSol sun;
    private ArrayList<Planetas> planets;

        // Constructor de la clase SistemaSolar
        public SolarSystem(){

        }

            // Metodos de la clase SistemaSolar
            public void bigBang(){

                sun = new EstrellaSol(700, 15000, 149600);

                planets = new ArrayList<>();

                planets.add(new Planetas("Mercurio", 0, 2439.7, 167, 57910000, 57910000));
                planets.add(new Planetas("Venus", 0, 6051.8, 464, 108200000, 108200000));
                planets.add(new Planetas("Tierra", 1, 6371, 15, 149600000, 149600000));
                planets.add(new Planetas("Marte", 2, 3389.5, -65, 227940000, 227940000));
                planets.add(new Planetas("Jupiter", 16, 69911, -110, 778300000, 778300000));
                planets.add(new Planetas("Saturno", 23, 58232, -140, 1429400000, 1429400000));
                planets.add(new Planetas("Urano", 15, 25362, -195, 2871000000L, 2871000000L));
                planets.add(new Planetas("Neptuno", 8, 24622, -200, 4504300000L, 4504300000L));

            }

            public void biggestPlanet(){

                Planetas biggestPlanet = null;

                for (Planetas planet : planets) {
                    if (biggestPlanet == null || planet.getRadioEcuato() > biggestPlanet.getRadioEcuato()){
                        biggestPlanet = planet;
                    }
                }

                System.out.println("El planeta con el radio ecuatorial mas grande es: " + biggestPlanet.getNombrePlaneta());
            }

            public void earthDistance(String planetName) {

                for (Planetas planet : planets) {
                    if (planet.getNombrePlaneta().equals(planetName)){
                        System.out.println("La distancia a la tierra de " + planet.getNombrePlaneta() + " es: " + planet.getDistanciaTierra());
                    } else {
                        throw new IllegalArgumentException("No existe planeta");
                    }
                }
            }
    
}
