package org.example;

public class AppMutxaAwards {
    public static void main(String[] args) {
        Presentador Aznar = new Presentador("José María Aznar");
        Aznar.obtenerDetalles();

        System.out.println();


        Artista Roberto = new Artista("Roberto Maximiliano");
        Artista Chema = new Artista("José 'El pirulas' María");
        Artista Matias = new Artista("Matias Cuesta Mucho");
        Artista Mario = new Artista("Mario Silva");
        Artista Pepa = new Artista("Pepa Mari");

        System.out.println();


        Roberto.alfombraRoja();
        Chema.alfombraRoja();
        Matias.alfombraRoja();
        Mario.alfombraRoja();
        Pepa.alfombraRoja();

        System.out.println();


        Roberto.aplaudir();
        Chema.aplaudir();
        Matias.aplaudir();
        Mario.aplaudir();
        Pepa.aplaudir();

        System.out.println();


        Aznar.presentar();
        Aznar.darDiscurso("para solidarizarse con los afectados de la DANA");

        System.out.println();


        Premio primerPremio = new Premio(Categoria.MEJOR_ACTOR);

        System.out.println();


        Chema.esNominado(Categoria.MEJOR_ACTOR);
        Roberto.esNominado(Categoria.MEJOR_ACTOR);
        Matias.esNominado(Categoria.MEJOR_ACTOR);
        Mario.esNominado(Categoria.MEJOR_ACTOR);

        System.out.println();


        Chema.esNominado(Categoria.MEJOR_ACTOR);

        System.out.println();


        Chema.ganarPremio(primerPremio);

        System.out.println();


        Roberto.aplaudir();
        Chema.aplaudir();
        Matias.aplaudir();
        Mario.aplaudir();
        Pepa.aplaudir();

        System.out.println();


        Roberto.celebrarPremio(primerPremio);
        Chema.celebrarPremio(primerPremio);
        Matias.celebrarPremio(primerPremio);
        Mario.celebrarPremio(primerPremio);
        Pepa.celebrarPremio(primerPremio);

        System.out.println();


        try {
            Matias.recogerPremio(primerPremio);
        } catch (NotWinnerException e) {
            System.out.println(e);
        }

        System.out.println();


        try {
            Chema.recogerPremio(primerPremio);
        } catch (NotWinnerException e) {
            System.out.println(e);
        }

        System.out.println();


        Chema.darDiscurso("sobre el esfuerzo realizado para rodar la pelicula");

        System.out.println();


        Roberto.aplaudir();
        Chema.aplaudir();
        Matias.aplaudir();
        Mario.aplaudir();
        Pepa.aplaudir();


        System.out.println();

        /* no se comenta*/

        Aznar.darDiscurso("para introducir el siguiente premio: MEJOR_PELICULA");

        System.out.println();


        Premio segundoPremio = new Premio(Categoria.MEJOR_PELICULA);

        System.out.println();


        Chema.esNominado(Categoria.MEJOR_PELICULA);
        Roberto.esNominado(Categoria.MEJOR_PELICULA);
        Matias.esNominado(Categoria.MEJOR_PELICULA);
        Pepa.esNominado(Categoria.MEJOR_PELICULA);

        System.out.println();


        Pepa.ganarPremio(segundoPremio);

        System.out.println();


        Roberto.celebrarPremio(segundoPremio);
        Chema.celebrarPremio(segundoPremio);
        Matias.celebrarPremio(segundoPremio);
        Mario.celebrarPremio(segundoPremio);
        Pepa.celebrarPremio(segundoPremio);

        System.out.println();


        Aznar.entregarPremio(segundoPremio);

        System.out.println();


        Pepa.darDiscurso("sobre lo duro que ha sido conseguir financiación");

        System.out.println();

        Aznar.darDiscurso("para despedir la gala");

        System.out.println();

        Roberto.obtenerDetalles();
        Chema.obtenerDetalles();
        Matias.obtenerDetalles();
        Mario.obtenerDetalles();
        Pepa.obtenerDetalles();



    }
}
