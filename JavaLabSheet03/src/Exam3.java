import javax.swing.*;
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weigth = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weigth"));
		double heigth = Double.parseDouble(
				JOptionPane.showInputDialog("Input heigth"));
		heigth = heigth/100;
		double bmi = weigth/(heigth * heigth);
		String bmiCategory;
		if(bmi <18.5) bmiCategory="Underweigth";
		else if(bmi>18 && bmi<25) bmiCategory="Normal-weigth";
		else if(bmi>25 && bmi<30) bmiCategory="Overweigth";
		else bmiCategory = "Obesity";
		JOptionPane.showMessageDialog(null, "BMI ="+String.format("%.1f",bmi)+//จัดรูปแบบด้วยภาษาC
				"\nYou're "+bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
	}

}
