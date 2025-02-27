package org.example;

public class Presentador extends MutxaAwards implements AccionesAsistentes {

    private String nombre;

    public Presentador(String nombre) {
        this.nombre = nombre;
    }

    public void presentar(){
        System.out.println(nombre + " presentando la gala...");
    }

    public void entregarPremio(Premio premio){
        System.out.println("El presentador " + nombre + " entrega el preimo " + premio.toString() + " a " + premio.getGanador());
    }

    @Override
    public void obtenerDetalles() {
        System.out.println("El presentador es: " + nombre);
    }

    @Override
    public void aplaudir() {
        System.out.println("El presentador " + nombre + " aplaude... PLAS PLAS PLAS");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("El presentador " + nombre + " desfila por la alfombra roja");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("El presentador " + nombre + " da un discurso " + tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El presentador " + nombre + " celebra el premio " + premio);
    }

}
