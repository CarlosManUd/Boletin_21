package boletin_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */

class Libros {
    
    PrintWriter esc = null;
    FileWriter fich;
    String ficheiro = "libro.txt";
    Scanner sc;

    public void engadir() {
        try {
            String titulo = JOptionPane.showInputDialog(null, "Introduce o titulo do libro ");
            String autor = JOptionPane.showInputDialog(null, "Introduce o nome do autor");
            float prezo = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce o prezo do libro"));
            int numeroDeUnidades = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce as unidades disponibles do libro"));
            Metodos x = new Metodos(titulo, autor, prezo, numeroDeUnidades);

            fich = new FileWriter(ficheiro, true);
            esc = new PrintWriter(fich);
            esc.println(x);

        } catch (IOException ex) {
            System.out.println("erro engadirNumeros" + ex.toString());
        } finally {
            esc.close();
        }

    }

    public void consultar(File fich) {
        try {
            String busqueda = JOptionPane.showInputDialog(null, "Introduce o titulo do libro");
            ArrayList<Metodos> lista = null;
            sc = new Scanner(fich).useDelimiter(",");
            while (sc.hasNextLine()) {
                String b = sc.nextLine();
                String[] datos = b.split(",");
                String titulo = datos[0];
                String autor = datos[1];
                float prezo= Float.parseFloat(datos[2]);
                int numeroDeUnidades = Integer.parseInt(datos[4]);
                lista.add(new Metodos());

            }
            for (Metodos libro : lista) {
                if (busqueda.equalsIgnoreCase(libro.getTitulo())) {
                    System.out.println(libro.toString());
                } else {
                    System.out.println("Non temos o libro disponible no noso inventario");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro lerLinas" + ex.toString());
        } finally {
            sc.close();
        }
    }
  
    public void visualizar(File fich) {
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro lerLinas" + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void borrar(File fich) {
        try {
            ArrayList<Metodos> lista = null;
            sc = new Scanner(fich).useDelimiter(",");
            while (sc.hasNextLine()) {
                String b = sc.nextLine();
                String[] datos = b.split(",");
                String titulo = datos[0];
                String autor = datos[1];
                float prezo = Float.parseFloat(datos[2]);
                int  numeroDeUnidades = Integer.parseInt(datos[4]);
                lista.add(new Metodos());

            }
            int i = 0;
            for (Metodos libro : lista) {
                if (libro.getNumeroDeUnidades() >= 0) {
                    lista.remove(i);
                } else {
                    reescribir(libro);
                }
                i++;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("erro lerLinas" + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void reescribir(Metodos y) {
        try {

            fich = new FileWriter(ficheiro, true);
            esc = new PrintWriter(fich);
            esc.println(y);

        } catch (IOException ex) {
            System.out.println("erro engadirNumeros" + ex.toString());
        } finally {
            esc.close();
        }

    }
    
    public void Modificar(File fich) {
        try {
            String busqueda = JOptionPane.showInputDialog(null, "Introduce o titulo do libro");
            ArrayList<Metodos> lista = null;
            sc = new Scanner(fich).useDelimiter(",");
            while (sc.hasNextLine()) {
                String b = sc.nextLine();
                String[] datos = b.split(",");
                String titulo = datos[0];
                String autor = datos[1];
                float prezo = Float.parseFloat(datos[2]);
                int numeroDeUnidades = Integer.parseInt(datos[4]);
                lista.add(new Metodos());

            }
            for (Metodos lib : lista) {
                if (busqueda.equalsIgnoreCase(lib.getTitulo())) {
                    lib.setPrezo(Float.parseFloat(JOptionPane.showInputDialog(null, "Novo prezo ")));
                }
                reescribir(lib);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro lerLinas" + ex.toString());
        } finally {
            sc.close();
        }
    }
   

}