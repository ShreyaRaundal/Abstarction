# Abstarction
![Image](https://github.com/user-attachments/assets/383f7d69-bfdb-48e6-828a-77e40e1eee4c)

abstracted program?
🔸 Code Scenario: payment system. Users can pay by Credit Card, UPI, or PayPal.

 implement this interface?
🔸 Code Scenario:You have a Shape interface with an area() method.

Abstract Class?
🔸 Code Scenario:You want every employee to log() their login, but each one has different salary rules.

 Fix with Abstraction:
❌ Bad (tightly coupled):
Circle c = new Circle();
System.out.println(c.area());

✅ Good (abstracted):
Shape s = new Circle(); // can change to Rectangle easily
System.out.println(s.area());
