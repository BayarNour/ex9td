package ex9td;

public class MotDict {
	 private String mot;
	    private String defini;

	    public MotDict(String mot, String defini) {
	        this.mot = mot;
	        this.defini = defini;
	    }

	    public String getMot() {
	        return mot;
	    }

	    public String getDefini() {
	        return defini;
	    }

	    public void setDefini(String defini) {
	        this.defini = defini;
	    }

	    public void setMot(String mot) {
	        this.mot = mot;
	    }

	    public boolean synonyme(String m) {
	        return mot.equals(m);
	    }

	    public boolean synonyme(MotDict mo) {
	        return mot.equals(mo.getMot());
	    }


}
