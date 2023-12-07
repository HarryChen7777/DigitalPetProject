public class index {
	public static String name = "";
	public static boolean login = false;
	public static boolean death = false;
    public static boolean changing(int addhunger, int addmood){
    	int accountnum = account.accountnumber;
    	 Thread decreaseThread = new Thread(() -> {
         while(findex.findexlst.get(accountnum)>0 && hindex.hindexlst.get(accountnum)>0) {
        	 findex.findexlst.set(accountnum, findex.findexlst.get(accountnum)-1); 
        	 hindex.hindexlst.set(accountnum, hindex.hindexlst.get(accountnum)-1); 
        	 //decrease by one
        	 try {
				Thread.sleep(1000);
				//for every second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
         }
    	 });
    	 if(findex.findexlst.get(accountnum)==0 || hindex.hindexlst.get(accountnum)==0) {
    		 death = true;
    	 }
         Thread increaseThread = new Thread(() -> {
             while(findex.findexlst.get(accountnum)<100 && hindex.hindexlst.get(accountnum)<100) {
            	 if(findex.findexlst.get(accountnum)+addhunger<100) {
            	 findex.findexlst.set(accountnum, findex.findexlst.get(accountnum)+addhunger); 
            	 }else {
            		 findex.findexlst.set(accountnum, 100); 
            	 }
            	 if(hindex.hindexlst.get(accountnum)+addmood<100) {
            		 hindex.hindexlst.set(accountnum, hindex.hindexlst.get(accountnum)+addhunger); 
                	 }else {
                		 hindex.hindexlst.set(accountnum, 100); 
                	 } 
            	 //increased by button
            	 try {
    				Thread.sleep(5000);
    				//for every five second
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
             }
    });
    	  decreaseThread.start();
    	  increaseThread.start();
 
    return death;
}
}

