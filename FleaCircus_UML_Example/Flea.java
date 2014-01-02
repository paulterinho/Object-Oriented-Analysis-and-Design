   /**
   	A <code>Flea</code> is an <code>Animal</code> that can 
   	be associated with many different <code>Cat</code>s.
		
		@author Paul Walter
		@see Cat

   */
   public class Flea extends Animal
   {
   	
   	/**
   		Constructor: Allows us to pass in a name.
   		
   		@param name The name of this flea.
   	*/
      public Flea(String name)
      {
         super(name);
      }
   
   	/**
   		{@inheritDoc}
   	*/      
      public String toString()
      {
         StringBuffer st = new StringBuffer();
         st.append("Flea( name='");
         st.append(getName());
         st.append("')");
         return st.toString();
      }
      
      public String getNoise()
      {
      	// Fleas do not make sounds we can hear.
         return "";
      }
   
   }