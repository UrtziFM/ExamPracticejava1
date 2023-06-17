// Crea la clase TestSistemaSolar con el metodo main y crea una instancia de SistemaSolar y ejecuta los metodos

public class TestSistemaSolar {
    public static void main(String[] args) {
        SistemaSolar sistemaSolar = new SistemaSolar();
        sistemaSolar.bigBang();
        sistemaSolar.printBiggestPlanet();
        sistemaSolar.printDistanceToSun("Tierra");
        sistemaSolar.printDistanceToSun("Pluton");
    }
}
