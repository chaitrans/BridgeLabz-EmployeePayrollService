import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class EmployeePayrollServiceTest {

    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchNumberOfEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmployees = {
                new EmployeePayrollData(1, "Chaitra NS", 8800000.0),
                new EmployeePayrollData(2, "Geeta Biradar", 850000.0),
                new EmployeePayrollData(3, "Ganga S", 900000.0) };

        EmployeePayrollService payrollServiceObject = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
        payrollServiceObject.writeEmployeeDdate(EmployeePayrollService.IOService.FILE_IO);
        payrollServiceObject.printEmployeePayrollData();

        Assert.assertEquals(3, payrollServiceObject.countEnteries(EmployeePayrollService.IOService.FILE_IO));
    }

}