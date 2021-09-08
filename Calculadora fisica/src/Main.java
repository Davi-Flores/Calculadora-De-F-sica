
public class Main {
	
	public static void main(String[] args) {
	    ForcaPeso fp = new ForcaPeso();

	    fp.setValues();
	    fp.getResult();

	    ForcaCentripeda fc = new ForcaCentripeda();
	    fc.setValues();
	    fc.getResult();
	    
	    Impulso imp = new Impulso();
	    imp.setValues();
	    imp.getResult();
	    
	    ForcaElastica fe = new ForcaElastica();
	    fe.setValues();
	    fe.getResult();
	    
	    MRU mru = new MRU();
	    mru.setValues();
	    mru.getResult();
	    
	    MRUV mruv = new MRUV();
	    mruv.setValues();
	    mruv.getResult();
	}

}
