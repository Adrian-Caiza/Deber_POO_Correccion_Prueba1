public class Cuadrado {
    private double lado;
    // constructores
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    //getters
    private double getLado() {
        return lado;
    }
    //setters
    public void setLado(double lado) {
        this.lado = lado;
    }
    //metodo mostrar valores
    public void imprimirDatosC(){
        System.out.println("El valor del lado del cuadrado es: "+ getLado());
    }
    //metodo calcular area
    public double areaCuarado(){
        return lado * lado;
    }
    //metodo calcular perimetro
    public double perimetroCuadrado(){
        return lado+lado+lado+lado;
    }
    //metodo imprimir resultados
    public  void imprimirCuadrado(){
        double area= areaCuarado();
        double perimetro=perimetroCuadrado();
        System.out.println("El area del cuadrado es: "+ area);
        System.out.println("El perimetro del cuadrado es: "+ perimetro);
    }
}
