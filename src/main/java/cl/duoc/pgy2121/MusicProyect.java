/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

/**
 *
 * @author Difo
 */
public class MusicProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a mi programa musical");
        
        Musica cancion1 = new Musica("Wish you where here","Pink Floyd",5,40);
        cancion1.setFavorita(Boolean.TRUE);
        cancion1.setDescarga(Boolean.TRUE);
        
        
        Musica cancion2 = new Musica("Asereje", "The Ketchup", 3,32);
        cancion2.setFavorita(Boolean.TRUE);
        cancion2.setDescarga(Boolean.TRUE);
        
        //Reproduciendo cancion elegida
        cancion1.reproducir();
        cancion2.reproducir();
        //Adelantando cancion 5 segundos
        cancion1.adelantar(5);
        
        cancion1.getArtista();
        //Imprimir detalles de cancion
        cancion1.detallar();
        cancion2.detallar();
        
        
    }
    
}
