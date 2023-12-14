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
	    }
}
