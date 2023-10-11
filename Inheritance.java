class Animal {
   public   String name_Of_Animal;
   public  String speak;

      public void nature(){
          System.out.println("Find Animals , Their Properties & ability.");
      }
      public String name_Animal(String name){
             name_Of_Animal = name;
             return name_Of_Animal;
      }
      public String animal_Speak(String animal_Speak){
              speak = animal_Speak;
              return  speak;
      }

}


class Lion extends Animal{
        public void ability(){
            System.out.printf("\tA lion's roar is the loudest of any big cat and can be heard up to 8 km away.");
        }
}
class Dog extends Animal{
      public void ability(){
          System.out.printf("\tAdvanced memory skills, and are able to read and react appropriately to human body language such as gesturing and pointing, and to understand human voice commands. ");
      }
}

class Cat extends Animal{
       public void ability(){
           System.out.printf("\tGood at detecting movement in low light, have an acute sense of hearing and smell, and their sense of touch is enhanced by long whiskers that protrude from their heads and bodies. ");
       }
}
public class Inheritance {
    public static void main(String[] args) {
//           Object of Animal class
            Animal n = new Animal();
                n.nature();

//          Object of Lion class and it excess Animal class properties.
            Lion  l = new Lion();
        System.out.println(l.name_Animal("Lion"));
        System.out.println(l.animal_Speak("roar"));
            l.ability();
//          Object of Dog class and it excess Animal class properties.
        /*    Dog   d = new Dog();
        System.out.println(d.name_Animal("Dog"));
        System.out.println(d.animal_Speak("woof"));
            d.ability();
        */

//         Object of Cat class and it excess Animal class properties.
        /*    Cat   c = new Cat();
        System.out.println(c.name_Animal("cat"));
        System.out.println(c.animal_Speak("meows"));
            c.ability();
        */
    }
}



