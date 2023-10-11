interface Bicycle{

     final int a = 45;       
     void applyBreak(int decrement);     
     void speedUp(int increment);         
}

interface HornBicycle{
       int b  = 54;
       void blowHornK3g();
       void blowHornmhn();

}
class AvonCycle implements Bicycle , HornBicycle{   
     void blowHorn(){
         System.out.println("Pee Pee Poo Poo");
     }
     @Override
     public void applyBreak(int decrement){
         System.out.println("Applying Break ");
     }
     @Override
     public void speedUp(int increment){
         System.out.println("Applying SpeedUp");
     }

     public void blowHornK3g(){
         System.out.println("Kabhi Khushi kabhi gum pee pee pee pee");
     }
     public void blowHornmhn(){
         System.out.println("Main hoon naa po po po po ");
     }
}
public class AbstractClassVsInterface {

    public static void main(String[] args) {
         AvonCycle cycleMeeran = new AvonCycle();
         cycleMeeran.applyBreak(1);
         System.out.println(cycleMeeran.a);
             cycleMeeran.blowHornK3g();
             cycleMeeran.blowHornmhn();

    }

}
