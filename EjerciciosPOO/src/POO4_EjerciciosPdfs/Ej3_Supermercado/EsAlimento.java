package POO4_EjerciciosPdfs.Ej3_Supermercado;

import java.time.LocalDate;

public interface EsAlimento {

    /**
     * Esta interfaz indica que los objetos creados a partir de esta interfaz son alimentos y deberán de implementar los siguientes metodos.
     */

    public void setCaducidad(LocalDate fc);

    public LocalDate getCaducidad();

    public int getCalorias();

}
