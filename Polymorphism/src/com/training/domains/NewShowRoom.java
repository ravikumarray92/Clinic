package com.training.domains;
import com.training.ifaces.Automobiles;

public class NewShowRoom extends ShowRoom  {
	    @Override
	    public Automobiles getItem(int key){
	    if(key == 4)
	    {
		    return new SportsBike();
		}
	    else 
		return super.getItem(key);
	    }
}
