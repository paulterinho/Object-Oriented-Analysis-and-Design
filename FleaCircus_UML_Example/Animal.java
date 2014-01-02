   
   /**
   	Animal represents a creature with a name. 
   	
		@author Paul Walter
		@see IAnimal
   */
   public abstract class Animal implements IAnimal
   {
      private String name = "no name";
   	
   	/**
   		Constructor that allows a name to be passed in.
   		
   		@param name The name of this beastie.
   	*/
      public Animal(String name)
      {
         this.name = name;
      }
   	
   	/**
   		Returns this animal's given name.
   		
   		@return This animal's name.
   	*/
      public String getName()
      {
         return name;
      }
   
   	/**
   		This method produces a <code>String</code> 
   		representation of the sound that this animal 
   		likes to make. 
   		
   		@return This animal's favorite sound.
   	*/
      public abstract String getNoise();
      
   
   }
