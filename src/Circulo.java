public class Circulo {
    private double pi= Math.PI;
    private double radio;
    // constructores
    public Circulo() {
    }
    public Circulo(double pi, double radio) {
        this.pi = pi;
        this. radio = radio;
    }
    //getters
    private double getPi() {
        return pi;
    }
    private double getRadio() {
        return radio;
    }
    //setters
    public void setPi(double pi) {
        this.pi= pi;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    // metodo mostrar valores
    public  void imprimirDatosCi() {
        System.out.println("El valor de PI es: "+getPi());
        System.out.println("El valor del radio es: "+ getRadio());
    }
    //metodo calcular area
    public double areaCirculo(){
        return pi*(radio*radio);
    }
    //metodo calcular perimetro
    public double perimetroCirculo(){
        return 2*(pi*radio);
    }
    //metodo imprimir resultados
    public void imprimirCirculo() {
        double area= areaCirculo();
        double perimetro=perimetroCirculo();
        System.out.println("El area del circulo es: "+area);
        System.out.println("El perimetro del circulo es: "+ perimetro);
    }

}
