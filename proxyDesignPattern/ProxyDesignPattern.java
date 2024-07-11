package proxyDesignPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        try {
            employeeDao.getEmployeeById(11);
            employeeDao.deleteEmployee(10);
            employeeDao.addEmployee(new EmployeeObj(10, "John", "Developer", 10000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
