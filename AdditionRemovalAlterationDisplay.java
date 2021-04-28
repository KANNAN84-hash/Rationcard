package rationcard;

import java.util.ArrayList;

public class AdditionRemovalAlterationDisplay {
	static ArrayList<String> familymembers = new ArrayList<String>();
	/**
	 * Initial input of names to familymembers list
	 */
	public static void initialMembers()
	{
		familymembers.add("Mr.Rajendran");
		familymembers.add("Mrs.Santhi");
		familymembers.add("R.Vinoth Kumar");
	//	System.out.println(familymembers);
		
	}
	/**
	 * here the new member is added 
	 * @param name the member to add
	 */
	public static void addMember(String name)
	{
		familymembers.add(name);
		
		
	}
	/**
	 * here the exist member is removed
	 * @param name the member to be removed
	 */
	public static void removeMember(String name)
	{
		int index =familymembers.indexOf(name);
		if (index != -1)
		{
			familymembers.remove(index);
		}
	
	}  
	/**
	 * exist  name gets updated to the new name
	 * @param name1 exist name
	 * @param name2 new name to update
	 */
	public static void nameChange(String name1,String name2)
	{
		int index = familymembers.indexOf(name1);
		if (index !=-1)
		{
			familymembers.set(index, name2);
		}
	}
	/**
	 * It checks whether the particular member is Present
	 * @param name to be checked
	 */
	public static boolean namePresent(String name)
	{
		boolean exist=false;
		int index=familymembers.indexOf(name);
		if (index !=0)
		{
			exist = true;
		}
		return exist;
	   
	}
	/**
	 * Display all the members in the list
	 */
	public static void displayMembers()
	{
		System.out.println(familymembers);
	}

}
