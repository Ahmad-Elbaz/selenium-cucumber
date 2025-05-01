#This Java test automation uses Cucumber for Behavior-Driven Development (BDD)

Test scenarios are written in a *feature* file using *Gherkin* language, which describes the expected behavior in plain English.
Each step in the feature file is linked to a Java step definition, which contains the actual test code ( using *Selenium* to interact with the UI). A Test Runner executes the tests and generates reports.
This setup makes tests easy to read, reusable, and maintainable by separating test logic from test data and behavior.
