/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroautomaticov2;

/**
 *
 * @author Aztla
 */
public class CajeroControlador {
    private Banco banco;
    private CajeroVista vista;
    private Cuenta cuentaActual;

    public CajeroControlador(Banco banco, CajeroVista vista) {
        this.banco = banco;
        this.vista = vista;
    }

    public void iniciar() {
        String numeroCuenta = vista.solicitarNumeroCuenta();
        cuentaActual = banco.buscarCuenta(numeroCuenta);

        if (cuentaActual == null) {
            vista.mostrarMensaje("Error: la cuenta no existe.");
            return;
        }

        vista.mostrarBienvenida(cuentaActual.getTitular(), cuentaActual.getNumeroCuenta());

        int opcion;
        do {
            opcion = vista.mostrarMenuYObtenerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 4);

        vista.cerrar();
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                vista.mostrarSaldo(cuentaActual.getSaldo());
                break;

            case 2:
                double montoDeposito = vista.solicitarCantidad("depositar");
                if (cuentaActual.depositar(montoDeposito)) {
                    vista.mostrarMensaje("Depósito exitoso.");
                } else {
                    vista.mostrarMensaje("Error: el depósito debe ser mayor a $0.");
                }
                vista.mostrarSaldo(cuentaActual.getSaldo());
                break;

            case 3:
                double montoRetiro = vista.solicitarCantidad("retirar");
                if (montoRetiro <= 0) {
                    vista.mostrarMensaje("Error: la cantidad debe ser mayor a $0.");
                } else if (cuentaActual.retirar(montoRetiro)) {
                    vista.mostrarMensaje("Retiro exitoso.");
                } else {
                    vista.mostrarMensaje("Error: saldo insuficiente.");
                }
                vista.mostrarSaldo(cuentaActual.getSaldo());
                break;

            case 4:
                vista.mostrarMensaje("Gracias por utilizar el cajero automático.");
                break;

            default:
                vista.mostrarMensaje("Error: opción no válida.");
                break;
        }
    }
}
