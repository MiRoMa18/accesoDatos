package claseRepasoFile;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        File archivo = new File("src/act1File/ejemplos/holaMundo.txt");
        File archivo2 = new File("src/act1File/ejemplos/holaMundo2.txt");
        System.out.println(archivo.exists() ? "El archivo existe" : "El archivo no existe");
        if(archivo2.exists()){
            System.out.println("El archivo existe");
        }else{
            System.out.println("El archivo no existe. Creando...");
            try {
                archivo2.createNewFile();
                System.out.println("Archivo creado");
            } catch (Exception e) {
                System.out.println("Error al crear el archivo");
            }
        }

        //.list()
        File listaArchivos = new File("src/act1File/ejemplos");
        System.out.println("Archivos en el directorio ejemplos:");
        for (String nombreArchivo : listaArchivos.list()) {
            System.out.println(nombreArchivo);
        }

        //.listFiles()
        System.out.println("\nArchivos en el directorio ejemplos (con .listFiles():");
        for (File archivoLista : listaArchivos.listFiles()) {
            System.out.println(archivoLista.getName() + " - " + (archivoLista.isDirectory() ? "Directorio" : "Archivo") + " - " + archivoLista.length() + " bytes");
        }



    }
}
