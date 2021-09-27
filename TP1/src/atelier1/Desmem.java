package atelier1;

public class Desmem extends De {
	private  int nbmem=0;

	public Desmem() {
		super();
	}
	
	public int getNbmem() {
		return nbmem;
	}

	public void setNbmem(int nbmem) {
		this.nbmem = nbmem;
	}

	public int desmemoi() {
		int test;
		test=this.lancer();
		while(test==this.getNbmem())
			test=this.lancer();
		this.setNbmem(test);
		return test;
	}
}

