import java.util.ArrayList;
import java.util.List;

public class account {
	  public static Integer accountnumber = 0;
	  public static ArrayList<String>  password= new ArrayList<String>();
	  public static ArrayList<Boolean>  firsttime = new ArrayList<Boolean>();
	  public static ArrayList<String> accountnums = new ArrayList<String>();
	  public boolean setAccount(String accountentered){
		  if(accountnums.contains(accountentered)){
			  return false;
		  }else {
			  accountnums.add(accountentered);
			  firsttime.add(true);
			  return true;
		  }//前端写一个while loop， true就继续， false就print有这个账户了
	  }
	  public void setPassword(String passwordentered){
		  password.add(passwordentered);
	    }//这个不在乎重复 不能为空 
	  public static Integer login(String accountentered,String passwordentered){
		  if(password.contains(passwordentered) && accountnums.contains(accountentered)) {
			   accountnumber = accountnums.indexOf(accountentered);
			   if(firsttime.get(accountnumber)) {
				   return 1; //去选性别
			   }else if(firsttime.get(accountnumber)==false) {
				   return 2; //去mainGUI
			   }}else {
				   return 3; //print 账号密码错误
			   }
		return null;
	    }
}
