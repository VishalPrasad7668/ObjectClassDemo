import java.util.Objects;
import java.util.Scanner;

public class Main {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Main main)) return false;
        return id == main.id && Objects.equals(name, main.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        new Main().toString();
        /*Demo obj = new Demo();

        obj.setId(10);
        obj.setName("Vaibhav");


        System.out.println(obj);
        System.out.println(obj);
        Main main = new Main();
        System.out.println(main);

        Demo demo = obj;
        demo.setId(11);
        demo.setName("Vaibhav");
        System.out.println("obj.equals(main) = " + obj.equals(main));

        System.out.println("demo = " + demo);
        System.out.println("obj = " + obj);*/
        // array of student object
        //type[] arrayName = new type[int size];
        Student[] students = new Student[5];
        Student s1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            //initialize all the index by calling constructor on each index
            s1 = new Student();
            System.out.println("enter name");
            s1.setName(sc.nextLine());
            System.out.println("enter email");
            s1.setEmail(sc.nextLine());
            System.out.println("enter roll number");
            s1.setRollNo(sc.nextInt());
            sc.nextLine();
            students[i] = s1;
            /*students[i].setName("Vaibhav");
            students[i].setEmail("abhb@example.com");
            students[i].setMobile(1234567888L);*/
            System.out.println("students[i] = " + students[i]);

        }
        students[4].setName("Akash");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
           /* System.out.println("" + students[i].getClass().getName()+"@" +
                    Integer.toHexString(students[i].hashCode()));*/
        }

        // sorting as per name or roll number
        // searching for a student -> by values, name or roll number or email,
        // compare(equality) object if I implemented equals
    }
    public boolean search(Student searchObject, Student[] studentList){
        boolean response = false;
        for (int i = 0; i < studentList.length; i++) {
            if(searchObject.equals(studentList[i])){
                response = true;
                break;
            }
        }

        return response;
    }
    public Student[] sorting(Student[] listOfStudent){
        //sorting on roll number
        for (int i = 0; i < listOfStudent.length; i++) {
            for (int j = 0; j < listOfStudent.length - 1; j++) {
                if(listOfStudent[j].getRollNo() > listOfStudent[j+1].getRollNo()){
                    //swap of objects
                    /*Student temp = listOfStudent[j];
                    listOfStudent[j] = listOfStudent[j+1];
                    listOfStudent[j+1] = temp;*/
                    swap(j, j+1,listOfStudent);
                }
            }
        }
        return listOfStudent;
    }

    private void swap(int index, int nextIndex, Student[] arrayOfStudent){
        Student temp = arrayOfStudent[index];
        arrayOfStudent[index] = arrayOfStudent[nextIndex];
        arrayOfStudent[nextIndex] = temp;
    }

}
