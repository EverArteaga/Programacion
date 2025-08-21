package adopcionmascotas2;

public class AdopcionMascotas2 {

    private String nombre;
    private String especie;
    private int edad;
    private boolean adoptada;

    // Constructor de la clase AdopcionMascotas2
    public AdopcionMascotas2(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.adoptada = false;
    }
    
    // Métodos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isAdoptada() {
        return adoptada;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad + " anios");
        System.out.println("Estado: " + (this.adoptada ? "Adoptada" : "Disponible"));
    }

    public void adoptar() {
        if (edad >= 2) {
            if (!this.adoptada) {
                this.adoptada = true;
                System.out.println(this.nombre + " fue adoptado/a.");
            } else {
                System.out.println(this.nombre + " ya estaba adoptado/a.");
            }
        } else {
            System.out.println("La mascota es demasiado joven para ser adoptado/a.");
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
    
    public void mostrarLineamiento() {
        switch (especie.toLowerCase()) {
            case "perro":
                System.out.println("Requiere espacio amplio para vivir.");
                break;
            case "gato":
                System.out.println("Puede vivir en departamento.");
                break;
            default:
                System.out.println("Especie no registrada.");
                break;
        }
    }

    // Nuevo método que contiene ambos bucles
    public void procesarEventos() {
        System.out.println("--- Listado de mascotas disponibles (Bucle For) ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Mascota numero " + i);
        }
        
        System.out.println("\n--- Registro de visitantes (Bucle While) ---");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Visitante numero " + contador);
            contador++;
        }
    }

    public static void main(String[] args) {
        // Objeto de la clase padre
        AdopcionMascotas2 perro = new AdopcionMascotas2("Luna", "Perro", 3);
        System.out.println("--- Informacion del Perro ---");
        perro.mostrarInfo();
        perro.adoptar();
        System.out.println("La edad de " + perro.getNombre() + " en anios humanos es: " + perro.edadEnHumanos());
        perro.mostrarLineamiento();
        perro.procesarEventos(); // Llamada al nuevo método

        System.out.println();

        // Objeto de la clase hija
        Gato gato = new Gato("Rubby", 1, "Negro"); 
        System.out.println("--- Informacion del Gato ---");
        gato.mostrarInfo();
        gato.maullar();
        System.out.println("La edad de " + gato.getNombre() + " en anios humanos es: " + gato.edadEnHumanos());
        gato.adoptar();
        gato.mostrarLineamiento();
    }

    // Clase Gato anidada que hereda de AdopcionMascotas2 que es la clase padre
    static class Gato extends AdopcionMascotas2 {
        private String color;

        // Constructor de la clase Gato
        public Gato(String nombre, int edad, String color) {
            super(nombre, "Gato", edad);
            this.color = color;
        }

        public void maullar() {
            System.out.println(this.getNombre() + " dice: Miau");
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Color: " + this.color);
        }
    }
}