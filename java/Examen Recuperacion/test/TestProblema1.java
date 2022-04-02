import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {

    @Test
    public void debe_haber_dos_jugadores(){
        PiedraPapelTijera juego = new PiedraPapelTijera();
        juego.crearJugador();
    }

    @Test
    public void elegir_opciones(){
        PiedraPapelTijera juego = new PiedraPapelTijera();
        juego.elegiropciones();
    }

    @Test
    public void piedra_gana_a_tijeras(){
        PiedraPapelTijera juego = new PiedraPapelTijera();
        juego.jugada(Opcion.PIEDRA, Opcion.TIJERA);

    }

    @Test
    public void tijeras_ganan_a_papel(){
        PiedraPapelTijera juego = new PiedraPapelTijera();
        juego.jugada(Opcion.TIJERA, Opcion.PAPEL);


    }

    @Test
    public void papel_gana_a_piedra(){
        PiedraPapelTijera juego = new PiedraPapelTijera();
        juego.jugada(Opcion.PAPEL, Opcion.PIEDRA);
    }

    @Test
    public void si_coinciden_igual_a_empate(){
        PiedraPapelTijera juego = new PiedraPapelTijera();
        juego.jugada(Opcion.PAPEL,Opcion.PAPEL);


    }
}
