import java.io.IOException;

public class ATMInterface {

	public static void main(String[] args) throws IOException {
		Details Details = new Details();
		introduction();
		Details.mainMenu();
	}

	public static void introduction() {
		System.out.println("Welcome to the ATM Interface!");
	}
}