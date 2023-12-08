import java.util.ArrayList;
import java.util.List;

public class info {
	public static boolean gender = false;
    public static ArrayList<Boolean>  genderlst= new ArrayList<Boolean>();
    public static ArrayList<String> namelst = new ArrayList<String>();
	  public static void setInfo(boolean gender, String name){
	    	if(gender ==true) {
	        genderlst.add(true);
	    	}else {
	    		 genderlst.add(false);
	    	}
	    	namelst.add(name);
//	    	if(account.firsttime.get(account.accountnumber)==true) {
//	        	findex.findexlst.add(100);
//	        	hindex.hindexlst.add(100);
//	        }
	    }
	  //选性别，名字加arrayList，设置好账号在ArrayList里面的index, 用accounr.
}
