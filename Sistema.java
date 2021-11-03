//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.ArrayList;
import java.util.List;
//*****************************************************************************
//Clase
//*****************************************************************************
public class Sistema {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private List<Texto> publicacionesTexto = new ArrayList<>();
    private List<Emoji> publicacionesEmoji = new ArrayList<>();
    private List<foto> publicacionesFoto = new ArrayList<>();
    private List<Audio> publicacionesAudio = new ArrayList<>();
    private List<Video> publicacionesVideo = new ArrayList<>();
    //*************************************************************************
    //Metodos
    //*************************************************************************

    public void setTexto(Texto set){
        this.publicacionesTexto.add(set);
    }

    public void setEmoji(Emoji set){
        this.publicacionesEmoji.add(set);
    }

    public void setFoto(foto set){
        this.publicacionesFoto.add(set);
    }

    public void setAudio(Audio set){
        this.publicacionesAudio.add(set);
    }

    public void setVideo(Video set){
        this.publicacionesVideo.add(set);
    }
/*
    public List<Texto> buscaHashtagTexto(String hash){
        for(int i = 0; i < publicacionesTexto.size(); i++ ){
            if()

            }
        }
    }

    */
    public List<Texto> getPublicacionesTexto(){
        return this.publicacionesTexto;
    }
    
}
