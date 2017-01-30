package main;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args){
			OwnList<String> testList = new OwnList<>();
			
			System.out.println("Adding new elements...");
			testList.addEntry("111");
			testList.addEntry("222");
			testList.addEntry("333");
			System.out.println("Done. Number of elements: " + testList.count() + "\n");
			
			System.out.println("Printing list...");
			for(String s : testList){
				System.out.println(s);
			}
			System.out.println("Done\n");
			
			System.out.println("Printing list with toString() method...");
			System.out.println(testList.toString());
			System.out.println("Done\n");
			
			System.out.println("Printing list using own iterator...");
			Iterator<String> it1 = testList.iterator();
			while(it1.hasNext()){
				System.out.println(it1.next());
			}
			System.out.println("Done\n");
			
			System.out.println("Reverting list...");
			testList.revertList();
			System.out.println("Done\n");
			
			System.out.println("Printing reverted list...");
			Iterator<String> it2 = testList.iterator();
			while(it2.hasNext()){
				System.out.println(it2.next());
			}
			System.out.println("Done\n");
			
			System.out.println("Removing first element...");
			testList.removeEntry(0);
			System.out.println("Done. Number of elements: " + testList.count() + "\n");
			
			System.out.println("Printing list...");
			System.out.println(testList.toString());
			System.out.println("Done\n");
			
			System.out.println("Removing last element...");
			testList.removeEntry(testList.count()-1);
			System.out.println("Done. Number of elements: " + testList.count() + "\n");
			
			System.out.println("Printing list...");
			System.out.println(testList.toString());
			System.out.println("Done\n");
			
			System.out.println("Removing all elements...");
			int count = testList.count();
			for(int i = 0; i < count; i++){
				testList.removeEntry(0);
			}
			System.out.println("Done. Number of elements: " + testList.count() + "\n");

			String[] str = {"a| bA11A1\\c/d?e<f>g,h.i%g", "a1c2b", "fff", "ffd", ""};
			SortedSet<OwnList<String>> testSet = task3Method(str);
			
			for(OwnList<String> s: testSet){
				System.out.println(s.toString());
			}
			
	}

	/**
	 * Creates SortedSet from OwnList<String> lists that are created
	 * from splitting each specified string.
	 * @param stringList Array of strings
	 * @return SortedSet collections of OwnLists
	 */
	public static SortedSet<OwnList<String>> task3Method(String[] stringList){
		SortedSet<OwnList<String>> resultSet= new TreeSet<>();
		for(String s: stringList){
			OwnList<String> tempList = new OwnList<>();
			for(String tempS : s.split("[^A-Za-z]")){
				if(!tempS.equals("")){
					tempList.addEntry(tempS);
				}
			}
			resultSet.add(tempList);
		}
		return resultSet;
	}
}
