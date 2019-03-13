package trabajo.martes;
import javax.swing.*;
public class calculadora 
{
    public static void main(String[] args) 
    {
        int a,b;
        double n1,n2,d; 
        char c;        
        a= class_2.sw();              
        switch (a)
        {
            case 1:
                n1=class_2.PNu();
                n2=class_2.PNu();
                c=class_2.POp();
                d=operac.ALG(n1,n2,c);
                JOptionPane.showMessageDialog(null,"EL RESULTADO ES: "+d); 
                break;                                                      
            case 2:
                n1=class_2.PNu();
                b=class_2.POpT();
                d=operac.TRIG(n1,b);
                JOptionPane.showMessageDialog(null,"EL RESULTADO ES: "+d); 
                break;   
            default:
               JOptionPane.showMessageDialog(null,"ESTA OPCION NO ES POSIBLE");      
            }                 
    }
    
}