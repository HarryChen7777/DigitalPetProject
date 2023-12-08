import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class account {
	public static Integer accountnumber = 0;
	public static ArrayList<String> password = new ArrayList<String>();
	// password[i] stores the password of i-th account
	// public static ArrayList<Boolean> firsttime = new ArrayList<Boolean>();
	// firsttime[i] stores if i-th account is newly created
	public static ArrayList<String> username = new ArrayList<String>();
	// username[i] stores the username of i-th account

	public account() {
		// read from local files
		try (BufferedReader accountReader = new BufferedReader(new FileReader("account.txt"))) {
			String account;
			while ((account = accountReader.readLine()) != null) {
				username.add(account);
			}
		} catch (IOException e) {
			System.err.println("Error reading from the file: " + e.getMessage());
		}

		try (BufferedReader passwdReader = new BufferedReader(new FileReader("password.txt"))) {
			String pwd;
			while ((pwd = passwdReader.readLine()) != null) {
				password.add(pwd);
			}
		} catch (IOException e) {
			System.err.println("Error reading from the file: " + e.getMessage());
		}
	}
	/*
	 * This method is used to set the username of a new account
	 * 
	 * @param accountentered is the username entered by the user
	 * 
	 * @return true if the username is not used by other accounts
	 * 
	 * @return false if the username is used by other accounts
	 */
	public boolean setAccount(String accountentered) {
		if (username.contains(accountentered)) {
			return false; // txt里有用户名的时候return false
		} else {
			// add the new username to username
			username.add(accountentered);

			// sync with account.txt
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("account.txt"))) {
				writer.write(accountentered);
				writer.newLine();
			} catch (IOException e) {
				System.err.println("Error writing to the file: " + e.getMessage());
			}

			return true;
		}
	}

	/*
	 * This method is used to set the password of a new account
	 * 
	 * @param passwordentered is the password entered by the user
	 * 
	 * @return void
	 */
	public void setPassword(String passwordentered) {
		password.add(passwordentered); // add the new password to password

		// sync with password.txt
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("password.txt"))) {
			writer.write(passwordentered);
			writer.newLine();
		} catch (IOException e) {
			System.err.println("Error writing to the file: " + e.getMessage());
		}
	}

	/*
	 * This method is used to check if the username and password entered by the user
	 * are correct
	 * 
	 */
	public Integer login(String accountentered, String passwordentered) {
		// System.out.println(username);
		// System.out.println(password);
		if (username.contains(accountentered)) { // if account exists
			accountnumber = username.indexOf(accountentered); // we get accountnumber
			if (password.get(accountnumber).equals(passwordentered)) { // if password is correct
				return 2; // go to mainGUI
			} else {
				return 3; // print 账号密码错误
			}
		} else {
			return 1; // go to setup page (GenderGUI)
		}
	}
}
