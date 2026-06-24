package com.github.zia;

import java.util.Scanner;

    public class Calculator {

        public double add(double num1, double num2) {
            return num1 + num2;
        }

        public double subtract(double num1, double num2) {
            return num1 - num2;
        }

        public double multiply(double num1, double num2) {
            return num1 * num2;
        }

        public double divide(double num1, double num2) throws DivisionByZeroException {
            if (num2 == 0) {
                throw new DivisionByZeroException("Cannot divide by zero!");
            }
            return num1 / num2;
        }

        public static void main(String[] args) {
            Calculator calc = new Calculator();
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Enter first number:");
                double num1 = scanner.nextDouble();

                System.out.println("Enter second number:");
                double num2 = scanner.nextDouble();

                System.out.println("Enter operation (+, -, *, /):");
                String operation = scanner.next();

                double result = 0;

                switch(operation) {
                    case "+":
                        result = calc.add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case "-":
                        result = calc.subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case "*":
                        result = calc.multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case "/":
                        result = calc.divide(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    default:
                        throw new InvalidInputException("Invalid operation! Use +, -, *, /");
                }

            } catch (DivisionByZeroException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers.");
            } finally {
                System.out.println("Calculator closed.");
            }
        }
    }
