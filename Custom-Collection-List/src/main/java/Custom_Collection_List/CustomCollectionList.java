package Custom_Collection_List;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CustomCollectionList {
       static ArrayList<Integer> array_list=new ArrayList<Integer>();
       Logger log=LogManager.getLogger(CustomCollectionList.class);
       CustomCollectionList(){
    	   for(int i=1;i<=10;i++)
    		   array_list.add(i);
       }
       public void display() {
    	   log.info("Our list is "+array_list);
       }
       public void removeElement(int ele) {
    	   array_list.remove(ele);
       }
       public int fetchElement(int index) {
    	   return array_list.get(index);
       }
       public void addElement(int ele) {
    	   array_list.add(ele);
       }
}
