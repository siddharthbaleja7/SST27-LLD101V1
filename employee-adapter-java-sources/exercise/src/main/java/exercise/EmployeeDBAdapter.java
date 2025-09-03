package exercise;

public class EmployeeDBAdapter implements Employee{
    private EmployeeDB employeeDb;
    public EmployeeDBAdapter(EmployeeDB employeeDb){
        this.employeeDb = employeeDb;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeDb.getId());
    }

    @Override
    public String getFirstName() {
        return employeeDb.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeDb.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeDb.getEmailAddress();
    }
}
