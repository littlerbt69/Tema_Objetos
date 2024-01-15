package Boletin_4_2;

class Partido {
    private int jornada;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private char resultadoQuiniela;

    public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisitante) {
        this.jornada = jornada;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = 0;
        this.golesVisitante = 0;
        this.resultadoQuiniela = ' ';
    }

    public void ponerResultado(String resultado) throws IllegalArgumentException {
        try {
            String[] goles = resultado.split("-");
            this.golesLocal = Integer.parseInt(goles[0]);
            this.golesVisitante = Integer.parseInt(goles[1]);

            // Actualizar atributos y resultados de los equipos
            actualizarEquipos();

            // Actualizar resultado de la quiniela
            actualizarQuiniela();

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Formato de resultado incorrecto. Debe ser en el formato '1-2'.");
        }
    }

    private void actualizarEquipos() {
        if (golesLocal > golesVisitante) {
            equipoLocal.incrementarPartidosGanados();
        } else if (golesLocal < golesVisitante) {
            equipoVisitante.incrementarPartidosGanados();
        }
    }

    private void actualizarQuiniela() {
        if (golesLocal > golesVisitante) {
            resultadoQuiniela = '1';
        } else if (golesLocal < golesVisitante) {
            resultadoQuiniela = '2';
        } else {
            resultadoQuiniela = 'X';
        }
    }

    @Override
    public String toString() {
        if (golesLocal == 0 && golesVisitante == 0) {
            return "Partido entre equipo local " + equipoLocal.getNombre() +
                    " y equipo visitante " + equipoVisitante.getNombre() + " todavía no se ha jugado";
        } else {
            return "Partido entre equipo local " + equipoLocal.getNombre() +
                    " y equipo visitante " + equipoVisitante.getNombre() +
                    " jugado. Resultado: " + golesLocal + "-" + golesVisitante +
                    ". Resultado quiniela= " + resultadoQuiniela;
        }
    }
}