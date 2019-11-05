/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Pilas {

    public static void main(String[] args) {
        int res,a;
        int pila[] = new int[10];
        Pila objPilaEnteros = new Pila(pila);
        
        do {
            res = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona una opción\n"
                    + "1)Push\n"
                    + "2)Pop\n"
                    + "3)Cima\n"
                    + "4)Fondo\n"
                    + "5)Mostrar pila\n"
                    + "6)Salir","Alerta!!"));
            switch (res) {
                case 1:
                    a=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un valor"));
                    objPilaEnteros.insertar(a);
                    break;
                case 2:
                    objPilaEnteros.retirar();
                    break;
                case 3:
                    objPilaEnteros.cima();
                    break;
                case 4:
                    objPilaEnteros.fondo();
                    break;
                case 5:
                    objPilaEnteros.mostrarPila();
                    break;
                case 6:
                    System.exit(0);
                    break;
                    default:JOptionPane.showMessageDialog(null,"Opción no válida");
                    
            }
        } while (res !=6);
        
        //agregamos (operacion push) elementos a la pila de datos.
        //el fondo de la pila seria 90 y la cima 12
//        objPilaEnteros.insertar(90);
//        objPilaEnteros.insertar(56);
//        objPilaEnteros.insertar(23);
//        objPilaEnteros.insertar(12);
        //mostramos los elementos dentro de la pila
//        objPilaEnteros.mostrarPila();

        //traer fondo
        
        //traer cima
        
        //eliminemos la cima de la pila
        
        //mostramos nuevamente la pila para comprobar qu
        

    }

}
