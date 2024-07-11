package proxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {

    private EmployeeDao employeeDao;

    EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void getEmployeeById(int employeeId) throws Exception {
        if(employeeId>10){
            employeeDao.getEmployeeById(employeeId);
        }else{
            throw new Exception("ACESS DENIED");
        }
    }

    @Override
    public void deleteEmployee(int employeeId) throws Exception {
        if(employeeId>10){
            employeeDao.deleteEmployee(employeeId);
        }else{
            throw new Exception("ACESS DENIED");
        }
    }

    @Override
    public void addEmployee(EmployeeObj employeeObj) throws Exception {
        if(employeeObj.getEmployeeId()>10){
            employeeDao.addEmployee(employeeObj);
        }else{
            throw new Exception("ACESS DENIED");
        }
    }
}
