# WorkshopThree_OnlineStore
This project is a simple command line application that simulates a store front for users to shop from.
## Requirements
Given data stored in a separate file called inventory.txt,
- Create a Product class
  - Getters
  - Setters
  - Constructors
  - Methods
  - Properties
    - `int id`
    - `String name`
    - `float price`
- Create a cart to track the items that a customer wants to purchase.
  - Allow customers to add items to the cart.
  - Show duplicates in cart.
### Screens
#### The Store Home screen
- The home screen should display a list of options that a user can choose from:
  - Show Products
  - Show Cart
  - Exit
#### Show Products
- This screen should display a list of products that your store sells.
  - Products can be added using an int called `productID`.
  - Return or exit to home screen.
#### Show Cart
- This screen displays a list of line items that the customer has added to their cart.
- Go to check out (C) or Cancel order and return to home screen (X).
#### Check Out
- This screen should display the total ampunt owed for this order and prompt the user for payment.
  - Assume the user will pay in cash.
  - Verify that the customer has paid to cover the cost of the items. 
     - If the customer did not add enough money for the sale, return the full amount.
     - If the customer added enough money for the sale, provide change if needed and print a receipt.
  - Return to home screen. 
