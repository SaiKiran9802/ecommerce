Feature: Seacrh for product
@cart
Scenario Outline: Check for the product matching

 Given User is on landing page 
 When User Search for the product <Name>
 And User adds searched item into the cart <numberofsameitems> 
 Then User should see the added item thrice on the cart popup

 Examples:
 
 |Name|numberofsameitems|
 |bro|3|
 #|cuc|9|
 #|beetroot|10|
 