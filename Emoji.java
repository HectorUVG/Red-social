//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.ArrayList;
import java.util.List;
//*****************************************************************************
//Clase
//*****************************************************************************
public class Emoji extends Post {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private String publicacion;

    //*************************************************************************
    //Metodos
    //*************************************************************************
    
    public void publicacion(){}

    public String publicacion(int opcion){
        String pub = "";
        if(opcion == 1){
            pub = ":)";
        }

        if(opcion == 2){
            pub = ":(";
        }

        if(opcion == 3){
            pub = ":o";
        }

        if(opcion == 4){
            pub = ":v";
        }

        return pub;
    }

    public void setPublicacion(String post){
        this.publicacion = post;
    }

    public String getPublicacion(){
        return publicacion;
    }
}
