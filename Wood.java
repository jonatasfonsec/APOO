package Cap01;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
	MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
	
	public String toString(){
		switch(this){
		case INDIAN_ROSEWOOD: return "Indian Rosewood";
		case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
		case MAHOGANY: return "";
		case MAPLE: return "";
		case COCOBOLO: return "";
		case CEDAR: return "";
		case ADIRONDACK: return "";
		case ALDER: return "";
		case SITKA: return "";
		default: return "";
		}
	}
}
