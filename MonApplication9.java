public class MonApplication9{

	public static void main (String arg[]) {
		System.out.println("bienvenue dans mon application de gestion ressources humaines");
		
		String employe1="Yves";
		
		int salaire1;
		
		ServicePaye1 servicePaye2;
		
		servicePaye2 = new ServicePaye();		
		
		salaire1 = ServicePaye1.calculerSalaire (employe1);
		
		System.out.print1n (employe1 + " a un salaire de " + salaire1);
	}
}	
		
		