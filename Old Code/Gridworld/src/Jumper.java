import info.gridworld.actor.Actor; 
import info.gridworld.actor.Flower; 
import info.gridworld.actor.Rock; 
import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location; 
import java.awt.Color;

public class Jumper extends Actor{
	public Jumper(){ 
	    setColor(Color.RED); 
	  } 
	 
	  public Jumper(Color JumperColor){ 
	    setColor(JumperColor); 
	  } 
	  
	  public void act(){ 
	    if (canJump()){ 
	      jump(); 
	    }
	    else 
	      turn(); 
	  } 
	  
	  
	  public void turn() 
	  { 
	    setDirection(getDirection() + Location.HALF_RIGHT); 
	  }
	
	  public boolean canJump(){ 
		    Grid<Actor> gr = getGrid(); 
		    if (gr == null) 
		      return false; 
		    Location l1 = getLocation(); 
		    Location l2 = l1.getAdjacentLocation(getDirection()); 
		    if (!gr.isValid(l2)) 
		      return false; 
		    Actor neighbor = gr.get(l2); 
		    if (!((neighbor == null) || (neighbor instanceof Flower) || (neighbor instanceof Rock))) 
		      return false; 
		    Location l3 = l2.getAdjacentLocation(getDirection());  
		    if (!gr.isValid(l3)) 
		      return false;   
		    neighbor = gr.get(l3); 
		    return (neighbor == null) || (neighbor instanceof Flower);       
		  } 
	  
	  
	  public void jump(){ 
	    Grid<Actor> gr = getGrid(); 
	    if (gr == null) 
	      return; 
	    Location l1 = getLocation(); 
	    Location l2 = l1.getAdjacentLocation(getDirection()); 
	    Location l3 = l2.getAdjacentLocation(getDirection()); 
	    if (gr.isValid(l3)) 
	      moveTo(l3); 
	    else 
	      turn(); 
	  } 
	  
	  
}
	
	
	

