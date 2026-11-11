public class AutoParticular extends Vehiculo{
    private int cantidadPuertas;
    public AutoParticular(String patente, String marca, int año, int cantidadPuertas) {
        super(patente, marca, año);
        this.cantidadPuertas = cantidadPuertas;
    }
    public void mostrarAuto() {
        mostrarInformacion();
        System.out.println("cantidad de puertas: " + cantidadPuertas);
    }
}
