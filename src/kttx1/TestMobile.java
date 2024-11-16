/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kttx1;

/**
 *
 * @author 84363
 */


   import java.util.List;

public class TestMobile {

	public static void main(String[] args) {
		// số phần tử
		int n = 1 + (int) (Math.random() * 6);

		MobileManagerImpl mmi = new MobileManagerImpl(n);
		System.out.println("List: ");
		System.out.println("---------------------------------");
		mmi.generateList(n);
		mmi.printList();

		Mobile m = new Mobile(7, "Sony", 7777777, 7, "BlueSky", 7.7);
		
		// add
		if (mmi.addMobile(m)) {
			System.out.println("\nAdd successful! List after add:");
			System.out.println("---------------------------------");
			mmi.printList();
		} 
		else {
			System.out.println("------Add fail--------");
		}

		// edit
		Mobile m1 = new Mobile(7, "Sony", 7000000, 7, "BlueSky", 7.7);
		if (mmi.editMobile(m1)) {
			System.out.println("\nEdit successful! List after edit:");
			System.out.println("---------------------------------");
			mmi.printList();
		} 
		else {
			System.out.println("------Edit fail--------");
		}

		// delete
		if (mmi.delMobile(m)) {
			System.out.println("\nDelete successful! List after delete:");
			System.out.println("---------------------------------");
			mmi.printList();
		} 
		else {
			System.out.println("------Delete fail--------");
		}

		// search
		System.out.println("\nMobile list has name is \"Iphone\": ");
		System.out.println("---------------------------------");
		List<Mobile> results = mmi.searchMobile("Iphone");
		for (Mobile mobile : results) {
			System.out.println(mobile);
		}

		// sort tang dan
		mmi.sortedMobile(0);
		System.out.println("\nList after sort price: ");
		System.out.println("---------------------------------");
		mmi.printList();
	}

}
    

