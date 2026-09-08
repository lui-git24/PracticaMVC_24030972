/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroautomaticov2;

/**
 *
 * @author Aztla
 */
import java.util.Scanner;
public class CajeroVista {
    private Scanner scanner;

    public CajeroVista() {
        this.scanner = new Scanner(System.in);
    }

    public String solicitarNumeroCuenta() {
        System.out.println("===== CAJERO AUTOMÁTICO =====");
        System.out.print("Ingrese su número de cuenta: ");
        return scanner.nextLine();
    }

    public void mostrarBienvenida(String titular, String numeroCuenta) {
        System.out.println("\nBienvenido: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
    }

    public int mostrarMenuYObtenerOpcion() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public double solicitarCantidad(String tipoOperacion) {
        System.out.print("Cantidad a " + tipoOperacion + ": $");
        return scanner.nextDouble();
    }

    public void mostrarSaldo(double saldo) {
        System.out.println("Saldo actual: $" + saldo);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrar() {
        scanner.close();
    }
}
