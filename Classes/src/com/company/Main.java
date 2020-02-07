package com.company;

public class Main {

    public static void main(String[] args) {
//        var textBox1 = new TextBox();
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text.toUpperCase());
//
//        var textBox2 = new TextBox();
//        textBox2.setText("Box 2");
//        System.out.println(textBox2.text);
        var employee = new Employee(50000, 0);
        Employee.printNumberOfEmployees();
//        int salary = employee.getBaseSalary();
//        System.out.println("Salary: " + salary);


//        int hourlyRate = employee.getHourlyRate();
//        System.out.println("Hourly Rate: " + hourlyRate);

        int wage = employee.calculateWage(10);
        System.out.println(wage);


//        var broswer = new Browser();
    }

}
