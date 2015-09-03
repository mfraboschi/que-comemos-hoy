package statistics;

public class EstadisticaFactory {

    public static final String SEXO = "sexo";
    public static final String DIFICULTAD = "dificultad";
    public static final String RANKING = "ranking";

    public Estadistica obtenerTipoEstadistica(String tipoEstadistica) {
        if(tipoEstadistica.equals(SEXO)) {
            return new EstadisticaPorSexo();
        }

        if(tipoEstadistica.equals(DIFICULTAD)) {
            return new EstadisticaPorDificultad();
        }

        if(tipoEstadistica.equals(RANKING)) {
            return new EstadisticaPorMasConsultadas();
        }

        return null;
    }
}
