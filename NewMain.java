/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinee;

/**
 *
 * @author Luis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        c1.setApellido("Ipiales");
        c1.setCedula_Identidad("1723030605");
        c1.setDireccion("Sangolqui");
        
        System.out.println("cliente: "+c1.getApellido()+ "Cedula: "+c1.getCedula_Identidad()+"Direccion: "+c1.getDireccion());
    }
    
}
