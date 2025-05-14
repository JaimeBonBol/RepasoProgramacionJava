package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.repasoCRUD.CRUDPersona;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorPersonas {

    private List<Persona> personas = new ArrayList<>();

    private String rutaArchivoJSON = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/repasoCRUD/CRUDPersona/personas.json";

    public GestorPersonas(){
        cargarDesdeJSON(rutaArchivoJSON);
    }

    public void crearPersona(Persona persona){
        personas.add(persona);
        guardarEnJSON(rutaArchivoJSON);
        System.out.println(persona.getNombre()+" añadid@ a la lista.");
    }

    public void mostrarListaPersonas(){
        System.out.println("Mostrando lista de personas.");
        if (!personas.isEmpty()){
            for (Persona persona : personas){
                System.out.println(persona);
            }
        }else System.out.println("La lista esta vacía.");
    }

    public void actualizarPersona(String nombre, Persona personaNueva){

        boolean personaEncontrada =false;

        for (Persona p : personas){
            if (!personas.isEmpty()){
                if (p.getNombre().equalsIgnoreCase(nombre)){
                    p.setNombre(personaNueva.getNombre());
                    p.setEdad(personaNueva.getEdad());
                    p.setEmail(personaNueva.getEmail());

                    guardarEnJSON(rutaArchivoJSON);

                    System.out.println("Persona actualizada.");
                    personaEncontrada = true;
                    break;
                }
            }else System.out.println("La lista esta vacía.");
        }

        if (!personaEncontrada){
            System.out.println("La persona no está en la lista.");
        }
    }

    public void eliminarPersona(String nombrePersonaEliminar){

        boolean personaEncontrada = false;

        for (Persona persona : personas){
            if (!personas.isEmpty()){

                if (persona.getNombre().equalsIgnoreCase(nombrePersonaEliminar)){
                    personas.remove(persona);
                    guardarEnJSON(rutaArchivoJSON);
                    System.out.println("Persona eliminada.");

                    personaEncontrada = true;
                    break;
                }

            }else System.out.println("La lista está vacía.");
        }

        if (!personaEncontrada){
            System.out.println("La persona no está en la lista.");
        }
    }

    public void guardarEnJSON(String rutaArhcivo){
        try {
            File archivoJSON = new File(rutaArhcivo);

            if (!archivoJSON.exists()){
                archivoJSON.createNewFile();
                System.out.println("Archivo JSON creado "+archivoJSON.getName());
            }

            ObjectMapper mapper = new ObjectMapper();

            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            mapper.writeValue(archivoJSON, personas);

            System.out.println("Datos guardados en archivo JSON "+archivoJSON.getName());


        } catch (DatabindException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (StreamWriteException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void cargarDesdeJSON(String rutaArchivo){
        try {
            File archivoJSON = new File(rutaArchivo);

            if (archivoJSON.exists()){

                ObjectMapper mapper = new ObjectMapper();

                List<Persona> personasCargadas =  mapper.readValue(archivoJSON, new TypeReference<List<Persona>>() {});

                this.personas = personasCargadas;

            }else System.out.println("El archivo desde donde cargar no existe.");

        } catch (StreamReadException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (DatabindException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
