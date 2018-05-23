package debeir.luca;

public class Coordinate {
	
	private String coord;
	private boolean touched;
	

	public String getCoord() {
		return coord;
	}
	public void setCoord(String coord) {
		this.coord = coord;
	}
	public boolean isTouched() {
		return touched;
	}
	public void setTouched(boolean touched) {
		this.touched = touched;
	}
	
	
	/**
	 * @param coord
	 * @param touched
	 */
	public Coordinate(String coord, boolean touched) {
		this.coord = coord;
		this.touched = touched;
	}
	
	/**
	 * @param x
	 * @return boolean
	 */
	public boolean validCoordinate() {
		boolean res1 = false;
		boolean res2 = true;
		boolean resultat = false;
		for(char i = 'A'; i <= 'J'; i++) {
			for(int j = 1; j <= 10; j++) {
				String mot1 = Character.toString(i);
				String mot2 = Integer.toString(j);
				String mot = mot1 + mot2;
				if(this.getCoord().equals(mot)) {
					res1 = true;
				}
			}
		}
		if (this.getCoord().equals(null)) {
			res2 = false;
		}
		if (res1 == true && res2 == true) {
			resultat = true;
		}
		return resultat;
	}
	

}
