
# **ReqRes API Automation Project**

## **Overview**
This project demonstrates API automation testing for the ReqRes API: (https://reqres.in/), focusing on user creation functionality. It is implemented using **RestAssured** and follows best practices like the Page Object Model (POM) design pattern, externalized test data, and comprehensive reporting with **Allure**.

---

## **Features**
1. **POST Request**:
   - Automates user creation with JSON data.
   - Validates the response status code and body.
2. **Externalized Test Data**:
   - Test data is stored in a JSON file for maintainability.
3. **Modular Architecture**:
   - Clean project structure using POM.
4. **Reporting**:
   - Test execution results are available in **Allure reports**.
5. **Scalability**:
   - Designed to easily extend with additional API test cases.

---

## **Tools and Frameworks**
- **Programming Language**: Java
- **Build Tool**: Maven
- **API Testing Library**: RestAssured
- **Testing Framework**: TestNG
- **JSON Handling**: Jackson Databind
- **Reporting Tool**: Allure

---

## **Project Structure**
plaintext
src
├── main
│   └── java
├── test
    └── java
        ├── api
        │   ├── models
        │   │   └── User.java
        │   ├── utils
        │   │   └── Config.java
        │   └── tests
        │       ├── UserCreationTest.java
        │       ├── GetUserTest.java
        │       ├── UpdateUserTest.java
        │       └── DeleteUserTest.java
        └── resources
            └── user.json


---

## **How to Run**
### **Pre-requisites**
1. Install **Java 17** or later.
2. Install **Maven**.
3. Install **Allure Commandline** for generating reports:
   bash
   npm install -g allure-commandline --save-dev
   

### **Steps**
1. Clone the repository:
   bash
   git clone https://github.com/ahmedgamal-dev/reqres-api-automation.git
   
2. Navigate to the project directory:
   bash
   cd reqres-api-automation
   
3. Run the tests using Maven:
   bash
   mvn clean test
   
4. Generate and view Allure reports:
   bash
   allure serve allure-results
  

---

## **Test Scenarios**
### **1. User Creation**
- **Endpoint**: 'POST /users'
- **Input**:
  - Name: 'John Doe'
  - Job: 'Software Engineer'
- **Validations**:
  - Status Code: '201'
  - Response Body:
    - 'id': Must not be null.
    - 'name': Matches input.
    - 'job': Matches input.

### **2. Additional Test Cases** (Optional)
- **Get User Details**: 'GET /users/{id}'
- **Update User Details**: 'PUT /users/{id}'
- **Delete User**: 'DELETE /users/{id}'

---

## **Key Files**
### **1. Test Data**
- 'src/test/resources/user.json': Contains input data for user creation.
### **2. Configuration**
- 'api/utils/Config.java': Centralized configuration for Base URI.
### **3. Tests**
- 'api/tests/UserCreationTest.java': Automates user creation.
- Additional tests for 'GET', 'PUT', and 'DELETE'.

---

## **Reporting**
The project uses **Allure** for test reporting. After running the tests, generate a detailed interactive report:
bash
allure serve allure-results

---

## **Repository Link**
Find the source code and documentation here:
GitHub Repository: (https://github.com/ahmedgamal-dev/reqres-api-automation)

---

## **Author**
- **Name**: Ahmed Gamal
- **Email**: ahmedgamal19190@gmail.com
- **GitHub**: https://github.com/ahmedgamal-dev/reqres-api-automation
