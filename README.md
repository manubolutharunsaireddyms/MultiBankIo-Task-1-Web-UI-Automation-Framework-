# MultiBankIo-Task-1-Web-UI-Automation-Framework-

The MultiBankIo Web Application has been automated using Java and Selenium with the TestNG framework. This automation framework is designed to support cross-browser testing, parallel execution, and HTML report generation for test results.
This framework provides a robust, maintainable, and scalable solution for automating the MultiBankIo web application, ensuring high-quality software delivery through structured test automation.

1. Base Class
   TestNGBase.java contains reusable functions, including launching a desired browser (Chrome, Edge, or Firefox) and other common utilities that are shared across all test classes.

2. Test Classes
   NavigationTests.java – Validates the top navigation menu and links.
   TradingTest.java – Validates the structure and functionality of the trading spot grid.
   ContentTests.java – Validates the Download section links, Marketing banners, and About Us content.

3. Page Object Model (POM) Classes
   Page classes store web elements and corresponding methods for each web page, following the Page Object Model design pattern.

4. Utilities (Utils)
   Contains common utility functions that can be reused across test classes.

5. Reports
   Manages HTML report generation, providing detailed test execution results.

6. Drivers
   Contains the browser drivers for Chrome, Edge, and Firefox.

please look the below framework structure
   <img width="2558" height="1599" alt="image" src="https://github.com/user-attachments/assets/84017d5a-e316-47e9-b643-ba10f69cb3e0" />


7. Test Reports
   HTML reports are generated for each test execution, providing a comprehensive overview of results.

   <img width="2558" height="1466" alt="image" src="https://github.com/user-attachments/assets/a38d0823-3de1-4493-b7c6-3da4c5282bb2" />

   <img width="2558" height="1366" alt="image" src="https://github.com/user-attachments/assets/3a0cd6d2-4c78-49ef-b9e9-c9908675358a" />

8. Test Data
   Stores test data in properties files for easy maintenance and reusability.

9. TestNG XML Suites
   TestNG XML files are used to combine tests, classes, and packages to execute them together as a suite.


