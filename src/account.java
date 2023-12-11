/*
 *	Author: Linyi Dai
 *  This class is fully tested and ready to use.
 * 
 *  This class is used to deal with the information of pets the user created.
 *  When initialized, it reads the information from the files and store them in the static variables.
 * 	So, the developer should always initialize this class when the user logs in.
 *  
 * 
 * 	Public methods:
 * 	login(accountentered, passwordentered) is used to check if the username and password entered by the user are correct.
 * 	If the username does not exist, it will  create a new account automatically.
 * 
 *  setInfo(gender, name) is used to set the information of the pet when the user creates a new pet.
 *  It will automatically sync with the files, and always append the new information to the end of the file.
 * 	
 *  death() is used to delete the information of the pet and the user when the pet dies.
 *  It is a static method, so no need to initialize an account object to call this method.
 * 
 *  saveToFile() is used to sync changes to static variables with the files (should be done when logout)
 * 	It is a static method, so no need to initialize an account object to call this method.
 * 
 *  Private methods:
 * setAccount(accountentered) is used to set the username of a new account
 * setPassword(passwordentered) is used to set the password of a new account
 * 
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class account {
	public static Integer accountnumber = 0;
	public static ArrayList<String> password = new ArrayList<String>();
	// sync with password.txt
	public static ArrayList<String> username = new ArrayList<String>();
	// sync with account.txt
	public static ArrayList<Boolean> genderlst = new ArrayList<Boolean>();
	// sync with gender.txt
	public static ArrayList<String> namelst = new ArrayList<String>();
	// sync with name.txt


	/*
	 * This constructor is used to read the information from the files and store them in the static variables.
	 * Should alwaysbe called when the user tries to log in.
	 * 
	 * @param void
	 * 
	 * @return void
	 */
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
		try (BufferedReader reader = new BufferedReader(new FileReader("gender.txt"))) {
			String sex;
			while ((sex = reader.readLine()) != null) {
				if (sex.equals("male")) {
					genderlst.add(true);
				} else if (sex.equals("female")) {
					genderlst.add(false);
				}
			}
		} catch (IOException e) {
			System.err.println("Error reading from the file: " + e.getMessage());
		}
		try (BufferedReader reader = new BufferedReader(new FileReader("gender.txt"))) {
			String n;
			while ((n = reader.readLine()) != null) {
				namelst.add(n);
			}
		} catch (IOException e) {
			System.err.println("Error reading from the file: " + e.getMessage());
		}

	}
	/*
	 * This private method is used to set the username of a new account
	 * @param accountentered is the username entered by the user
	 * 
	 * @return true if the username is not used by other accounts
	 * @return false if the username is used by other accounts
	 */
	private boolean setAccount(String accountentered) {
		if (username.contains(accountentered)) {
			return false; // txt里有用户名的时候return false
		} else {
			// add the new username to username
			username.add(accountentered);

			// sync with account.txt
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("account.txt", true))) {
				writer.write(accountentered);
				writer.newLine();
			} catch (IOException e) {
				System.err.println("Error writing to the file: " + e.getMessage());
			}

			return true;
		}
	}

	/*
	 * This private method is used to set the password of a new account
	 * 
	 * @param passwordentered is the password entered by the user
	 * 
	 * @return void
	 */
	private void setPassword(String passwordentered) {
		password.add(passwordentered); // add the new password to password

		// sync with password.txt
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("password.txt", true))) {
			writer.write(passwordentered);
			writer.newLine();
		} catch (IOException e) {
			System.err.println("Error writing to the file: " + e.getMessage());
		}
	}

	/*
	 * This method is used to check if the username and password entered by the user
	 * are correct. If the username does not exist, it will go to the setup page,
	 * and create a new account automatically.
	 * 
	 * @param accountentered is the username entered by the user
	 * @param passwordentered is the password entered by the user
	 * 
	 * @return accountnumber if the username and password are correct
	 * @return -1 if the password is incorrect
	 * @return -2 if user does not exist
	 */
	public Integer login(String accountentered, String passwordentered) {
		// System.out.println(username);
		// System.out.println(password);
		if (username.contains(accountentered)) { // if account exists
			accountnumber = username.indexOf(accountentered); // we get accountnumber
			if (password.get(accountnumber).equals(passwordentered)) { // if password is correct
				return accountnumber; // go to mainGUI (accountnumber >= 0)
			} else {
				return -1; // print 账号密码错误
			}
		} else {
			setAccount(accountentered);
			setPassword(passwordentered);
			return -2; // go to setup page (GenderGUI)
		}
	}

	public void setInfo(boolean gender, String name) {
		// Sync with gender.txt
		if (gender == true) {
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("gender.txt", true))) {
				writer.write("male");
				writer.newLine();
			} catch (IOException e) {
				System.err.println("Error writing to the file: " + e.getMessage());
			}
			genderlst.add(true);
		} else {
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("gender.txt", true))) {
				writer.write("female");
				writer.newLine();
			} catch (IOException e) {
				System.err.println("Error writing to the file: " + e.getMessage());
			}
			genderlst.add(false);
		}

		// Sync with name.txt
		try (BufferedWriter n = new BufferedWriter(new FileWriter("name.txt", true))) {
			n.write(name);
			n.newLine();
		} catch (IOException e) {
			System.err.println("Error writing to the file: " + e.getMessage());
		}
		namelst.add(name);

	}

	public static void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("gender.txt"))) {
            for (var c : genderlst) {
				if (c == null) {
                    continue;
                }
                if (c == true) {
                    writer.write("male");
                    writer.newLine();
                } else if (c == false) {
                    writer.write("female");
                    writer.newLine();
                } 
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("name.txt"))) {
            for (var c : namelst) {
                if (c == null) {
                    continue;
                }
                writer.write(c);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }

		try(BufferedWriter writer = new BufferedWriter(new FileWriter("account.txt"))) {
			for (var c : username) {
				if (c == null) {
					continue;
				}
				writer.write(c);
				writer.newLine();
			}
		} catch (IOException e) {
			System.err.println("Error reading from the file: " + e.getMessage());
		}

		try(BufferedWriter writer = new BufferedWriter(new FileWriter("password.txt"))) {
			for (var c : password) {
				if (c == null) {
					continue;
				}
				writer.write(c);
				writer.newLine();
			}
		} catch (IOException e) {
			System.err.println("Error reading from the file: " + e.getMessage());
		}
	}

	/*
	 * This method is used to delete the information of the pet and the user when the pet dies.
	 * 
	 * @param void
	 * 
	 * @return void
	 */
	public static void death() {
        genderlst.set(account.accountnumber, null);
        namelst.set(account.accountnumber, null);
		username.set(account.accountnumber, null);
		password.set(account.accountnumber, null);
		saveToFile();
    }

	public static void main(String[] args) {
		account a = new account();
		System.out.println(a.login("linyi", "123456"));
		a.setInfo(true, "linyi's dog");
		// System.out.println(a.login("linyi", "123456"));
		account.death();
		System.out.println(a.login("kevin", "314159"));
		a.setInfo(true, "kevin's dog");
		// a.saveToFile();
	}
}
