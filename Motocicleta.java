public class Motocicleta extends Vehiculo{
    private int cilindrada;
    public Motocicleta(String patente, String marca, int año, int cilidrada) {
        super(patente, marca, año);
        this.cilindrada = cilidrada;
    }
    public void mostrarMotocicleta() {
        mostrarInformacion();
        System.out.println("cilindrada: " + cilindrada + "cc");
    }
}
