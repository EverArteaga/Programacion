package adopcionmascotas;

public class AdopcionMascotas {

    private String nombre;
    private String especie;
    private int edad;
    private boolean adoptada;

    // Constructor de la clase AdopcionMascotas
   public AdopcionMascotas(String nombre, String especie, int edad) {
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad;
    this.adoptada = false; // Corregido: 'edad' ha sido reemplazada por 'adoptada'
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
        // Objeto de la clase padre
        AdopcionMascotas perro = new AdopcionMascotas("Luna", "Perro", 3);
        System.out.println("--- Informacion del Perro ---");
        perro.mostrarInfo();
        perro.adoptar();
        System.out.println("La edad de " + perro.getNombre() + " en anios humanos es: " + perro.edadEnHumanos());

        System.out.println();

        //Esta cosa aqui que se  me olvido como se llama es un objeto de la clase hija 
        Gato gato = new Gato("Rubby", 5, "Negro");
        System.out.println("--- Informacion del Gato ---");
        gato.mostrarInfo();
        gato.maullar();
        System.out.println("La edad de " + gato.getNombre() + " en anios humanos es: " + gato.edadEnHumanos());
        gato.adoptar();
    }

    //Aqui puse la clase gato dentro de la clse Padre AdopcionMascotas
    static class Gato extends AdopcionMascotas {
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
