public class planeta {
    private String nombre;
    private int cantidadDeSatelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaAlSol;
    private boolean esObservable;

    // Constructor
    public planeta (String nombre, int cantidadDeSatelites, double masa, double volumen, double diametro, double distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadDeSatelites = cantidadDeSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    // Método para calcular la densidad
    public double calcularDensidad() {
        return masa / volumen;
    }

    // Métodos getters para imprimir los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public int getCantidadDeSatelites() {
        return cantidadDeSatelites;
    } 

    public double getMasa() {
        return masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public boolean isEsObservable() {
        return esObservable;
    }
    
    public static void main(String[] args) {
        planeta p1 = new planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        planeta p2 = new planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);
        
        System.out.println("Planeta 1:");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Cantidad de satélites: " + p1.getCantidadDeSatelites());
        System.out.println("Masa: " + p1.getMasa());
        System.out.println("Volumen: " + p1.getVolumen());
        System.out.println("Diametro: " + p1.getDiametro());
        System.out.println("Distancia al sol: " + p1.getDistanciaAlSol());
        System.out.println("Observable: " + p1.isEsObservable());
        System.out.println("Densidad: " + p1.calcularDensidad());
        
        System.out.println("\nPlaneta 2:");
        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Cantidad de satélites: " + p2.getCantidadDeSatelites());
        System.out.println("Masa: " + p2.getMasa());
        System.out.println("Volumen: " + p2.getVolumen());
        System.out.println("Diametro: " + p2.getDiametro());
        System.out.println("Distancia al sol: " + p2.getDistanciaAlSol());
        System.out.println("Observable: " + p2.isEsObservable());
        System.out.println("Densidad: " + p2.calcularDensidad());
    }
}
