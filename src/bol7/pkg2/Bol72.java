
package bol7.pkg2;

/**
 *
 * @author Pablite5
 */
public class Bol72 {

   
    public static void main(String[] args) {
        short num1,num2;
        SumaResta obx= new SumaResta();
        num1= obx.pedirNumero1();
        num2= obx.pedirNumero2();
        obx.comparaNum(num1, num2);
    }
    
}
