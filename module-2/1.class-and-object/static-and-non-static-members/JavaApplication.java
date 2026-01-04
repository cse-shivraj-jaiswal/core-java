/*class JavaApplication{
	public static void execution(){
		System.out.println(Members.sv);
		Members.sm();

		Members members = new Members();
		System.out.println(members.nsv);
		members.nsm(}
*/

import java.util.Scanner;
class JavaApplication {
    static Student[] stu = new Student[10];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
        	System.out.print("Enter choice: ");
            System.out.println("1.Create");
            System.out.println("2.Insert");
            System.out.println("3.Read");
            System.out.println("4.Update");
            System.out.println("5.Delete");
            System.out.println("6.Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    read();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    System.out.println("Thank You! Visit Again!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }

    static void create() {
        if (count < stu.length) {
            stu[count] = new Student();
            System.out.println("Student object created");
        } else {
            System.out.println("Storage full");
        }
    }

    static void insert() {
        if (count < stu.length && stu[count] != null) {
            System.out.print("Enter ID: ");
            stu[count].id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            stu[count].name = sc.nextLine();

            System.out.print("Enter Contact Number: ");
            stu[count].contactNumber = sc.nextLong();

            count++;
            System.out.println("Data inserted");
        } else {
            System.out.println("Create student first");
        }
    }

    static void read() {
        if (count == 0) {
            System.out.println("No records");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(stu[i].id + " " + stu[i].name + " " + stu[i].contactNumber);
        }
    }

    static void update() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (stu[i].id == id) {
                sc.nextLine();
                System.out.print("Enter new name: ");
                stu[i].name = sc.nextLine();

                System.out.print("Enter new contact number: ");
                stu[i].contactNumber = sc.nextLong();

                System.out.println("Updated");
                return;
            }
        }
        System.out.println("Student not found");
    }

    static void delete() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (stu[i].id == id) {
                for (int j = i; j < count - 1; j++) {
                    stu[j] = stu[j + 1];
                }
                stu[count - 1] = null;
                count--;
                System.out.println("Deleted");
                return;
            }
        }
        System.out.println("Student not found");
    }
}
