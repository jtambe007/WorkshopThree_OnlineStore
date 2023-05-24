package com.jt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
//  Load the store's inventory into your application.
//  Have a cart to track the items a customer wants to purchase.
//  Allow customers to add items to the cart
//  If a customer wants to purchase the same item twice, you can just add
//  and display the item twice on the cart page

//  The Store Home Screen should display a list of
//  options that a user can choose from.
//  Show Products * Show Cart * Exit
// Show Products - Displays a list of products that your store sells. The
//  user can enter the product id to add it to the cart, or type "X" to go
//  back to the home screen
//  If a product id was selected, then you should add the product to
//  the cart and then display the home screen again

//  Show Cart - This displays a list of line items that the customer has
//  added to their cart. It should also display the total amount of the cart. A
//  customer can choose from the following options
//  o C - to Check Out
//  o X - to go back to the home screen

//  Check Out - Here you should display the total amount owed for this
//  order and prompt the user for payment.
//  o Assume that the user will pay in cash
//  o When the customer enters their payment amount, verify that
//  they have paid enough to cover the cost of the items
//  - If the customer did not add enough money, return the full
//  amount back to the customer
//  - If the customer added enough money for the sale,
//• calculate the change that is owed to the customer and
//  display the calculated change
//• print the list of items that was sold to the customer
//• clear the shopping cart
//• go back to the home screen