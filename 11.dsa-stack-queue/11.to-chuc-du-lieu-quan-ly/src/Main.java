import com.sun.source.tree.WhileLoopTree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Employee female1 = new Employee("Nguyen Thi A", Employee.FEMALE,"30-04-1998");
        Employee female2 = new Employee("Nguyen Thi B", Employee.FEMALE,"01-05-1998");
        Employee female3 = new Employee("Nguyen Thi C", Employee.FEMALE,"14-07-1998");

        Employee male1 = new Employee("Nguyen Van A",Employee.MALE,"02-03-1998");
        Employee male2 = new Employee("Nguyen Van B",Employee.MALE,"23=12-1998");
        Employee male3 = new Employee("Nguyen Van C", Employee.MALE,"30-12-1998");

        Employee[] arr = {female1,female2,female3,male1,male2,male3};

        Queue<Employee> femaleQueue = new LinkedList<>();
        Queue<Employee> maleQueue = new LinkedList<>();

        for(Employee employee : arr){
            if(employee.getGender().equals(Employee.FEMALE)){
                femaleQueue.offer(employee);
            }else {
                maleQueue.offer(employee);
            }
        }

        while(!maleQueue.isEmpty()){
            femaleQueue.offer(maleQueue.poll());
        }

        for(Employee employee : arr){
            System.out.println(employee.getName() + " " + " " + employee.getGender() + " " +  employee.getDayOfBirth());
        }
    }
}
