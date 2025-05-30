# Selenium Test Automation for DemoWebShop

## 📌 Project Overview
This project aims to automate the test cases for the DemoWebShop application using **Selenium WebDriver**, **Java**, and **JUnit**. The test scenarios are designed based on the **user stories** provided in the documentation.

## 🔧 Technologies Used
- **Java** (Test Automation Language)
- **Selenium WebDriver** (Browser Automation)
- **JUnit** (Test Framework)
- **Maven** (Dependency Management)
- **IntelliJ IDEA** (IDE)
- **GitHub** (Version Control)

## 📜 User Stories Covered
The following user stories are automated:
1. **User Registration**
2. **Negative Registration Scenarios**
3. **Login & Logout**
4. **Negative Login Scenarios**
5. **Ordering Products**
6. **Survey Response**
7. **Coupon & Gift Card Validation**
8. **Order History Download**

## 📂 Project Structure
```
📦 DemoWebShop
 ┣ 📂 src
 ┃ ┣ 📂 US_201
 ┃ ┃ ┣ 📝 US_201_TC_01.java
 ┃ ┣ 📂US_202
 ┃ ┃ ┣ 📝US_202_TC_01.java
 ┃ ┣ 📂US_203
 ┃ ┃ ┣ 📝US_203_TC_01.java
 ┃ ┣ 📂US_204
 ┃ ┃ ┣ 📝US_204_TC_01.java
 ┃ ┣ 📂US_205
 ┃ ┃ ┣ 📝US_205_TC_01.java
 ┃ ┣ 📂US_206
 ┃ ┃ ┣ 📝US_206_TC_01.java
 ┃ ┣ 📂US_207
 ┃ ┃ ┣ 📝US_207_TC_01.java
 ┃ ┣ 📂US_208
 ┃ ┃ ┣ 📝US_208_TC_01.java
 ┃ ┣ 📂US_209
 ┃ ┃ ┣ 📝US_209_TC_01.java
 ┃ ┣ 📂 Utility
 ┃ ┃ ┣ 📝 BaseDriver.java
 ┃ ┃ ┗ 📝 MyFunc.java
 ┣ 📜 pom.xml (Maven dependencies)
 ┣ 📜 junit.xml (JUnit Configuration)
 ┗ 📜 README.md (Project Documentation)
```

## 🚀 Installation & Setup
1. **Clone the Repository:**
   ```sh
   git clone **(https://github.com/AtillaTorosAvci/DemoWebShop.git)**
   ```
2. **Open the Project in IntelliJ IDEA.**
3. **Install Dependencies:**
   ```sh
   mvn clean install
   ```
4. **Run Tests Using JUnit:**
   ```sh
   mvn test
   ```

## 🧪 Running the Tests
- Run test cases individually in IntelliJ IDEA.
- Alternatively, execute tests using the Maven command:
  ```sh
  mvn test
  ```

## 📄 Reporting
- Test execution results are stored in the `test-output` folder.
- HTML reports can be accessed under `test-output/index.html`.

## 🛠 Configuration
Modify the `config.properties` file to set the required parameters such as:
```
baseURL = https://demowebshop.tricentis.com/
browser = Chrome
username = atillapractice@hotmail.com
password = GreenCard123
```

## 🏗️ Future Improvements
- Implement CI/CD pipeline with **GitHub Actions**.
- Enhance reporting with **Extent Reports**.
- Add **Page Object Model (POM)** for better maintainability.

## 📌 Contributors
| Name                                                         | Role             |
|--------------------------------------------------------------|------------------|
- **[Atilla Toros Avcı](https://github.com/AtillaTorosAvci)**  | Software Tester  |
- **[Barış Saydam](https://github.com/BarisSaydam)**           | Software Tester  |
- **[Erdem Özkan](https://github.com/ErdemOzkann)**            | Software Tester  |
- **[Ömer Boncuk](https://github.com/palanque92)**             | Software Tester  |
- **[Diyar ölmez](https://github.com/diyarolmezz)**            | Software Tester  |
- **[Ebubekir Duvarcı](https://github.com/Ebubekir2025)**      | Software Tester  |
- **[Gamze Batmaz](https://github.com/GAMZE3845/)**            | Software Tester  |
---

**📌 Note:** This project is for educational and testing purposes only.
