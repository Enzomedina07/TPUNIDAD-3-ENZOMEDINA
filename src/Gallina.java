public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    // a. Métodos requeridos
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo.");
    }

    public void envejecer() {
        this.edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina + " | Edad: " + edad + " | Huevos: " + huevosPuestos);
    }
}