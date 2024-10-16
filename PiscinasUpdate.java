import java.util.Scanner;

public class PiscinasUpdate {
    public static void main(String[] args) {



        
        // Declarar variables

        float piscina1Largo;
        float piscina1Ancho;
        float piscina1Profundidad;

        float piscina2Largo;
        float piscina2Ancho;
        float piscina2Profundidad;


        // Pedir al usuario que introduzca los valores
        Scanner sc = new Scanner(System.in); 
        System.out.println("Introduce el Largo, ancho y profundo de la piscina 1 separado por enters: ");

        piscina1Largo = sc.nextFloat();
        piscina1Ancho = sc.nextFloat(); 
        piscina1Profundidad = sc.nextFloat(); 

        

        System.out.println("\n\nIntroduce el Largo, ancho y profundo de la piscina 2 separado por enters: ");

        piscina2Largo = sc.nextFloat();
        piscina2Ancho = sc.nextFloat(); 
        piscina2Profundidad = sc.nextFloat(); 



        // Traza para comprobar los datos que se han introducido
        System.out.println("Los datos introducidos para la piscina uno son (largo x ancho x profundo): "
         + piscina1Largo +", "+ piscina1Ancho +", "+ piscina1Profundidad);
        System.out.println("Los datos introducidos para la piscina dos son (largo x ancho x profundo): "
         + piscina2Largo +", "+ piscina2Ancho +", "+ piscina2Profundidad);



        //Cálculos de area, volumen, medidas, etc.
            // Divido entre 10000 para pasar el area de cm2 a m2 y el volumen de cm3 a L.

        float areaPiscina1 = (piscina1Largo * piscina1Ancho)/10000;
        float areaPiscina2 = (piscina2Largo * piscina2Ancho)/10000;

        float volumenPiscina1 = (piscina1Largo * piscina1Ancho * piscina1Profundidad)/1000;
        float volumenPiscina2 = (piscina2Largo * piscina2Ancho * piscina2Profundidad)/1000;

        float anchoJuntas = piscina1Ancho + piscina2Ancho;

        float areaJuntas = areaPiscina1 + areaPiscina2;

        float volumenJuntas = volumenPiscina1 + volumenPiscina2;

        






        //Mostrar por pantalla el resultado de los calculos"

        //Area de las piscinas
        System.out.println("AREAS DE LAS PISCINAS");
        System.out.println("------------------------");
        System.out.println("El area de la piscina 1 es: "
                + areaPiscina1 + "m2.");
        System.out.println("El area de la piscina 2 es: "
                + areaPiscina2 + "m2.");


        //Volumen de las piscinas
        System.out.println("\n\nVOLUMEN DE LAS PISCINAS");
        System.out.println("------------------------");
        System.out.println("El volumen de la piscina 1 es: "
                + volumenPiscina1 + "L.");
        System.out.println("El volumen de la piscina 2 es: "
                + volumenPiscina2 + "L.");

        //Medidas de las piscinas juntas
        System.out.println("\n\nMEDIDAS, AREA Y VOLUMEN DE LAS PISCINAS JUNTAS");
        System.out.println("------------------------");
        System.out.println("Las medidas de las dos piscinas juntas serían: "
                + piscina1Largo + "cm x " + anchoJuntas + "cm." );
        System.out.println("El area de las dos piscinas conjuntas son: " + areaJuntas + "m2.");
        System.out.println("El volumen conjunto es de " + volumenJuntas + "L.");





        // No se pueden crear más trazas, ya que el propio programa va imprimiendo las operaciones a medida que avanza



        // Intercambio de profundidades
        System.out.println("\n\nVOLUMEN NUEVO INTERCAMBIANDO LAS PROFUNDIDADES");
        System.out.println("------------------------");
        System.out.println("El nuevo volumen de la piscina 1 es: "
                + (piscina1Largo * piscina1Ancho * piscina2Profundidad)/10000 + "L.");
        System.out.println("El nuevo volumen de la piscina 2 es: "
                + (piscina2Largo * piscina2Ancho * piscina1Profundidad)/10000 + "L.");


                sc.close();
    }
}