public class Camion extends Vehiculo{
    private double capacidadCarga;
    public Camion(String patente, String marca, int año, double capacidadCarga) {
        super(patente, marca, año);
        this.capacidadCarga = capacidadCarga;
    }
    public void mostrarCamion() {
        mostrarInformacion();
        System.out.println("capacidad de carga: " + capacidadCarga + "toneladas");
    }
}
