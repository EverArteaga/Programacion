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
        this.adoptada = false;
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

    public int edadEnHumanos() {
        if (especie.equalsIgnoreCase("Perro")) {
            return edad * 7;
        } else if (especie.equalsIgnoreCase("Gato")) {
            return edad * 5;
        } else {
            return edad;
        }
    }

    public static void main(String[] args) {
        AdopcionMascotas m1 = new AdopcionMascotas("Luna", "Perro", 3);

        m1.mostrarInfo();
        
       
        m1.adoptar();
        
   
        System.out.println("La edad de " + m1.nombre + " en anios humanos es: " + m1.edadEnHumanos());
    }
}
