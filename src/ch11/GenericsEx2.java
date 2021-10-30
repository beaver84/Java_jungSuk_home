//package ch11;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class GenericsEx2 {
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<Student>();
//        list.add(new Student("자바왕", 1, 1));
//        list.add(new Student("자바짱", 1, 1));
//        list.add(new Student("홍길동", 1, 1));
//        list.add(new Student("전우치", 1, 1));
//
//        Iterator<Student> it = list.iterator();
//
//        while (it.hasNext()) {
//            Student s = it.next();
//            System.out.println(s.name);
//        }
//    }
//}
//
//class Student {
//    String name = "";
//    int ban;
//    int no;
//
//    public Student(String name, int ban, int no) {
//        this.name = name;
//        this.ban = ban;
//        this.no = no;
//    }
//}
