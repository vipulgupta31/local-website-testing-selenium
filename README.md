# Local Website Testing

## What is Local Website Testing
Local website testing is the process of testing a website on a developer's machine using automated functional tests. These test scripts can be designed to be integrated with the CI/CD pipeline and executed for each local deployment. This saves time and resources by identifying issues at an early stage, shortening the feedback cycle and thus increasing the ROI on development and testing.


## About Project
It is created using Selenium with Java, TestNG and Maven for Web-based automation.

This is the list of tools, being used in this framework:
1. Apache Maven
2. Java 8
3. Selenium Cloud Grid - [LambdaTest](https://www.lambdatest.com) Platform
4. TestNG Framework

## Steps for Local Execution
1. Import this project in Eclipse/IntelliJ as “Existing Maven Project”
2. Go to TestPageLoadStrategy.java and Run test case for your desired page load strategy
3. You can see the logs coming up on Console as your execution progresses.
4. Since we are using RemoteWebDriver and executing on Cloud Grid platform, LambdaTest, you can login to same and view detailed logs on dashboard.
