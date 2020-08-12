package _05_Enum_Stuff;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	public static void myHoroscope(Zodiac sign) {
		switch (sign) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "You are an Aries");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "You are a Taurus");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "You are a Gemini");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "You are a Cancer... oof");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "You are a Leo");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "You are Virgo");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "You are a Libra");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "You are a Scorpio");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "You are a Sagittarius");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "You are a Capricorn");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "You are an Aquarius");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "You are a Pisces");
			break;
		}
	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		String[] options = { "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius",
				"Capricorn", "Aquarius", "Pisces" };

		Zodiac[] signs = { Zodiac.ARIES, Zodiac.TAURUS, Zodiac.GEMINI, Zodiac.CANCER, Zodiac.LEO, Zodiac.VIRGO,
				Zodiac.LIBRA, Zodiac.SCORPIO, Zodiac.SAGITTARIUS, Zodiac.CAPRICORN, Zodiac.AQUARIUS, Zodiac.PISCES };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		Zodiac choice = signs[input];
		
		myHoroscope(choice);
	}
}
