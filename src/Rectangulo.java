public class Rectangulo {
    private  double base;
    private  double altura;
    //constructores
    public Rectangulo() {
    }
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    //getters
    private double getBase(){
        return base;
    }
    private double getAltura(){
        return altura;
    }
    //setters
    public void setBase(double base) {
        this.base = base;
    }
    public void  setAltura(double altura) {
        this.altura = altura;
    }
    //metodo mostrar valores
    public void imprimirDatosR(){
        System.out.println("El valor de la base es: "+ getBase());
        System.out.println("El valor de la altura es: "+ getAltura());
    }
    // metodo calcular area
    public double areaRectangulo(){
        return altura*base;
    }
    //metodo calcular perimetro
    public double perimetroRectangulo(){
        return 2*(altura+base);
    }
    //metodo imprimir resultados
    public void imprimirRectangulo() {
        double area= areaRectangulo();
        double perimetro= perimetroRectangulo();
        System.out.println("El area del rectangulo es: "+area);
        System.out.println("El perimetro del rectangulo es :"+perimetro);
    }
}
