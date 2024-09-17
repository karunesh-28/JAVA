import java.io.*;

class Address implements Serializable{
    String flatNo;
    String society;
    Address(String f, String s){
        flatNo = f;
        society = s;
    }
    public String toString(){
        return "Flat No: "+flatNo+" Society: "+society;
    }
}

class Person implements Serializable{
    int id;
    String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "id: "+id+" name: "+name;
    }
}

class Student extends Person{
    int rollno;
    String course;
    Address addr;
    public Student(int id, String name, int rollno, String course, Address ad){
        super(id, name);
        this.rollno = rollno;
        this.course = course;
        this.addr = ad;
    }
    public String toString(){
        System.out.println(super.toString());
        return "roll No: "+rollno+" course: "+course+" address: "+addr;
    }
}

public class SerializationEx1Aggregation {
    public static void main(String []args){
        //Address ad=new Address("333","Soc");
        Student s1=new Student(1, "Stud1", 111, "AAA",new Address("333", "Soc"));
        System.out.println(s1);
        
        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("/Users/karuneshchikne/SerializationEx1Aggregation.java"))){
            os.writeObject(s1);
        }catch(IOException e){
            System.out.println("Exception in serialization"+e);
        }
        try(ObjectOutputStream is=new ObjectOutputStream(new FileOutputStream("/Users/karuneshchikne/SerializationEx1Aggregation.java"))){
            Student s2=(Student)is.readObject();
        }
    }
}