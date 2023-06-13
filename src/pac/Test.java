package pac;

public class Test {

	public static void main(String[] args) {
		
		RecepteurImpl1 recepteur1= new RecepteurImpl1();
		RecepteurImpl2 recepteur2= new RecepteurImpl2();
		
		Command cmd1 = new CommandA(recepteur1);
		Command cmd2 = new CommandB(recepteur1);
		Command cmd3 = new CommandC(recepteur2);
		
		Invoqueur telecommande= new Invoqueur();
		
		telecommande.addNewCommand("A", cmd1);
		telecommande.addNewCommand("B", cmd2);
		telecommande.addNewCommand("C", cmd3);
		
		
		telecommande.invoquer("A");
		telecommande.invoquer("B");
		telecommande.invoquer("C");
		telecommande.invoquer("D");


		

		
	}

}
