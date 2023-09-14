# Foodics

Prerequisites
Java Development Kit (JDK) installed.
Maven installed.
Web browser (Chrome/Firefox) installed.
IDE (Eclipse/IntelliJ) installed.

Dependencies
TestNG
Selenium WebDriver
Cucumber
Gherkin
rest assured

How to Run
Clone this repository to your local machine.

Open the project in your preferred IDE.

Install the required dependencies using Maven.

Locate the TestRunner class in the src/test/java directory.

Right-click on TestRunner and select "Run as TestNG Suite".

Scenario 1: Perform a Google Search
 user navigate to google
     user types in google search bar "<data1>"
     user removes the typed word
     user types a new word 
     user clicks submit
     user verifies that number of results exist on UI
     user scroll to the bottom of the page
     user verifies that people also search for is displayed
     user verifies that the results of people also search for are different from the searched word 
     user verifies that more results button is displayed and clickable

     scenario 2
     Testing apis using rest assured 

