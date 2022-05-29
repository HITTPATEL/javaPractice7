package day7Q2;

public class DayScholar extends Student {
	double transportFee;
	
	@Override
	public double payFee() {
		return transportFee+examFee;
	}
	public DayScholar(int studId, String studName, double examFee, double transportFee) {
		super(studId, studName, examFee);
		this.transportFee = transportFee;
	}
	
	
}
