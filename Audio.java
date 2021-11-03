//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.ranges.RangeException;
//*****************************************************************************
//Clase
//*****************************************************************************
public class Audio extends Post {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private int sampleRate;
    private int bitDepth;
    private String publicacion;

    //*************************************************************************
    //Metodos
    //*************************************************************************
    
    public void publicacion(){

    }
    
    public void setPublicacion(String post){
        this.publicacion = post;
    }

    public String getPublicacion(){
        return publicacion;
    }

    public void setSampleRate(int rate){
        this.sampleRate = rate;
    }

    public int getSampliRate(){
        return sampleRate;
    }

    public void setBitDepth(int bit){
        this.bitDepth = bit;
    }

    public int getBitDepth(){
        return bitDepth;
    }
}
