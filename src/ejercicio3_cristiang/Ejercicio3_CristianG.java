package ejercicio3_cristiang;

import java.io.File;
import java.io.IOException;

/**
 * @author Cristian 
 * EJERCICIO 3
 */
public class Ejercicio3_CristianG {

    public static void main(String[] args) {
        File f = new File("D:\\2ºDAM\\A.DATOS\\Ejercicio3_CristianG\\NUEVODIR");
        
        //EN LA PRIMERA EJECUCION TODAVIA NO ESTAN CREADOS NINGUNO DE LOS DIRECTORIOS NI DE LOS ARCHIVOS .TXT
        
        //PUNTO 1 Y 2:
        if (f.mkdir()) {
            System.out.println("Se ha creado el directorio");
        } else {
            System.out.println("No se ha podido crear el directorio");
        }

        //PUNTO 3 Y 4:
        File fichero1 = new File("D:\\2ºDAM\\A.DATOS\\Ejercicio3_CristianG\\NUEVODIR\\FICHERO1.txt");
        File fichero2 = new File("D:\\2ºDAM\\A.DATOS\\Ejercicio3_CristianG\\NUEVODIR\\FICHERO2.txt");
        try {
            if (fichero1.createNewFile()) {
                System.out.println("El FICHERO1 se ha creado correctamente");
            } else {
                System.out.println("No se ha podido crear FICHERO1");
            }
            if (fichero2.createNewFile()) {
                System.out.println("El FICHERO2 se ha creado correctamente");
            } else {
                System.out.println("No se ha podido crear FICHERO2");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //PUNTO 5
        File nuevoFichero1
                = new File("D:\\2ºDAM\\A.DATOS\\Ejercicio3_CristianG\\NUEVODIR\\FICHERO1NUEVO.txt");
        boolean renombrar = fichero1.renameTo(nuevoFichero1);
        if (renombrar) {
            System.out.println("Se renombro el archivo correctamente");
        } else {
            System.out.println("No se puede renombrar el archivo");
        }

        //PUNTO 6 Y 7
        boolean borrado = fichero2.delete();
        if (borrado) {
            System.out.println("Se borro el archivo correctamente");
        } else {
            System.out.println("No se puede borrar el archivo");
        }

    }

}
