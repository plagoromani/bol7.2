/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol7.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class SumaResta {
    public short pedirNumero1(){
        return(Short.parseShort(JOptionPane.showInputDialog("teclea primer numero")));
}
    public short pedirNumero2(){
        return(Short.parseShort(JOptionPane.showInputDialog("teclea segundo numero")));
    }
    public void comparaNum(short num1, short num2){
        if (num1>=num2){
            System.out.println("resta"+ (num1-num2));
        }
       
         System.out.println("suma"+ (num1+num2));
    
    }
    
}