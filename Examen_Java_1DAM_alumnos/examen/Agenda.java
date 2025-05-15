package examen;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una lista de contactos.
 * Se deben implementar los métodos indicados y completar getters y setters de la clase Agenda
 */
public class Agenda {
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    /**
     * Agrega un nuevo contacto a la agenda.
     */
    public void agregarContacto(Contacto contacto) {
        // TODO: Añadir el contacto a la lista
        contactos.add(contacto);
        System.out.println(contacto.getNombre()+" añadido a la lista.");
    }

    /**
     * Elimina un contacto por nombre.
     * @return true si se eliminó correctamente, false si no se encontró
     */
    public boolean eliminarContacto(String nombre) {
        // TODO: Buscar y eliminar contacto por nombre (ignorar mayúsculas/minúsculas)
        for (Contacto contacto : contactos){
            if (contacto.getNombre().equalsIgnoreCase(nombre)){
                contactos.remove(contacto);
                System.out.println(contacto.getNombre()+" eliminado de la lista.");
                return true;
            }
        }
        return false;
    }

    /**
     * Busca todos los contactos que contengan el nombre dado.
     */
    public List<Contacto> buscarContacto(String nombre) {
        // TODO: Buscar contactos cuyo nombre contenga el texto indicado
        List<Contacto> contactosEncontrados = new ArrayList<>();

        for (Contacto contacto : contactos){
            if (contacto.getNombre().equalsIgnoreCase(nombre)){
                contactosEncontrados.add(contacto);
            }
        }
        return contactosEncontrados;
    }

    public void guardarEnJSON(List<Contacto> contactos, String rutaJSON){
        try {
            File archivoJSON = new File(rutaJSON);

            ObjectMapper mapper = new ObjectMapper();

            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            mapper.writeValue(archivoJSON, contactos);
        } catch (StreamWriteException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (DatabindException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
