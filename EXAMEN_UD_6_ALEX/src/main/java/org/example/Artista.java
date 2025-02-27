package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Artista extends MutxaAwards implements AccionesAsistentes {

    private String nombre;
    private ArrayList<Premio> listaPremios;
    private ArrayList<Categoria> categorias;

    public Artista(String nombre) {
        this.nombre = nombre;
        categorias  = new ArrayList<>();
        listaPremios = new ArrayList<>();
    }

    void esNominado(Categoria categoria){
        System.out.println("El artista " + nombre + " ha sido nominado a " + categoria);
        categorias.add(categoria);
    }

    void ganarPremio(Premio premio){
            System.out.println("El artista " + nombre + " ha sido ganado a " + premio);
            premio.setGanador(this); //Al referenciar con 'This' meterá al propio objeto dentro del parámetro.
            listaPremios.add(premio);
    }

    void recogerPremio(Premio premio){
        if (Objects.equals(premio.getGanador(), nombre)){
            System.out.println("El artista " + nombre + " recoge su premio " + premio);
        } else {
            throw new NotWinnerException("No ha ganado el premio " + premio);
        }
    }

    @Override
    public void obtenerDetalles() {
        System.out.println("El Artista es: " + nombre + ", nominado a " + categorias
                + " y " + listaPremios.size() + " premios");
    }

    @Override
    public void aplaudir() {
        System.out.println("El Artista " + nombre + " aplaude... PLAS PLAS PLAS");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("El Artista " + nombre + " desfila por la alfombra roja");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("El Artista " + nombre + " da un discurso  sobre " + tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El Artista " + nombre + " celebra el premio " + premio);
    }

    public String getNombre() {
        return nombre;
    }
}
