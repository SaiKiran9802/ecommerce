Feature: Seacrh for product

Scenario Outline: Check for the product matching

 Given User is on landing page 
 When User Search for the product <Name>
 And User seacrh for <Name> from Topdeatils
 Then The searched products from homescreen and topdetails screen should be the same

 Examples:
 
 |Name|
 |Tom|
 |Beet|