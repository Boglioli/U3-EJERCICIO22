public class Main {
    public static void main(String[] args) {
        AutoParticular auto = new AutoParticular("abc123", "toyota", 2022, 4);
        Camion camion = new Camion("cba321" , "mercedes benz", 2020, 15);
        Motocicleta moto = new Motocicleta("bac231", "honda", 2024, 150);
        System.out.println("---- auto particular ----");
        auto.mostrarAuto();
        auto.encender();
        System.out.println();
        System.out.println("--- camion ---");
        camion.mostrarCamion();
        camion.encender();
        System.out.println();
        System.out.println("---- motocicleta ----");
        moto.mostrarMotocicleta();
        moto.encender();
    }
}
