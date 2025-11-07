import java.util.Scanner;

/**
 * Programa encargado de dar la media de las notas de tres evaluaciones, estás
 * notas serán leídas desde el teclado, cuyas notas son filtradas para que no entren cadenas en la media
 * establecido por el usuario
 * 
 * @author Mrrttx
 * @version 1.0
 * @since 2025
 */

public class NotaMediaEvaluaciones {

    static final int TRIMESTRALES = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String primera_evaluacion;
        String segunda_evaluacion;
        String tercera_evaluacion;
        boolean pasan;

        do {
            System.out.println("A continuación necesito que me proporcione las notas de las evaluaciones (Solo números)");
            System.out.println("Nota de PRIMERA evaluación:");
            primera_evaluacion = sc.nextLine();
            System.out.println("Nota de la SEGUNDA evaluación:");
            segunda_evaluacion = sc.nextLine();
            System.out.println("Nota de la TERCERA evaluación:");
            tercera_evaluacion = sc.nextLine();
            pasan = sonNumeros(primera_evaluacion, segunda_evaluacion, tercera_evaluacion);
        } while (!pasan);

        double mediaTrimestralValue = mediaTrimestral(Double.parseDouble(primera_evaluacion), Double.parseDouble(segunda_evaluacion),
         Double.parseDouble(tercera_evaluacion));
        
         System.out.printf("La nota media trimestral entre %.2f, %.2f y %.2f es %n ------> %.2f%n",
        Double.parseDouble(primera_evaluacion), Double.parseDouble(segunda_evaluacion),Double.parseDouble(tercera_evaluacion)
        ,mediaTrimestralValue);

    }

    /**
     * Método que filtra para que no contengan cadenas y sean números lo establecido por el usuario 
     * 
     * @param primera_evaluacion
     * @param segunda_evaluacion
     * @param tercera_evaluacion
     * @return
     */
    public static boolean sonNumeros(String primera_evaluacion, String segunda_evaluacion, String tercera_evaluacion) {
        if (primera_evaluacion.matches("\\d+") && segunda_evaluacion.matches("\\d+")
                && tercera_evaluacion.matches("\\d+")) {
            return true;
        }
        return false;
    }

    /**
     * Método que calcula la media a través de la constante "TRIMESTRALES" pasandole los valores de los trimestrales casteados a double
     * 
     * @param primera_evaluacion
     * @param segunda_evaluacion
     * @param tercera_evaluacion
     * @return
     */
    public static double mediaTrimestral(double primera_evaluacion, double segunda_evaluacion, double tercera_evaluacion){
        return (primera_evaluacion + segunda_evaluacion + tercera_evaluacion)/TRIMESTRALES;
    }
}
