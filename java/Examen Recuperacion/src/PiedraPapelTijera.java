public class PiedraPapelTijera {


    public Ganador jugada(Opcion eleccionJugador1, Opcion eleccionJugador2) {

        if (eleccionJugador1 == eleccionJugador2)
            return Ganador.EMPATE;

        if ((eleccionJugador1==Opcion.PIEDRA && eleccionJugador2==Opcion.TIJERA) ||
                (eleccionJugador1==Opcion.TIJERA && eleccionJugador2==Opcion.PAPEL) ||
                (eleccionJugador1==Opcion.PAPEL && eleccionJugador2==Opcion.PIEDRA))
            return Ganador.JUGADOR1;

        return Ganador.JUGADOR2;
    }

    public void crearJugador() {
    }

    public void elegiropciones() {
    }
}
enum Opcion
{
    PIEDRA,
    PAPEL,
    TIJERA
}

enum Ganador
{
    JUGADOR1,
    JUGADOR2,
    EMPATE
}