public class Vehiculo {
    protected String patente;
    protected String marca;
    protected int año;
    public Vehiculo(String patente, String marca, int año) {
        this.patente = patente;
        this.marca = marca;
        this.año = año;
    }
    public void encender() {
        System.out.println("el vehiculo esta encendido");
    }
    public void mostrarInformacion() {
        System.out.println("patente: " + patente);
        System.out.println("marca: " + marca);
        System.out.println("año: " + año);
    }
}
