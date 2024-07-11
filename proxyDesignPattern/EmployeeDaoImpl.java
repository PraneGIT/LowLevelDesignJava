package proxyDesignPattern;


public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void getEmployeeById(int employeeId) throws Exception {
        System.out.println("EmployeeDaoImpl.getEmployeeById()");
    }

    @Override
    public void deleteEmployee(int employeeId) throws Exception {
        System.out.println("EmployeeDaoImpl.deleteEmployee()");
    }

    @Override
    public void addEmployee(EmployeeObj employeeObj) throws Exception {
        System.out.println("EmployeeDaoImpl.addEmployee()");
    }
    
}
