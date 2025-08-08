Feature: passing data functionalities

Scenario: Passing data from feature file

Given launch the browser and load the url
When  enter the username as bhuvanesh.moorthy@testleaf.com
When  enter the password as Leaf@2025
And   Click the App Launcher Icon next to Setup 
And   click Select Accounts 
Then  Search for the account using your unique account name 
And   Click the dropdown icon next to the account and select Edit 
And   Set Type to Technology Partner 
And   Set Industry to Healthcare 
When  Enter the Billing Address as Leaf Street
When  Enter the Shipping Address  as LeafTower chennai
And   Set Customer Priority to Low 
And   Set SLA to Silver 
And   Set Active to NO
When  Enter a unique number in the Phone field as 13579
And   Set Upsell Opportunity to No 
And   Click Save and verify the phone number 