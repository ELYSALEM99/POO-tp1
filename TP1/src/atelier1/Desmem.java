package atelier1;

public class Desmem extends De {
	private static int nbmem=0;

	public Desmem() {
		super();
	}
	public int desmemoi() {
		int test;
		test=this.lancer();
		while(test==nbmem)
			test=this.lancer();
		nbmem=test;
		return test;
	}
}

