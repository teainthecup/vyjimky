package vyjimky;

public class Ctverec {

	private int strana;
	
	public Ctverec(int strana) {
		this.strana = strana;
	}
	
	public Ctverec() {
		this.strana = 5;
	}
	
	public boolean setStrana(int strana) {
		if(strana <= 0) {
			return false;
		}
		this.strana = strana;
		return true;
	}
	
	/*public void setStrana(int strana) throws Exception{
		if(strana <= 0) {
			throw new Exception("Strana ètverce musí bıt kladná.");
		}
		this.strana = strana;
	}
	*/

	public int getStrana() {
		return strana;
	}

	@Override
	public String toString() {
		return "Ctverec [strana=" + strana + "]";
	}
	
	
}
