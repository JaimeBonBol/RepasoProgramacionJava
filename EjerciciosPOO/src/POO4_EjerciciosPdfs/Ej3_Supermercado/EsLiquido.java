package POO4_EjerciciosPdfs.Ej3_Supermercado;

public interface EsLiquido {

    /**
     * Esta interfaz indica que los objetos creados que implementen est interfaz serán liqidos y deben de implementar los siguientes metodos.
     */

    public void setVolumen(double v);

    public double getVolumen();

    public void setTipoEnvase(String env);

    public String getTipoEnvase();

}
