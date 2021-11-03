//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************
public class Controlador {

        public static void main(String[] args){
                Vista vis = new Vista();
                Sistema sis = new Sistema();
                vis.bienvenida();
                int opcion = 0;
                int contMenu = 0;
                int contMenuPublicar = 0;
                int deseaHashtag = 0;
                int multimediaMenu = 0;
                int menuLikeComent = 0;
                while(contMenu != 4){
                        contMenu = vis.menu();
                        switch(contMenu){
                                case 1:
                                        contMenuPublicar = vis.publicar();
                                        switch(contMenuPublicar){
                                                case 1:
                                                        Texto tex = new Texto();
                                                        tex.setAutor(vis.autor());
                                                        tex.setTitulo(vis.titulo());
                                                        tex.setFecha(vis.fecha());
                                                        tex.setPublicacion(vis.texto()); 
                                                        //int  deseaHashtag = 0;
                                                        while(deseaHashtag != 2){
                                                                deseaHashtag = vis.agregarHashtag();
                                                                switch(deseaHashtag){
                                                                        case 1:
                                                                                tex.setHashtags(vis.hashtag());
                                                                                break;
                                                                        case 2:
                                                                                deseaHashtag = 2;
                                                                                break;
                                                                }
                                                        }
                                                        vis.realizado();
                                                        deseaHashtag = 0;
                                                        vis.pubAutor(tex.getAutor());
                                                        vis.pubTitulo(tex.getTitulo());
                                                        vis.pubFecha(tex.getFecha());
                                                        vis.pubPublicacion(tex.getPublicacion());
                                                        vis.pubHashtags(tex.getHashtags());
                                                        vis.pubLikes(tex.getLikes());
                                                        sis.setTexto(tex);
                                                        break;

                                                       

                                                case 2:
                                                        Emoji emo = new Emoji();
                                                        emo.setAutor(vis.autor());
                                                        emo.setTitulo(vis.titulo());
                                                        emo.setFecha(vis.fecha());
                                                        String emojii = emo.publicacion(vis.emoji());
                                                        emo.setPublicacion(emojii);
                                                        //int  deseaHashtag = 0;
                                                        while(deseaHashtag != 2){
                                                                deseaHashtag = vis.agregarHashtag();
                                                                switch(deseaHashtag){
                                                                        case 1:
                                                                                emo.setHashtags(vis.hashtag());
                                                                                break;
                                                                        case 2:
                                                                                deseaHashtag = 2;
                                                                                break;
                                                                }
                                                        }
                                                        vis.realizado();
                                                        deseaHashtag = 0;
                                                        vis.pubAutor(emo.getAutor());
                                                        vis.pubTitulo(emo.getTitulo());
                                                        vis.pubFecha(emo.getFecha());
                                                        vis.pubPublicacion(emo.getPublicacion());
                                                        vis.pubHashtags(emo.getHashtags());
                                                        vis.pubLikes(emo.getLikes());
                                                        sis.setEmoji(emo);
                                                        
                                                        break;

                                                case 3:
                                                        while(multimediaMenu != 4){
                                                                multimediaMenu = vis.multimedia();
                                                                switch(multimediaMenu){
                                                                        case 1:
                                                                                foto fot = new foto();
                                                                                fot.setAutor(vis.autor());
                                                                                fot.setTitulo(vis.titulo());
                                                                                fot.setFecha(vis.fecha());
                                                                                fot.setPublicacion(vis.foto());
                                                                                fot.setResolucion(vis.resolucion());
                                                                                while(deseaHashtag != 2){
                                                                                        deseaHashtag = vis.agregarHashtag();
                                                                                        switch(deseaHashtag){
                                                                                                case 1:
                                                                                                        fot.setHashtags(vis.hashtag());
                                                                                                        break;
                                                                                                case 2:
                                                                                                        deseaHashtag = 2;
                                                                                                        break;
                                                                                        }
                                                                                }
                                                                                vis.realizado();
                                                                                deseaHashtag = 0;
                                                                                vis.pubAutor(fot.getAutor());
                                                                                vis.pubTitulo(fot.getTitulo());
                                                                                vis.pubFecha(fot.getFecha());
                                                                                vis.pubPublicacion(fot.getPublicacion());
                                                                                vis.pubResolucion(fot.getResolucion());
                                                                                vis.pubHashtags(fot.getHashtags());
                                                                                vis.pubLikes(fot.getLikes());
                                                                                sis.setFoto(fot);


                                                                                break;
                                                                        case 2:
                                                                                Audio aud = new Audio();
                                                                                aud.setAutor(vis.autor());
                                                                                aud.setTitulo(vis.titulo());
                                                                                aud.setFecha(vis.fecha());
                                                                                aud.setPublicacion(vis.foto());
                                                                                aud.setSampleRate(vis.sampleRate());
                                                                                while(deseaHashtag != 2){
                                                                                        deseaHashtag = vis.agregarHashtag();
                                                                                        switch(deseaHashtag){
                                                                                                case 1:
                                                                                                        aud.setHashtags(vis.hashtag());
                                                                                                        break;
                                                                                                case 2:
                                                                                                        deseaHashtag = 2;
                                                                                                        break;
                                                                                        }
                                                                                }
                                                                                vis.realizado();
                                                                                deseaHashtag = 0;
                                                                                vis.pubAutor(aud.getAutor());
                                                                                vis.pubTitulo(aud.getTitulo());
                                                                                vis.pubFecha(aud.getFecha());
                                                                                vis.pubPublicacion(aud.getPublicacion());
                                                                                vis.pubSampleRate(aud.getSampliRate());
                                                                                vis.pubBitDepth(aud.getBitDepth());
                                                                                vis.pubHashtags(aud.getHashtags());
                                                                                vis.pubLikes(aud.getLikes());
                                                                                sis.setAudio(aud);
                                                                                break;
                                                                        case 3:
                                                                                Video vid = new Video();
                                                                                vid.setAutor(vis.autor());
                                                                                vid.setTitulo(vis.titulo());
                                                                                vid.setFecha(vis.fecha());
                                                                                vid.setPublicacion(vis.foto());
                                                                                vid.setFrameRate(vis.frameRate());
                                                                                while(deseaHashtag != 2){
                                                                                        deseaHashtag = vis.agregarHashtag();
                                                                                        switch(deseaHashtag){
                                                                                                case 1:
                                                                                                        vid.setHashtags(vis.hashtag());
                                                                                                        break;
                                                                                                case 2:
                                                                                                        deseaHashtag = 2;
                                                                                                        break;
                                                                                        }
                                                                                }
                                                                                vis.realizado();
                                                                                deseaHashtag = 0;
                                                                                vis.pubAutor(vid.getAutor());
                                                                                vis.pubTitulo(vid.getTitulo());
                                                                                vis.pubFecha(vid.getFecha());
                                                                                vis.pubPublicacion(vid.getPublicacion());
                                                                                vis.pubFrameRate(vid.getFrameRate());
                                                                                vis.pubHashtags(vid.getHashtags());
                                                                                vis.pubLikes(vid.getLikes());
                                                                                sis.setVideo(vid);

                                                                                break;
                                                                        case 4:
                                                                                break;
                                                                }
                                                        }        

                                                        break;

                                                case 4:

                                                        break;

                                        }
                                        break;

                                case 2:
                                        String filtroF = vis.filtroFecha();
                                        for(Texto tex : sis.getPublicacionesTexto()){//para cada objeto de tipo texto en en array
                                                if(tex.getFecha().equals(filtroF)){//si la fecha de la publicacion es igual a la fecha buscada
                                                        vis.pubAutor(tex.getAutor());
                                                        vis.pubTitulo(tex.getTitulo());
                                                        vis.pubFecha(tex.getFecha());
                                                        vis.pubPublicacion(tex.getPublicacion());
                                                        vis.pubHashtags(tex.getHashtags());
                                                        vis.pubLikes(tex.getLikes());
                                                       // sis.setTexto(tex);     
                                                }

                                                else{
                                                        vis.noHayTexto();
                                                }
                                        }
                                        while(menuLikeComent != 3){
                                                menuLikeComent = vis.likeOComentar();
                                                switch(menuLikeComent){
                                                        case 1:
                                                                String nombre = vis.aCualDarLike();
                                                                for(Texto tex : sis.getPublicacionesTexto()){//para cada objeto de tipo texto en en array
                                                                        if(tex.getAutor().equals(nombre)){//si la fecha de la publicacion es igual a la fecha buscada
                                                                                tex.setLikes();
                                                                                /*
                                                                                vis.pubAutor(tex.getAutor());
                                                                                vis.pubTitulo(tex.getTitulo());
                                                                                vis.pubFecha(tex.getFecha());
                                                                                vis.pubPublicacion(tex.getPublicacion());
                                                                                vis.pubHashtags(tex.getHashtags());
                                                                                vis.pubLikes(tex.getLikes());
                                                                                //sis.setTexto(tex); */
                                                                                //    
                                                                        }
                                                                }
                                                                break;
                                                        case 2: 
                                                                break;
                                                        case 3:
                                                                break;
                                                }
                                        }

                                    
                                        break;

                                case 3:

                                        break;

                                case 4:

                                        break;
                        }
                }
        }
}
