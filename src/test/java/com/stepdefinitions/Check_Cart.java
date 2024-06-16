package com.stepdefinitions;

import static org.testng.Assert.assertEquals;

import com.utilities.Util;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Check_Cart {

    public Util Util;
    String cartitem;
    String quntycheckincart;
    int quantity;
public Check_Cart(Util Util) {
			this.Util = Util;
		
		}
	
	@When("User adds searched item into the cart (.+)$")
	public void user_adds_searched_item_into_the_cart_thrice(int it) {
	  
		quantity=Util.pg.searchforprod1().additemtocart(it);
		
	}
	@Then("User should see the added item thrice on the cart popup")
	public void user_should_see_the_added_item_thrice_on_the_cart_popup() {
	  Util.pg.cart().clickcart();
	  cartitem =Util.pg.cart().checkitem();
	  quntycheckincart= Util.pg.cart().quantitycheck();
	  System.out.println(quntycheckincart);
	  System.out.println(cartitem);
	  assertEquals(cartitem, Util.homepageprod);
	  
	 int ij=Integer.valueOf(quntycheckincart);
	 System.out.println(ij);	
	 assertEquals(ij, quantity);
}
	
	
}
