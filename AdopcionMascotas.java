package adopcionmascotas;

public class AdopcionMascotas {

    private String nombre;
    private String especie; // perro, gato, etc.
    private int edad; 
    private boolean adoptada;

    // Constructor para inicializar los datos de la mascota
    public AdopcionMascotas(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.adoptada = false; // La mascota inicialmente no está adoptada
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad + " anios");
        System.out.println("Estado: " + (this.adoptada ? "Adoptada" : "Disponible"));
    }

    public void adoptar() {
        if (!this.adoptada) {
            this.adoptada = true;
            System.out.println(this.nombre + " ha sido adoptado/a.");
        } else {
            System.out.println(this.nombre + " ya estaba adoptado/a.");
        }
    }

    public static void main(String[] args) {
   
    AdopcionMascotas m1 = new AdopcionMascotas("Luna", "Perro", 3);
    
    m1.mostrarInfo();
    
    m1.adoptar();
    
    m1.mostrarInfo();
}
}
