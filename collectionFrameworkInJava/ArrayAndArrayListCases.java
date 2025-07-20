
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayAndArrayListCase {

    public static void main(String[] args) {
        ArrayListOnly ao = new ArrayListOnly();
        ao.printArray();
        WorkOnArrayList wo = new WorkOnArrayList();
        wo.workOnPlace();
    }
}

class ArrayListOnly {

    public void printArray() {
        List<Integer> employeeList = new ArrayList<>();
        employeeList.add(2);
        employeeList.add(90);
        employeeList.add(200);
        employeeList.add(90);

        System.out.println(employeeList);

        int[] nums = {2, 4, 6, 77, 88, 40};

        System.out.println(Arrays.toString(nums));

    }
}

class WorkOnArrayList {

    public void workOnPlace() {
        List<String> places = new ArrayList<>();
        places.add("Kolkata");
        places.add("Mumbai");
        places.add("Delhi");
        places.add("Kerala");
        for (String place : places) {
            if (place.contains("K")) {
                System.out.println(place);
            }
        }
        System.out.println(places);
    }
}
