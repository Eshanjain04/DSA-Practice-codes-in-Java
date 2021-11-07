import java.util.*;
class Student{
    
    String name;
    int marks;
    
  public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
        
    }
 
    public String toString(){
        return this.name + " " + this.marks;
    }
}

class sortByMarks implements Comparator<Student>{
    public int compare(Student a,Student b){
        return a.marks-b.marks;
    }
}

public class HelloWorld{


     public static void main(String []args){
        System.out.println("Hello World");
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Anil",20));
        list.add(new Student("Ayan",50));
        list.add(new Student("Piyush",20));
        list.add(new Student("Ram",70));
        
        Collections.sort(list,new sortByMarks());
        
        System.out.println("\nSorted by marks");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
     }
}
