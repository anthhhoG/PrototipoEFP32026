package Controlador.Carreras;

/**
 * Autor: Anthony Hetzael Suc Gomez
 * Carné: 9959-24-389
 * Fecha de creación: 2026
 *
 * Descripción:
 * Clase controladora para la entidad Carreras.
 */
public class clsCarreras {

    private String codigoCarrera;
    private String nombreCarrera;
    private String codigoFacultad;
    private String estatusCarrera;

    // Constructor vacío
    public clsCarreras() {
    }

    // Constructor con parámetros
    public clsCarreras(String codigoCarrera, String nombreCarrera,
                       String codigoFacultad, String estatusCarrera) {
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
        this.codigoFacultad = codigoFacultad;
        this.estatusCarrera = estatusCarrera;
    }

    // Getters y Setters
    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getCodigoFacultad() {
        return codigoFacultad;
    }

    public void setCodigoFacultad(String codigoFacultad) {
        this.codigoFacultad = codigoFacultad;
    }

    public String getEstatusCarrera() {
        return estatusCarrera;
    }

    public void setEstatusCarrera(String estatusCarrera) {
        this.estatusCarrera = estatusCarrera;
    }

    @Override
    public String toString() {
        return "clsCarreras{"
                + "codigoCarrera='" + codigoCarrera + '\''
                + ", nombreCarrera='" + nombreCarrera + '\''
                + ", codigoFacultad='" + codigoFacultad + '\''
                + ", estatusCarrera='" + estatusCarrera + '\''
                + '}';
    }
}