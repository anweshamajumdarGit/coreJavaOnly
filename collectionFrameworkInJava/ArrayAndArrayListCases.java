
import java.util.ArrayList;
import java.util.List;

class ArrayAndArrayListCase{
public static void main(String[] args) {
    ArrayListOnly ao=new ArrayListOnly();
    ao.printArray();
}
}

 class ArrayListOnly{
    public void printArray(){
        List<String> employeeList=new ArrayList<>();
employeeList.add("emp1");
employeeList.add("emp1");
employeeList.add("emp1");
employeeList.add("emp1");

System.out.println(employeeList);

            }
}