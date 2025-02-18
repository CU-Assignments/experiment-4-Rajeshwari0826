
// arraylist
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class Employee {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
public class expa1 {
    private static List<Employee> employeeList = new ArrayList<>();
    public static void addEmployee(int id, String name, double salary) {
        employeeList.add(new Employee(id, name, salary));
        System.out.println("Employee added successfully.");
    }
    public static void uemp(int id, String newName, double newSalary) {
        for (Employee emp : employeeList) {
            if (emp.id == id) {
                emp.name = newName;
                emp.salary = newSalary;
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public static void remp(int id) {
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().id == id) {
                iterator.remove();
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public static void semp(int id) {
        for (Employee emp : employeeList) {
            if (emp.id == id) {
                System.out.println(emp);
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public static void demp() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Display Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    addEmployee(id, name, salary);
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();
                    uemp(updateId, newName, newSalary);
                    break;
                case 3:
                    System.out.print("Enter ID to remove: ");
                    int removeId = scanner.nextInt();
                    remp(removeId);
                    break;
                case 4:
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    semp(searchId);
                    break;
                case 5:
                    demp();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}


// Employee Management System
// 1. Add Employee
// 2. Update Employee
// 3. Remove Employee
// 4. Search Employee
// 5. Display Employees
// 6. Exit
// Enter your choice: 1
// Enter ID: 123
// Enter Name: rajeshwari
// Enter Salary: 2340000
// Employee added successfully.
// Employee Management System
// 1. Add Employee
// 2. Update Employee
// 3. Remove Employee
// 4. Search Employee
// 5. Display Employees
// 6. Exit



// card 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
class Card {
    private String s;
    private String v;
    public Card(String s, String v) {
        this.s = s;
        this.v = v;
    }
    public String gets() {
        return s;
    }
    @Override
    public String toString() {
        return "Card{s='" + s + "', v='" + value + "'}";
    }
}
public class expa1 {
    private static Collection<Card> cardcol = new ArrayList<>();
    public static void addCard(String s, String v) {
        cardcol.add(new Card(s, v));
        System.out.println("Card added successfully.");
    }
    public static void rcard(String s, String v) {
        Iterator<Card> iterator = cardcol.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            if (card.gets().equals(s)) {
                iterator.remove();
                System.out.println("Card removed successfully.");
                return;
            }
        }
        System.out.println("Card not found.");
    }
    public static void scard(String s) {
        boolean found = false;
        for (Card card : cardcol) {
            if (card.gets().equals(s)) {
                System.out.println(card);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cards found with symbol: " + s);
        }
    }
    public static void dcard() {
        if (cardcol.isEmpty()) {
            System.out.println("No cards to display.");
        } else {
            for (Card card : cardcol) {
                System.out.println(card);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nCard Collection System");
            System.out.println("1. Add Card");
            System.out.println("2. Remove Card");
            System.out.println("3. Search Cards by Symbol");
            System.out.println("4. Display All Cards");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Card s: ");
                    String s = scanner.nextLine();
                    System.out.print("Enter Card Value: ");
                    String v = scanner.nextLine();
                    addCard(s, v);
                    break;
                case 2:
                    System.out.print("Enter Card Symbol to Remove: ");
                    String removeSymbol = scanner.nextLine();
                    rcard(removeSymbol, "");
                    break;
                case 3:
                    System.out.print("Enter Symbol to Search: ");
                    String searchSymbol = scanner.nextLine();
                    scard(searchSymbol);
                    break;
                case 4:
                    dcard();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}



// Card Collection System
// 1. Add Card
// 2. Remove Card
// 3. Search Cards by Symbol
// 4. Display All Cards
// 5. Exit
// Enter your choice: 2
// Enter Card Symbol to Remove: 1223
// Card not found.
// Card Collection System
// 1. Add Card
// 2. Remove Card
// 3. Search Cards by Symbol
// 4. Display All Cards
// 5. Exit
// Enter your choice: 1
// Enter Card Symbol: 1234
// Enter Card Value: 3456
// Card added successfully.


//ticket booking system
import java.util.ArrayList;
import java.util.List;
class ticket {
    private static final int TOTAL_SEATS = 10;
    private final boolean[] seats = new boolean[TOTAL_SEATS];    
    public synchronized boolean bookSeat(int seatNumber, String customerName) {
        if (seatNumber < 0 || seatNumber >= TOTAL_SEATS) {
            System.out.println(customerName + " - Invalid seat number: " + seatNumber);
            return false;
        }
        if (!seats[seatNumber]) {
            seats[seatNumber] = true;
            System.out.println(customerName + " successfully booked seat " + seatNumber);
            return true;
        } else {
            System.out.println(customerName + " - Seat " + seatNumber + " is already booked.");
            return false;
        }
    }
}
class Customer extends Thread {
    private final ticket system;
    private final int seatNumber;
    private final String customerName;
    public Customer(ticket system, int seatNumber, String customerName, int priority) {
        this.system = system;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
        setPriority(priority);
    }
    @Override
    public void run() {
        system.bookSeat(seatNumber, customerName);
    }
}
public class expa1 {
    public static void main(String[] args) {
        ticket system = new ticket();
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(system, 2, "VIP_John", Thread.MAX_PRIORITY));
        customers.add(new Customer(system, 4, "VIP_Alice", Thread.MAX_PRIORITY));
        customers.add(new Customer(system, 2, "Regular_Bob", Thread.NORM_PRIORITY));
        customers.add(new Customer(system, 4, "Regular_Eve", Thread.NORM_PRIORITY));
        customers.add(new Customer(system, 5, "Regular_Charlie", Thread.NORM_PRIORITY));
        for (Customer customer : customers) {
            customer.start();
        }
        for (Customer customer : customers) {
            try {
                customer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// VIP_John successfully booked seat 2
// Regular_Eve successfully booked seat 4
// Regular_Charlie successfully booked seat 5
// Regular_Bob - Seat 2 is already booked.
// VIP_Alice - Seat 4 is already booked.
