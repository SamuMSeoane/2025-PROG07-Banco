/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.martinez_seoane_samuel_prog07_tarea;

/**
 * Clase abstracta de la que heredarán los distintos tipos de cuenta.
 * Dispone de un titular, saldo y un IBAN para identificarla. 
 * @author Samuel
 */
public class Cuenta {
    private Persona titular;
    private double saldo;
    private String iban;
}
