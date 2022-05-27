 
```
This is the project of Java, Selenium, JBehave . 
```
## Technology Used
```
  1. Java
  2. Selenium
  3. JBehave
  5. Maven
```	
## Installation/Setup
```
To run this project, you need to have java >= 1.7, maven installed on your machine
```	
## Run Tests
```
1. Go to Story file 
2. Then modify Run Configurations
3. Put the configs 
4. Now run the story file 

```
## Detailed explanation on Automation Framework

### Framework type: Page Object Model flavored with JBehave
```
```

### Project Structure
```
pageObjects:-
Contains locators of objects involved in pages of website
stepDefinitions:-
This package has all the step definitions. Currently have single step def file containing both API and UI steps
```
```
stories:-
This package has all .feature files which represents different test scenarios written in Gherkin Language(plain english).
```
```
drivers:-
This package contains the chrome driver. Currently, these scripts are running on chrome of windows. If you want to execute on chrome of Mac then you need to add the chrome driver for mac in this folder
```
```
pom.xml:-
It contains all the dependencies required to run this project
```

### Report
```

```
# How story works
1. When a story file is running it picks the base URL from the config we put 
2. And the steps in story file finds the matching in step definition 
3. When same step found in step definitions, the code start executing 
4. The data which is to be used in URL after the base URL is mention in project which is parameterized  
```

  


