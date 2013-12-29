package Cap01;

public enum Type {
	ACOUSTIC,ELECTRIC;
	
	public String toString(){
		switch (this){
		case ACOUSTIC: return "Acoustic";
		case ELECTRIC: return "Eletric";
	    default:       return "Unspecified";
		}
	}
}
