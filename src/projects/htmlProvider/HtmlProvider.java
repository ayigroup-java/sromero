package projects.htmlProvider;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlProvider {

    public static void main(String[] args) throws IOException {

        /*
        1. definir template y subtemplates
        2. definir tags dentro de template
        */

        htmlSample();
    }

    public static void htmlSample() throws IOException {
        String cad = "Finde de Escalada";

        FileWriter filewriter = null;
        PrintWriter printw = null;

        try {
            filewriter = new FileWriter("ejemplo.html");//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor

            printw.println("<html>");
            printw.println("<head><title>Ayi Group - G3</title></head>");
            //si queremos escribir una comilla " en el
            //archivo uzamos la diagonal invertida \"
            printw.println("<body bgcolor=\"#99CC99\">");

            //si quisieramos escribir una cadena que vide de una lista o
            //de una variable lo concatenamos
            printw.println("<center><h1><font color=\"navy\">" + cad + "</font></h1></center>");
            printw.println("<center><h4><font color=\"purple\">Ayi Group - G3</font></h4></center>");

            //podemos añadir imagenes con codigo html
            printw.println("<center><img src=\"/Users/sromero/Desktop/finde/IMG_7537.jpeg\" width=\"400\" height=\"500\"></center>");

            printw.println("</body>");
            printw.println("</html>");

            //no devemos olvidar cerrar el archivo para que su lectura sea correcta
            printw.close();//cerramos el archivo

            System.out.println("Generado exitosamente");//si todo sale bien mostramos un mensaje de guardado exitoso

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

