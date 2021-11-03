//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.ArrayList;
import java.util.List;
//*****************************************************************************
//Clase
//*****************************************************************************
public abstract class Post {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    protected String autor;
    protected String fecha;
    protected String titulo;
    protected int likes = 0;
    protected List<String> hashtags = new ArrayList<>();
    protected List<String> comentarios = new ArrayList<>();


    //*************************************************************************
    //Metodos
    //*************************************************************************
    public abstract void publicacion();

    public void setAutor(String nombre){
        this.autor = nombre;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    } 

    public void setLikes(){
        this.likes = this.likes + 1;
    }
    public void setHashtags(String hash){
        this.hashtags.add(hash);
    }
    public void setComentarios(String coment){
        this.comentarios.add(coment);
    }

    public String getAutor(){
        return autor;
    }
    public String getFecha(){
        return fecha;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getLikes(){
        return likes;
    }
    public List <String> getHashtags(){
        return this.hashtags;
    }
    public List <String> getComentarios(){
        return this.comentarios;
    }

}
