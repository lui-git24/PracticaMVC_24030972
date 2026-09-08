/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroautomaticov2;

/**
 *
 * @author Aztla
 */
import java.util.ArrayList;
public class Banco {
    private ArrayList<Cuenta> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
        // Inicialización de datos
        cuentas.add(new Cuenta("1001", "Juan Pérez", 5000));
        cuentas.add(new Cuenta("1002", "María López", 8500));
        cuentas.add(new Cuenta("1003", "Pedro García", 3200));
        cuentas.add(new Cuenta("1004", "Ana Martínez", 12000));
    }

    public Cuenta buscarCuenta(String numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
    }
}
