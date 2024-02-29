/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Factura {
    
    private int billCode;
    private int billAmount;
    private int month;
    private int year;
    private int billState;

    public Factura() {
    }

    public Factura(int billCode, int billAmount, int month, int year, int billState) {
        this.billCode = billCode;
        this.billAmount = billAmount;
        this.month = month;
        this.year = year;
        this.billState = billState;
    }

    public int getBillCode() {
        return billCode;
    }

    public void setBillCode(int billCode) {
        this.billCode = billCode;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBillState() {
        if (billState == 2) {
            JOptionPane.showMessageDialog(null, "Las siguientes facturas estan pendientes: " + billCode + ", con un monto pendiente de: " + billAmount);
            
        }
        return billState;
    }

    public void setBillState(int billState) {
        this.billState = billState;
    }
    
    
    
}
