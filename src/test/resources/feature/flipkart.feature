@Flipkart
Feature: Flipkart home page

  Scenario: Flipkart moblile order validation test
  
 Given Open flipkart browser 
 When escape key is pressed
 Then flipkart home page should be loaded and validated
 When user searches mobile in search bar and hit enter
 Then list of given mobile phones should appear
 When user clicks first searched result link
 Then searched mobile should appear with details
 And mobile details should be captured for validation
 When delivery details is entered and item added to cart
 Then mobile details should be validated and compared with previous data
 And screen is closed if the mobile details matches
 
    
  
