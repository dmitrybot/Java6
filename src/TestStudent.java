import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudent {

    public static void insertionSort(Student[] arr) {
        for(int i = 1; i < arr.length; i++){
            Student currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey].getiDNumber() > currElem.getiDNumber()){
                arr[prevKey+1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey+1] = currElem;
        }
    }

    public static void main(String[] args) {
        Student st[] = new Student[30];
        List<Student> stu = new ArrayList<>();
        List<Student> stu1 = new ArrayList<>();
        List<Student> stu2 = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            st[i] = new Student((int) (Math.random() * 300), (int) (Math.random() * 300));
            stu.add(new Student((int) (Math.random() * 300), (int) (Math.random() * 300)));
            stu1.add(new Student((int) (Math.random() * 300), (int) (Math.random() * 300)));
            stu2.add(new Student((int) (Math.random() * 300), (int) (Math.random() * 300)));
        }
        insertionSort(st);
        for (Student i: st){
            System.out.println(i);
        }

        Comparator<Student> comp = new SortingStudentsByGPA();
        stu.sort(comp);
        System.out.println("-----------------------------------------------");
        for (Student i: stu){
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------");
        stu1.sort(comp);
        stu2.sort(comp);
        List<Student> stu3 = new ArrayList<>();
        int positionA = 0, positionB = 0;
        for (int i = 0; i < stu1.size() + stu2.size(); i++){
            if (positionA == stu1.size()){
                stu3.add(stu2.get(positionB));
                positionB++;
            } else if (positionB == stu2.size()) {
                stu3.add(stu1.get(positionA));
                positionA++;
            } else if (stu1.get(positionA).getBal() > stu2.get(positionB).getBal()) {
                stu3.add(stu1.get(positionA));
                positionA++;
            } else {
                stu3.add(stu2.get(positionB));
                positionB++;
            }
        }

        for (Student i: stu3){
            System.out.println(i);
        }
    }
}
