package Calculator;


import java.util.Scanner;

public class Calculator {
 private static final Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
 System.out.println("Simple Calculator");
 while (true) {
 showMenu();
 String choice = sc.nextLine().trim();
 switch (choice) {
 case "1":
	 performOperation("add");
 break;
 case "2":
	 performOperation("subtract");
 break;
 case "3":
	 performOperation("multiply");
 break;
 case "4":
	 performOperation("divide");
 break;
 case "5":
	 System.out.println("Exiting. Thanks!");
 return;
 default:
	 System.out.println("Invalid option. Enter 1-5.");
 }
 System.out.println();
 }
 }
 private static void showMenu() {
 System.out.println("Choose operation:");
 System.out.println("1) Add");
 System.out.println("2) Subtract");
 System.out.println("3) Multiply");
 System.out.println("4) Divide");
 System.out.println("5) Exit");
 System.out.print("Enter Your Choice: ");
 }
 private static void performOperation(String op) {
 double a = readDouble("Enter first number: ");
 double b = readDouble("Enter second number: ");
 try {
 double result;
 switch (op) {
 case "add": result = add(a, b); break;
 case "subtract": result = subtract(a, b); break;
 case "multiply": result = multiply(a, b); break;
 case "divide": result = divide(a, b); break;
 default: throw new IllegalArgumentException("Unknown operation");
 }
 System.out.println("Result: " + result);
 } catch (ArithmeticException ex) {
	 System.out.println("Error: " + ex.getMessage());
 }
 }
 private static double add(double x, double y) { return x + y; }
 private static double subtract(double x, double y) { return x - y; }
 private static double multiply(double x, double y) { return x * y; }
 private static double divide(double x, double y) {
 if (y == 0) throw new ArithmeticException("Division by zero is not allowed.");
 return x / y;
 }
 private static double readDouble(String prompt) {
 while (true) {
 System.out.print(prompt);
 String line = sc.nextLine();
 try {
 return Double.parseDouble(line.trim());
 } catch (NumberFormatException e) {
 System.out.println("Invalid number. Please enter a valid numeric value (e.g., 12.34).");
 }
 }
 }
 }
