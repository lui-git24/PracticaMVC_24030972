/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomaticov2;

/**
 *
 * @author Aztla
 */

public class CajeroAutomaticoV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Banco banco = new Banco();
        CajeroVista vista = new CajeroVista();
        
        CajeroControlador controlador = new CajeroControlador(banco, vista);
        controlador.iniciar();     
    }  
}
