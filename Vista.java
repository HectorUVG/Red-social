//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
//*****************************************************************************
//Clase
//*****************************************************************************
public class Vista {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private Scanner scan;

    //*************************************************************************
    //Constructores
    //*************************************************************************
    
    public Vista(){
        scan = new Scanner(System.in);
    }
    //*************************************************************************
    //Metodos
    //*************************************************************************

    public void bienvenida(){
        System.out.println("Que onda mucha!!!!!");
    }
    public int menu(){//menu principal 
        int opcion = 0;
        System.out.println("\n Seleccione una opcion");
        System.out.println("1. Realizar publicacion ");
        System.out.println("2. Buscar publicaciones por fecha");
        System.out.println("3. Buscar publicaciones con el mismo hashtag");
        System.out.println("4. Cerrar sesion");

 
        opcion = scan.nextInt();
        System.out.println("");
        return opcion;
    }

    public int publicar(){
        int opcion = 0;
        System.out.println("Realizar publicacion");
        System.out.println("¿Que tipo de publicacion quiere hacer?");
        System.out.println("1.Texto");
        System.out.println("2.Emoji");
        System.out.println("3.Multimedia");
        System.out.println("4.Cerrar sesion");

 
        opcion = scan.nextInt();
        System.out.println("");
        return opcion;
    }

    public int likeOComentar(){
        int opcion = 0;
        System.out.println("");
        System.out.println("¿Que quiere hacer?");
        System.out.println("1. Dar like");
        System.out.println("2. Comentar");
        System.out.println("3. Atras");

 
        opcion = scan.nextInt();
        System.out.println("");
        return opcion;
    }

    public String aCualDarLike(){
        String opcion = "";
        System.out.println("Escriba el titulo de la publicacion a la cual desea darle un me gusta: ");
        opcion = scan.next();
        System.out.println("");
        return opcion;
    }



    public String fecha(){
        String opcion = "";
        System.out.println("Escribela fecha de hoy:");
        opcion = scan.next();
        System.out.println("");
        return opcion;
    }

    public int agregarHashtag(){
        int opcion = 0;
        System.out.println("Desea agregar un/otro hashtag?");
        System.out.println("1. Si");
        System.out.println("2. No");
        opcion = scan.nextInt();
        System.out.println("");
        return opcion;
    }

    public String autor(){
        String opcion = "";
        System.out.println("Escriba su nombre:");
        opcion = scan.next();
        System.out.println("");
        return opcion;
    }

    public String titulo(){
        String opcion = "";
        System.out.println("Escriba el titulo de la publicacion:");
        opcion = scan.next();
        System.out.println("");
        return opcion;
    }

    public String hashtag(){
        String opcion = "";
        System.out.println("Escriba el hashtag que desee:");
        opcion = scan.next();
        System.out.println("");
        return opcion;
    }

    public String texto(){
        String opcion = "";
        System.out.println("Escribe lo que quieres publicar(no mas de 20 caracteres):");
 
        opcion = scan.next();
        System.out.println("");
        return opcion;
    }

    public int emoji(){
        int opcion = 0;
        System.out.println("Seleccione el emoji que quiere publicar");
        System.out.println("1.:)");
        System.out.println("2.:(");
        System.out.println("3.:o");
        System.out.println("4.:v");

        opcion = scan.nextInt();
        System.out.println("");
        return opcion;
    } 

    public int multimedia(){
        int opcion = 0;
        System.out.println("Multimedia");
        System.out.println("Que desea publicar?");
        System.out.println("1.Foto");
        System.out.println("2.Audio");
        System.out.println("3.Video");
        System.out.println("4.Atras");

 
        opcion = scan.nextInt();
        System.out.println("");
        return opcion;
    }
    
    public String foto(){
        String op = "";
        System.out.println("Escriba el link de la imagen : ");
        
        op = scan.next();
        System.out.println("");
        return op;
    }

    public int resolucion(){
        int op = 0;
        System.out.println("Escriba la resolucion de la imagen en megapixeles : ");
        
        op = scan.nextInt();
        System.out.println("");
        return op;
    }



    public String audio(){
        String op = "";
        System.out.println("Escriba el link del audio: ");
        
        op = scan.next();
        System.out.println("");
        return op;
    }

    public int sampleRate(){
        int op = 0;
        System.out.println("Escriba la frecuencia de muestreo en KHz : ");
        
        op = scan.nextInt();
        System.out.println("");
        return op;
    }

    public int bitDepth(){
        int op = 0;
        System.out.println("Escriba la profundidad de bits en Bits : ");
        
        op = scan.nextInt();
        System.out.println("");
        return op;
    }

    public String video(){
        String op = "";
        System.out.println("Escriba el link del video: ");
        
        op = scan.next();
        System.out.println("");
        return op;
    }

    public int frameRate(){
        int op = 0;
        System.out.println("Escriba el frame rate en fps : ");
        
        op = scan.nextInt();
        System.out.println("");
        return op;
    }

    public void realizado(){
        System.out.println("Se realizo la publicacion");
    }

    public void pubAutor(String autor){
        System.out.println("Autor: " + autor);
    }  

    public void pubTitulo(String titulo){
        System.out.println("Titulo: " + titulo);
    } 

    public void pubFecha(String fecha){
        System.out.println("fecha de publicacion: " + fecha);
    }

    public void pubPublicacion(String publicacion){
        System.out.println( publicacion);
    }

    public void pubHashtags(List<String> publicacion){
        System.out.println( publicacion);
        System.out.println( " ");
    }

    public void pubResolucion(int resolucion){
        System.out.println( resolucion + " Mega pixeles");
    }

    public void pubFrameRate(int fps){
        System.out.println( fps + " fps");
    }

    public void pubSampleRate(int rate){
        System.out.println( rate + "KHz");
    }

    public void pubBitDepth(int bits){
        System.out.println( bits + " Bits");
    }

    public void pubLikes(int likes){
        System.out.println( likes + " Likes");
    }

    public String filtroFecha(){
        String op = "";
        System.out.println("Escriba la fecha de las publicaciones que desea filtrar: ");
        op = scan.next();
        System.out.println("");
        return op;
    }

    public void noHayTexto(){
        System.out.println(" No hay publicaciones de tipo texto con esta fecha.");
        System.out.println("");
    }
}
