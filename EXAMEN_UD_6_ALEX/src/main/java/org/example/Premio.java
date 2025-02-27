package org.example;

public class Premio extends MutxaAwards {

    private Categoria categoria;
    private Artista ganador;

    public Premio(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public void obtenerDetalles() {
        System.out.println("El premio a la categoria " + categoria + " es " + ganador);
    }
    @Override
    public String toString(){
        return categoria.toString();
    }

    public String getGanador() {
        return ganador.getNombre();
    }

    public void setGanador(Artista ganador) {
        this.ganador = ganador;
    }
}
