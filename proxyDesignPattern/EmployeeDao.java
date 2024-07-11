package proxyDesignPattern;

interface EmployeeDao {

    public void getEmployeeById(int employeeId) throws Exception;

    public void deleteEmployee(int employeeId) throws Exception;

    public void addEmployee(EmployeeObj employeeObj)throws Exception;

}