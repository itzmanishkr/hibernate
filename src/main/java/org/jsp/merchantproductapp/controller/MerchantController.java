package org.jsp.merchantproductapp.controller;

import java.util.Scanner;

import org.jsp.merchantproductapp.dao.MerchantDao;
import org.jsp.merchantproductapp.dto.Merchant;

public class MerchantController {

	public static void main(String[] args) {
		MerchantDao merchantDao = new MerchantDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Save Merchantt");
		System.out.println("2. Update Merchant");
		System.out.println("3. Find Merchant By Id");
		System.out.println("4. Verify Merchant By Phone and Password");
		System.out.println("5. Verify Merchant by Email and password");

		
		
		switch(sc.nextInt()) {

		case 1: {
			Merchant merchant = new Merchant();
			System.out.println("Enter the name, phone,email, gst_number, password");
			merchant.setName(sc.next());
			merchant.setPhone(sc.nextLong());
			merchant.setEmail(sc.next());
			merchant.setGst_number(sc.next());
			merchant.setPassword(sc.next());
			merchant = merchantDao.saveMerchant(merchant);
			System.out.println("Merchant saved with id: " + merchant.getId());
			break;

		}
		case 2: {

		}
		
		case 3: {

		}
		
		case 4: {

		}
		
		case 5: {

		}
		
		default: System.out.println("Invalid Choice");
		}
	}
}
