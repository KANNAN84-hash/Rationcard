package rationcard;

import java.util.ArrayList;

public class RationCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionRemovalAlterationDisplay.initialMembers();
	
		String name ="R.Revathy";
		AdditionRemovalAlterationDisplay.addMember(name);
	
		String name1="Mrs.Santhi";
	    AdditionRemovalAlterationDisplay.removeMember(name1);
	
		String name2="Mrs.Santhi";
		String name3="Mrs.Shanthi";
		AdditionRemovalAlterationDisplay.nameChange(name2,name3);
	//	AdditionRemovalAlterationDisplay.displayMembers();
		String name4 = "R.Revathy";
		boolean result=AdditionRemovalAlterationDisplay.namePresent(name4);
        System.out.println(result);
		
	}

}
