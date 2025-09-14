CapstoneProject_5 - Eclipse Ready
================================

What is included:
- Maven project configured for Selenium + TestNG + Cucumber.
- Page Object Model under src/main/java/com/capstone/pages
- Base class under src/main/java/com/capstone/base
- Step Definitions under src/test/java/com/capstone/stepdefs
- Cucumber feature under src/test/resources/features
- TestNG runner (Cucumber TestNG) under src/test/java/com/capstone/runner
- testng.xml to execute the Cucumber runner
- .gitignore and instructions to create branch CapstoneProject_5

How to import into Eclipse:
1. File -> Import -> Existing Maven Projects -> Select this project's root folder.
2. Wait for Maven to download dependencies (Maven -> Update Project if needed).
3. To run tests: Right-click testng.xml -> Run As -> TestNG Suite
   OR run `mvn clean test` from the project root.

Git:
- Create branch: git checkout -b CapstoneProject_5
- Commit and push branch to your remote.

Notes:
- Uses WebDriverManager to manage ChromeDriver automatically.
- Make sure you have Chrome installed. Adjust browser in BaseTest if you prefer Firefox.
