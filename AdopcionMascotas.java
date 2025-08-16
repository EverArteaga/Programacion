package adopcionmascotas;

public class AdopcionMascotas {

    String nombre;
    String especie; // perro, gato, etc.
    int edad; // en años
    boolean adoptada;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estado: " + (adoptada ? "Adoptada" : "Disponible"));
    }

    public static void main(String[] args) {
        AdopcionMascotas m1 = new AdopcionMascotas();
        m1.nombre = "Luna";
        m1.especie = "Perro";
        m1.edad = 3;
        m1.adoptada = false;

        m1.mostrarInfo();
    }
}
