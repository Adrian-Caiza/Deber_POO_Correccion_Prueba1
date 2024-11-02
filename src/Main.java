import java.util.Scanner;
public class Main {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        Cuadrado cuadrado1=new Cuadrado();
        Rectangulo rectangulo1=new Rectangulo();
        Circulo circulo1=new Circulo();
        Triangulo triangulo1=new Triangulo();
        int opcion;
        do {
            System.out.println("|-------------------------------|");
            System.out.println("| 1- Cuadrado                   |");
            System.out.println("| 2- Rectangulo                 |");
            System.out.println("| 3- Circulo                    |");
            System.out.println("| 4- Triangulo                  |");
            System.out.println("| 5- Suma de areas              |");
            System.out.println("| 6- Salir                      |");
            System.out.println("|_______________________________|");
            System.out.print(" Ingrese una opcion: ");
            opcion= entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Ingrese el valor del lado del cuadrado: ");
                    cuadrado1.setLado(entrada.nextDouble());
                    cuadrado1.imprimirDatosC();
                    cuadrado1.imprimirCuadrado();
                    break;
                case 2:
                    System.out.print("Ingrese el valor de la altura del rectangulo: ");
                    rectangulo1.setAltura(entrada.nextDouble());
                    System.out.print("Ingrese el valor de la base del rectangulo: ");
                    rectangulo1.setBase(entrada.nextDouble());
                    rectangulo1.imprimirDatosR();
                    rectangulo1.imprimirRectangulo();
                    break;
                case 3:
                    System.out.print("Ingrese el valor del radio del circulo: ");
                    circulo1.setRadio(entrada.nextDouble());
                    circulo1.imprimirDatosCi();
                    circulo1.imprimirCirculo();
                    break;
                case 4:
                    System.out.print("Ingrese el valor de la altura del triangulo: ");
                    triangulo1.setAltura(entrada.nextDouble());
                    System.out.print("Ingrese el valor del lado del triangulo: ");
                    triangulo1.setLado(entrada.nextDouble());
                    triangulo1.imprimirDatosT();
                    triangulo1.imprimirTriangulo();
                    break;
                case 5:
                    double sumaAreas= cuadrado1.areaCuarado()+ rectangulo1.areaRectangulo()+ circulo1.areaCirculo()+ triangulo1.areaTriangulo();
                    System.out.println("La sumatoria de las areas es: "+sumaAreas);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("  ¡ERROR! ingrese una opcion valida ");
                    break;
            }
        } while (opcion!=6);
        System.out.println("     Saliendo . . . ");
    }
}
