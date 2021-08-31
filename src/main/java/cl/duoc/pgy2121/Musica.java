/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

import java.sql.Time;

/**
 *
 * @author Difo
 */
public class Musica {
    private String titulo,artista;
    private Boolean favorita,descarga;
    private Integer minutos,segundos;

    public Musica(String titulo, String artista, Integer minutos, Integer segundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.minutos = minutos;
        this.segundos = segundos;
    }



    public Musica(Boolean favorita, Boolean descarga) {
        this.favorita = favorita;
        this.descarga = descarga;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }


    public Boolean getFavorita() {
        return favorita;
    }

    public void setFavorita(Boolean favorita) {
        this.favorita = favorita;
    }

    public Boolean getDescarga() {
        return descarga;
    }

    public void setDescarga(Boolean descarga) {
        this.descarga = descarga;
    }
    
    
    //Métodos custom
    public void adelantar(Integer segundos){
        System.out.println("Adelantando musica "+ segundos + "segundos");
    }
    
    public void reproducir(){
        System.out.println("Reproduciendo cancion "+ titulo +" del artista " + artista);
    }
    
    public void detallar(){
        System.out.println("Detalles de cancion elegida: ");
        System.out.println("Título: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Duración: "+minutos+":"+segundos);
        
    }
}

