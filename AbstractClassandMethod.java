abstract class Parent1{
    public Parent1 (){
        System.out.println(" Mai Parent1 class ka constructor hoon.");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child1 extends Parent1{
   @Override
   public void greet(){
        System.out.println("Good morning");
    }
   
}
abstract class Child3 extends Parent1{
      public void th(){
          System.out.println("I am good ");
      }
}
public class AbstractClassandMethod {
   public static void main(String[] args) {
         Child1  obj = new Child1();
            // System.out.println(obj.);
   }
}

