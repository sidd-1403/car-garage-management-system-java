# 🚗 Car Garage Management System
 
A simple Java console-based application built using **Object-Oriented Programming (OOP)** concepts. The system allows customers to select car services and generates an automated bill.
 
---
 
## 📋 Features
 
- Add customer details (Name, Car Number, Car Type)
- Display all available car services with prices
- Select multiple services interactively
- Auto-calculate total bill
- Exception handling for invalid service selection
- Simple and user-friendly console interface
---
 
## 🛠️ Services Available
 
| Service ID | Service Name   | Price  |
|------------|----------------|--------|
| 1          | Oil Change     | ₹500   |
| 2          | Car Wash       | ₹300   |
| 3          | Brake Check    | ₹150   |
| 4          | Coolant Change | ₹200   |
| 5          | Full Service   | ₹1000  |
 
---
 
## 💻 Technologies Used
 
- **Java**
- **OOP** (Class, Object, Encapsulation)
- Arrays & Boolean array mapping
- Exception Handling
- **IDE:** IntelliJ IDEA
---
 
## 📁 Project Structure
 
```
CarGarageSystem/
│
├── App.java            # Main entry point
├── Customer.java       # Customer details (name, car number, car type)
├── Service.java        # Service model (ID, name, price)
└── BillCalculator.java # Bill generation logic
```
 
---
 
## ▶️ How to Run
 
1. Open the project in **IntelliJ IDEA** or any Java IDE
2. Run `App.java`
3. Enter customer details when prompted
4. Select services by entering their Service ID
5. Enter `0` to generate the final bill
---
 
## 🖥️ Sample Output
 
```
Enter customer name: Siddhesh
Enter car number: MH10AB1234
Enter car type: SUV
 
-------- Available Services --------
1. Oil Change      : ₹500
2. Car Wash        : ₹300
3. Brake Check     : ₹150
4. Coolant Change  : ₹200
5. Full Service    : ₹1000
Press 0 to generate bill
 
Select Service ID: 1
✔ Service Added: Oil Change
 
Remaining Services:
2. Car Wash        : ₹300
3. Brake Check     : ₹150
4. Coolant Change  : ₹200
5. Full Service    : ₹1000
Press 0 to generate bill
 
Select Service ID: 3
✔ Service Added: Brake Check
 
Remaining Services:
2. Car Wash        : ₹300
4. Coolant Change  : ₹200
5. Full Service    : ₹1000
Press 0 to generate bill
 
Select Service ID: 0
 
------------ FINAL BILL ------------
Customer Name  : Siddhesh
Car Number     : MH10AB1234
Car Type       : SUV
 
Services Availed:
  • Oil Change   : ₹500
  • Brake Check  : ₹150
 
Total Amount   : ₹650
------------------------------------
Thank You! Visit Again 🚗
```
 
---
 
## 📚 Concepts Demonstrated
 
- Object-Oriented Programming (OOP)
- Array of Objects
- Boolean array tracking logic
- Loops and Conditional Statements
- Method Calls and Encapsulation
- Exception Handling
- Basic multi-class project structure
---
 
## 👤 Author
 
**Siddhesh**  
B.E. Computer Science Engineering
