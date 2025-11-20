public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    // a. Métodos con validación
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("Despegando...");
        } else {
            System.out.println("Combustible insuficiente para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia / 2; 
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("Avanzando " + distancia + " unidades.");
        } else {
            System.out.println("No hay combustible suficiente para avanzar esa distancia.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= 100) {
            combustible += cantidad;
        } else {
            combustible = 100;
            System.out.println("Tanque lleno al máximo.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "%");
    }
}
