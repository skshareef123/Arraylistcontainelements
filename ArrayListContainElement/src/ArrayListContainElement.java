import java.util.*;
public class ArrayListContainElement {

	public static void main(String[] args) {
		   ArrayList<Integer> al = new ArrayList<Integer>();
	        // add elements to ArrayList object
	        al.add(3);
	        al.add(17);
	        al.add(6);
	        al.add(9);
	        al.add(7);
	        // check if ArrayList contains element
	        if (al.contains(6)) {
	            System.out.println("7 was found in the list");
	        } else {
	            System.out.println("7 was not found in the list");
	        }
	    }

	}


