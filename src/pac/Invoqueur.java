package pac;

import java.util.HashMap;
import java.util.Map;

public class Invoqueur {
	
	private Map<String, Command> commandes= new HashMap<String, Command>();
	
	public void addNewCommand(String ref, Command cmd) {
		commandes.put(ref, cmd);	
	}
	
	public void invoquer(String ref) {
		Command cmd = commandes.get(ref);
		if(cmd!=null) {
			cmd.executer();
		}
	}
	

} 
