/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Luis
 */
public class Cliente extends Persona {
    
    private Integer id;
    private String nombre;
    private String apellido;
    private String cedula_Identidad;
    private String telefono;
    private String direccion;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    @Override
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cedula_Identidad
     */
    public String getCedula_Identidad() {
        return cedula_Identidad;
    }

    /**
     * @param cedula_Identidad the cedula_Identidad to set
     */
    public void setCedula_Identidad(String cedula_Identidad) {
        this.cedula_Identidad = cedula_Identidad;
    }

    /**
     * @return the telefono
     */
    @Override
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    @Override
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
