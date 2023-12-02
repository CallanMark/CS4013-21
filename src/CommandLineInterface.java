/** Command-line interface class for inteacting with App
    *Handles user input */
public class CommandLineInterface {
 //creates object of the Login class
    Login login;
 
  /** Runs the command-line interface 
 * Creates objects of the different classes and passes username and password from Login class to it */ 
    public void run() {

        login = new Login();

        switch (login.getDivision()) {
            case "Student" -> {
                Student student = new Student(login.getUsername(), login.getPassword());
                student.studentLogic();
            }
            case "Faculty" -> {
                Faculty faculty = new Faculty(login.getUsername(), login.getPassword());
                faculty.facultyLogic();
            }
            case "Department" -> {
                Department department = new Department(login.getUsername(), login.getPassword());
                department.departmentLogic();
            }
            default -> System.out.println("Invalid Input !");
        }

    }

}
