import java.util.Scanner;
class JavaApplicatio {
	static Students s;

	public static void executio() {


		Scanner sc = new Scanner(System.in);
			boolean choice = true;
			while(choice) {
				System.out.println("Student Details: ");
				System.out.println("--------------------");
				System.out.println("1 .Enter your choice : ");
				System.out.println("2 .Create student : ");
				System.out.println("3 .Read student : ");
				System.out.println("4 .Update student : ");
				System.out.println("5 .Delete Student : ");
				System.out.println("6. Exit : ");
				int select = sc.nextInt();
				switch(select) {
				case 1:
					s = new Students();
					s.create();
					break;
				case 2:
					s.insert();
					break;
				case 3:
					s.read();
					break;
				case 4:
					s.update();
					break;
				case 5:
					s=null;
					System.out.println("Deleted successfullyyy");
					break;
				case 6:
					s.exit();
					choice=false;
					break;
				default:
					System.out.println("Invalid choice!");

				}

			}
		}


	}

