   import java.util.*;
   
	/**
		Cat represents an Animal whom we can add <code>Flea</code>'s to. 
		
		<p>List of <code>Fleas</code> is an example of Association: 
   		
   		
   		<ol>
   			<li>Fleas can exist independenly of the cat, 
   				 and also be associated with other cats.</li>
   			
   			<li>Fleas can have a reference to the cats they
   				enjoy (circular reference). </li>
				
				<li>The only difference between Association and 
					Aggregation is that Aggregtation impiles that
					the sub object is part of the host object; both
					Aggregation and Association are implemented the
					same way. </li>

					
				<li>In UML it's symbol is a staight line. If it doesn't
					have an arrowhead, it is a bi-directional relationship
					if it does, it is only a one-way relationship with the
					arrowhead pointing to which object is the part.</li>
   		</ol>
   		
     	</p>
		
		
		
		
		<p>The nineLives attribute of type <code>Life</code>, which is being created in the Constructor, is an example of Composition: 
   		
   		
   		<ol>
   			<li>It's creation and destruction depends on the cat (in this case it is created in the constructor.)</li>  
   			
				<li>In UML it's symbol is the black diamond. If it doesn't
					have an arrowhead (and a black diamond), 
					it is a bi-directional relationship if it does, it is 
					only a one-way relationship with the
					arrowhead pointing to which object is the part.</li> 
   		</ol>
   		
     	</p>

		
		@author Paul Walter
		@see Flea
		@see CatLife
	*/
   public class Cat extends Animal
   {
      private List<Flea> fleas;
      
   	// NOTE: 	You can see in the constructor below that 
   	// 			the nine lives are being instantiated when 
   	//				the cat is instantiated: Composition.
   	
      private CatLife [] nineLives= new CatLife[9];
   
      public Cat(String name)
      {
         super(name);
         
      	// create the cat's nine lives!
         nineLives[0] = new CatLife();
         nineLives[1] = new CatLife();
         nineLives[2] = new CatLife();
         nineLives[3] = new CatLife();
         nineLives[4] = new CatLife();
         nineLives[5] = new CatLife();
         nineLives[6] = new CatLife();
         nineLives[7] = new CatLife();
         nineLives[8] = new CatLife();
         
      	// make some space for the fleas that will arrive. 
         fleas = new ArrayList<Flea>();
      }
   
   	/**
   		This method will create a cat noise.
   		
   		@return This will return a "meow" String.
   	*/
      public String getNoise()
      {
         return "meow";
      }
   
   	/**
   		This method allows fleas to be added to our cat.
   		
   		@param flea Is the flea we wish to add to this cat. 
   	*/
      public void addFlea(Flea flea)
      {
         fleas.add(flea);
      }
      
   	/**
   		{@inheritDoc}
   	*/
      public String toString()
      {
         StringBuffer st = new StringBuffer();
         st.append(getName());
         st.append(" says: ");
         st.append(getNoise());
         st.append(",\nit's has this many lives: ");
         st.append(nineLives.length);
         st.append(",\nand has the following fleas: ");
         for(Flea flea:fleas)
         {
            st.append("\n\t");
            st.append(flea.toString());
         }
            
         return st.toString();
      
      }
   }