package day7Q2;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class Hosteller extends Student {
	double hostelFee;
	
	@Override
	public double payFee() {
		
		return hostelFee+examFee;
	}
	public Hosteller(int studId, String studName, double examFee, double hostelFee) {
		super(studId, studName, examFee);
		this.hostelFee = hostelFee;
	}

}
