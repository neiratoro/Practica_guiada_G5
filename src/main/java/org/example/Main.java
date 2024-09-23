package org.example;


import org.example.AYUDAS.Licor;
import org.example.MODELOS.Cliente;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // crear objetos 4
        // 2 vacios
        // 2 llenos

        //objeto          //llamar constructor
        Licor  licorUno = new Licor();
        Licor  licorDos= new Licor("011", "aguardiente", 3000000.0, LocalDate.of(2024,10,31), 29.0);

        Cliente clienteUno = new Cliente("ELY", "104016092", 35, "CLL65S # 42-14","3148455872");
        Cliente clienteDos = new Cliente();

                //accediendo a los atributos
        System.out.println(licorUno.getIdentificacion());
        System.out.println(licorDos.getIdentificacion());

        }
    }
