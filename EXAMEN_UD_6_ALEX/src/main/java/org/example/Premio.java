package org.example;

public class Premio extends MutxaAwards {

    private Categoria categoria;
    private Artista ganador;

    //Creamos el constructor de premio
    public Premio(Categoria categoria) {
        this.categoria = categoria;
    }
    //Hacemos los overrides correspondientes
    @Override
    public void obtenerDetalles() {
        System.out.println("El premio a la categoria " + categoria + " es " + ganador);
    }
    @Override
    public String toString(){
        return categoria.toString();
    }


    //Creamos los Gett & Sett necesarios para el funcionamiento
    public String getGanador() {
        return ganador.getNombre();
    }

    public void setGanador(Artista ganador) {
        this.ganador = ganador;
    }
}
