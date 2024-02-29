/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente("", "", 0);
        
        Factura factura1 = new Factura();
        Factura factura2 = new Factura(0, 0, 0, 0, 0);
        
        int opcion;
        
        //Aquí se soliitan los datos del cliente
        cliente1.setName(JOptionPane.showInputDialog("Ingrese el nombre del cliente: "));
        cliente1.setLastName(JOptionPane.showInputDialog("Ingrese los apellidos del cliente: "));
        cliente1.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente: ")));
        
        /*En este ciclo se solicitarán los datos de la factura*/
        do {
            
            factura1.setBillCode(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la factura: ")));
            factura1.setBillAmount(Integer.parseInt(JOptionPane.showInputDialog("Digite el monto de la factura: ")));
            factura1.setMonth(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes en el que se creó la factura: ")));
            factura1.setYear(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año en el que se creó la factura: ")));
            factura1.setBillState(Integer.parseInt(JOptionPane.showInputDialog("Indique el estado de la factura: ")));
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar otra factura? \n"
                    + "0. Si no desea realizar otra \n"
                    + "Digite cualquier otra opción si desea realizar otra factura"));
            
        } while (opcion != 0);
        
        

        
        JOptionPane.showMessageDialog(null, factura1.getBillState() + " \n"
                + "El monto a pagar de la factura es de: " +((factura1.getBillAmount() * 0.15) + factura1.getBillAmount()) / 4 + " \n"
                        + "Que se desglosará de la siguiente manera: \n"
                        + "1. Cuota 1: " +((factura1.getBillAmount() * 0.15) + factura1.getBillAmount()) / 4 + " Fecha de pago marzo 2024 \n"
                                + "2. Cuota 2: " +((factura1.getBillAmount() * 0.15) + factura1.getBillAmount()) / 4 + " Fecha de pago abril 2024 \n"
                                        + "3. Cuota 3: " +((factura1.getBillAmount() * 0.15) + factura1.getBillAmount()) / 4 + " Fecha de pago mayo 2024 \n"
                                                + "4. Cuota 4: " +((factura1.getBillAmount() * 0.15) + factura1.getBillAmount()) / 4 + " Fecha de pago junio 2024 \n");
        
        
        
        
    }
    
    
    
}
