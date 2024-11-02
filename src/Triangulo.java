public class Triangulo {
    private double lado;
    private double altura;
    //constructores
    public Triangulo() {
    }
    public Triangulo(double lado, double altura) {
        this.lado = lado;
        this.altura= altura;
    }
    //getters
    private double getAltura(){
        return altura;
    }
    private double getLado(){
        return lado;
    }
    //setters
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    // metodo mostrar valores
    public void imprimirDatosT(){
        System.out.println("El valor del lado es: "+getLado());
        System.out.println("El valor de la altura es: "+getAltura());
    }
    //metodo calcular area triangulo
    public  double areaTriangulo(){
        return (lado*altura)/2;
    }
    //metodo calcular primetro triangulo
    public double perimetroTriangulo(){
        return lado+lado+lado;
    }
    // metodo imprimir resultados
    public void imprimirTriangulo(){
        double area=areaTriangulo();
        double perimetro=perimetroTriangulo();
        System.out.println("El area del triengulo es: "+area);
        System.out.println("El perimetro del triangulo es: "+perimetro);
    }
}
