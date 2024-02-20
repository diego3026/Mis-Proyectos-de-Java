
package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppGrafica {

    public static void main(String[] args) throws IOException {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        FileWriter fileWrite = new FileWriter("datos.txt",true);
        PrintWriter printWrite = new PrintWriter(fileWrite);
        fin:do {
            String menu = "1.Ingresar Alumno\n2.Mostrar\n3.Cargar\n4.Salir";
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un id: "));
                    String nombre = JOptionPane.showInputDialog("Ingresar un nombre: ");

                    alumnos.add(new Alumno(id, nombre));
                    printWrite.println(id+","+nombre);
                    JOptionPane.showMessageDialog(null, "Agregado exitosamente");
                    break;
                case 2:
                    String cadena="";
                    for (int i = 0; i < alumnos.size(); i++) {
                        Alumno get = alumnos.get(i);
                        cadena+=get.toString()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, cadena);
                    break;
                case 3:
                    String[] linea = leerDatos().split("\n");
                    for (String dato : linea) {
                        String[] datos = dato.split(",");
                        alumnos.add(new Alumno(Integer.parseInt(datos[0]), datos[1]));
                    }
                    break;
                case 4:
                    printWrite.close();
                    break fin;
            }
        } while (true);
    }

    public static String leerDatos() throws IOException {
        FileReader fileReader = new FileReader("datos.txt");
        BufferedReader bufEntrada = new BufferedReader(fileReader);
        String datos="";
        String linea = bufEntrada.readLine();
        while(linea!=null){
            datos+=linea+"\n";
            linea = bufEntrada.readLine();
        }
        bufEntrada.close();
       
        return datos;
    }
    
    public void EscribeDatos(String datos) throws IOException{
        FileWriter fileWriter = new FileWriter("datos.txt",true);
        PrintWriter bufSalida = new PrintWriter(fileWriter);
        bufSalida.println(datos);
        bufSalida.close();
    }
}

class Alumno {

    int id;
    String nombre;

    public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
