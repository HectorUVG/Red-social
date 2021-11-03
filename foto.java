//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.ArrayList;
import java.util.List;
//*****************************************************************************
//Clase
//*****************************************************************************
public class foto extends Post {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private int resolucion;
    private String publicacion;

    //*************************************************************************
    //Metodos
    //*************************************************************************
    public void publicacion(){}
    public void setPublicacion(String post){
        this.publicacion = post;
    }

    public String getPublicacion(){
        return publicacion;
    }

    public void setResolucion(int res){
        this.resolucion = res;
    }

    public int getResolucion(){
        return resolucion;
    }
}
