package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


	public class countSheep {
		public static int number;

		public void count(int number) {
			for (int i = 1; i <= number; i++) {
				System.out.print(i + " Sheep...");
			}
		}
	}


