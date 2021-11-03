//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.ArrayList;
import java.util.List;
//*****************************************************************************
//Clase
//*****************************************************************************
public class Video extends Post {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private int frameRate;
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

    public void setFrameRate(int rate){
        this.frameRate = rate;
    }

    public int getFrameRate(){
        return frameRate;
    }
}
