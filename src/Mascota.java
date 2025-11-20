public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // a. Métodos requeridos
    public void mostrarInfo() {
        System.out.println(nombre + " es un " + especie + " de " + edad + " años.");
    }

    public void cumplirAnios() {
        this.edad++;
        System.out.println(nombre + " ha cumplido años. Ahora tiene " + edad);
    }
}
