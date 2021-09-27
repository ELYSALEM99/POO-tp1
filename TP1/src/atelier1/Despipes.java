package atelier1;

public class Despipes extends De {
	private int nb;

	public Despipes(int nb) {
		super();
		this.nb = nb;
	}
	public int lancerpipes() {
		int valSup=0;
		do {
			valSup=this.lancer();	
		}while(valSup<=nb);
		return valSup;
	}

}
