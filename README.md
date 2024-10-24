Project Title: Data-Driven Login Automation with Selenium and Java
Overview
This project is a Data-Driven Automation Testing framework for a login functionality using Selenium with Java. The project is built using a Hybrid Framework and is designed to automate the login process by reading test data from an Excel file. It includes features for generating reports, capturing screenshots on test failures, logging activities, and supports parallel and cross-browser execution.

Technologies and Tools
Java
Maven
Selenium
Hybrid Framework
TestNG
Apache POI (for Excel data handling)
Project Features
Data-Driven Testing: Uses data from an Excel file to drive the login tests.
Immediate Report Generation: Generates detailed test execution reports immediately after tests are run.
Logging: Creates log files in the log folder to track the execution process and outcomes.
Screenshot Capture: Automatically captures screenshots if a test fails, aiding in debugging.
Parallel and Cross-Browser Execution: Supports running tests on multiple browsers simultaneously.
Remote Execution: Tests can be executed remotely using Selenium Grid.
Jenkins Integration: Can be integrated with Jenkins for continuous integration and continuous deployment (CI/CD).
Batch File Execution: Provides a .bat file for easy test execution via Maven.
Project Structure
src/main/java: Contains the main Java code for the framework.
src/test/java: Contains the test cases and test classes.
resources: Includes the Excel data file and other resources.
logs: Directory where log files are stored.
screenshots: Directory where screenshots are stored if a test fails.
pom.xml: Maven Project Object Model file for managing dependencies.
master.xml: TestNG master suite file for running tests.
info.properties: Configuration file for specifying the execution environment.
Ways to Run the Project
Using pom.xml File:

Navigate to the project directory and run:
bash
Copy code
mvn clean test
Using master.xml File:

Execute the tests using TestNG:
bash
Copy code
mvn clean test -DsuiteXmlFile=master.xml
Parallel or Cross Browser Execution:

Configure browsers in the TestNG XML file and run as described above.
Remote Execution with Selenium Grid:

Set execution_env=remote in the info.properties file.
Start the Selenium Grid Hub and Nodes.
Run the tests using Maven:
bash
Copy code
mvn clean test
Using Jenkins:

Configure a Jenkins job to pull the latest code from the repository.
Add a build step to run the Maven commands to execute the tests.
Using the Provided Batch File:

Ensure Maven is installed and set in the system PATH.
Execute the batch file:
bash
Copy code
./run-tests.bat
Conclusion
This Data-Driven Login Automation project leverages Selenium with Java to provide a robust testing framework capable of handling various execution environments. The project facilitates easy report generation, logging, screenshot capture, and supports multiple ways to execute tests, making it highly versatile and useful for continuous integration and testing efforts.

Happy Testing!
