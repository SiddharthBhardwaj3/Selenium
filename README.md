# Description
```
This is the project of Java, Selenium, JBehave. 
```
## Tools/Technology Used
```
  1. Java
  2. Selenium
  3. JBehave
  4. Maven
  5. Intellij
```	
## Installation/Setup
```
To run this project, you need to have java >= 1.7, maven installed on your machine
```	
## Run Tests
```
1. Go to src/test/java > stories > AnyStory.java
2. Then modify Run Configurations
3. Put the configs 
4. Now run the story file 
```
## Detailed explanation on Automation Framework

### Framework type: Page Object Model flavoured with JBehave

### Project Structure
```
External Libraries:-
This package has all the step definitions along with the other dependencies required to run the project. 
```
```
src/test/java > stories:- 
This contains the classes having exact name as stories. 
```
```
resources > stories:-
This package has all .story files which represents different test scenarios written in Gherkin Language(plain English).
```
```
pom.xml:-
It contains all the dependencies required to run this project
```
### Report
```
Reports are present in target folder.
```
# How story works
```
1. When a story file is running it picks the base URL from the configurations, we pass from intellij.
2. The steps in story file matches the same steps in java class file present in .jar under external libraries folder .
3. When same step is found, it executes the code written under that step.
```
