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

7. Test Reports
   HTML reports are generated for each test execution, providing a comprehensive overview of results.

   <img width="2550" height="1336" alt="image" src="https://github.com/user-attachments/assets/af6f2d44-4f3d-4523-9b76-7ae818f2a944" />

   <img width="2559" height="1389" alt="image" src="https://github.com/user-attachments/assets/256e43e2-7e27-4f24-872c-de231217635b" />

8. Test Data
   Stores test data in properties files for easy maintenance and reusability.

9. TestNG XML Suites
   TestNG XML files are used to combine tests, classes, and packages to execute them together as a suite.

   Framework Structure

   <img width="2556" height="1462" alt="image" src="https://github.com/user-attachments/assets/bb4ea7f3-a7b7-4de4-942c-f1673d335ec0" />



