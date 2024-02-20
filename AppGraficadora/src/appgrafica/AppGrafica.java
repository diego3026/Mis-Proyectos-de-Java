package appgrafica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;

public class AppGrafica {

    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }

    public static void escribir() {
        File f = new File("Hola.txt");

        try {
            f.createNewFile();
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write("Hola\n");
            fileWriter.write("Hola");
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("No se puede crear");
        }
    }

    public static void leer() {
        File f = new File("Hola.txt");
        if (f.exists()) {
            try {
                FileReader fileReader = new FileReader(f);
                BufferedReader br = new BufferedReader(fileReader);
                System.out.println(br.readLine());
                fileReader.close();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
    }

}
