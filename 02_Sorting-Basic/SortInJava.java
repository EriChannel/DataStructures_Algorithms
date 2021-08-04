import java.util.Arrays;
import java.util.Comparator;

public class SortInJava {
    public static void main(String[] args) {
        //sắp xếp mảng số nguyên
        int [] nums = {3,6,1,6,2,7,4};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //Sắp xếp mảng chuỗi
        String [] str = {"Java", "HTML", "Ruby", "CSS", "C++"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        Student []students = new Student[5];
        students[0] = new Student("KKK", 21);
        students[1] = new Student("EEE", 27);
        students[2] = new Student("CCC", 25);
        students[3] = new Student("AAA", 19);
        students[4] = new Student("HHH", 24);

       //Sử dụng interface Comparable sắp xếp theo tên
        Arrays.sort(students);
        System.out.println("Danh sách sắp xếp theo tên: ");
        for (Student student : students) {
            System.out.println(student);
        }

        //Sử dụng comparator để sắp xếp theo tuôir
        Arrays.sort(students, new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getAge() - o2.getAge();
            }

        });

        System.out.println("Danh sách sắp xếp theo tuổi: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    
}
