

public class homework2 {
     class Animal{
         public void height(){

         }
        public void coloring(){
         System.out.println("animal class");
        }
    }
    class Dog extends Animal{
         public void coloring (){
             super.coloring();
             System.out.println("dog class");
         }
    }
    class Labrador extends Dog{

    }
}
