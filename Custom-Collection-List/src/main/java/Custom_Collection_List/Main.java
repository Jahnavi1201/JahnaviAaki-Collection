package Custom_Collection_List;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main extends CustomCollectionList{
	public static void main(String args[]) {
		Scanner input_obj=new Scanner(System.in);
		Logger log=LogManager.getLogger(Main.class);
		CustomCollectionList obj=new CustomCollectionList();
		int index,ele;
		boolean flag=true;
		log.info("**Welcome to our application***");
		while(flag) {
			log.info("Which of the following operations do you want to perform on the list:");
			log.info("1.Fetch\n2.Add\n3.Remove\n4.Display\n5.Exit\nEnter your choice of operation");
			int choice=input_obj.nextInt();
			switch(choice) {
			case 1:
				log.info("Enter the index at which the element is to be retrieved");
				index=input_obj.nextInt();
				if(index>=array_list.size())
					log.info("The index you have entered is out of bound.Try Again!!");
				else
					log.info("The element at index "+index+" is "+obj.fetchElement(index));
				break;
			case 2:
				log.info("Enter the element to be added to the list:");
				ele=input_obj.nextInt();
				obj.addElement(ele);
				break;
			case 3:
				log.info("Enter the index at which the element is to removed from the list:");
				index=input_obj.nextInt();
				if(index<array_list.size()) {
					log.info("Element at given index is successfully removed from the list");
					obj.removeElement(index);
				}
				else
				  log.info("The index that you have entered is nout of boundary.So,try again!!");
				break;
			case 4:
				obj.display();
				break;
			case 5:
				log.info("***Thanks for using our application");
				flag=false;
			default:
				log.info("Invalid Choice..Try Again!!!");
			}
		}
		input_obj.close();
}
}

