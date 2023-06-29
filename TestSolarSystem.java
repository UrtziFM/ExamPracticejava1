public class TestSolarSystem {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        try{
        solarSystem.bigBang();
        solarSystem.biggestPlanet();
        solarSystem.earthDistance("Mercurio");
        solarSystem.earthDistance("Pluton");
        } catch (IllegalArgumentException e){
            System.out.println("Excepción atrapada " + e );
        } finally {
            System.out.println("Tarea terminada");
        }
    }
}

