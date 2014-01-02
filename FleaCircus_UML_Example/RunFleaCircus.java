   /**
   	This class will create two <code>Cat</code>s 
   	and some <code>Flea</code>s to illustrate 
   	what UML looks like, and how it is implemented
   	in Java.
   	
   	@author Paul Walter
   	@see Animal
   	@see Cat
   	@see Flea
   	@see IAnimal
   	@see Life
   */
   public class RunFleaCircus
   {
   	/**
   		Since this class doesn't keep any object references,
   		the relationships here are Dependency. 
   	*/
      public static void main(String [] args)
      {
      // create the cats
         Cat catFluffy = new Cat("Fluffy");
         Cat catMarshal = new Cat("Marshal");
      
      // create the fleas
         Flea fleaJerry = new Flea("Jerry");
         Flea fleaKendra = new Flea("Kendra");
         Flea fleaRandall = new Flea("Randall");
      
      // add fleas to the cats
         catFluffy.addFlea(fleaJerry);
         catFluffy.addFlea(fleaKendra);
         catFluffy.addFlea(fleaRandall);
         catMarshal.addFlea(fleaJerry);
      
      // See what the state of the cat's are
      	
         System.out.println(catFluffy.toString());
         System.out.println("\n" + catMarshal.toString());
            
      // Comment on the Composition vs. Association
         System.out.println("\nNotice that both Cats have Jerry in common as a flea. This is illustrating what Association is: that an object can be associated with one or more other objects. There is hardly any difference between Association and Aggregation, the only difference is that Aggregation implies that it's parts make up a whole.");
         System.out.println("\nNotice that each Cat has a heart that will end when the cat ends: illustrating what Composition is: When an object is part of a whole, and when the whole ends, it ends.");
      
      
      }
   }