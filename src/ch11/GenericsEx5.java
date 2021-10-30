package ch11;

import java.util.HashMap;
import java.util.Iterator;

public class GenericsEx5 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>();
        map.put("1-1", new Student("자바왕", 1, 1, 100, 100, 100));
        map.put("1-2", new Student("자바킹", 1, 1, 100, 100, 100));
        map.put("2-1", new Student("자바짱", 1, 1, 100, 100, 100));
        map.put("2-2", new Student("자바랑", 1, 1, 100, 100, 100));

        Student s1 = map.get("1-1");
        System.out.println("1-1 : " + s1.name);

        Iterator<String> itKey = map.keySet().iterator();

        while(itKey.hasNext()){
            System.out.println(itKey.next());
        }

        Iterator<Student> itValue = map.values().iterator();
        int totalSum = 0;

        while (itValue.hasNext()) {
            Student s = itValue.next();
            totalSum += s.total;
        }
        System.out.println("전체 총점: "+totalSum);

    }
}

class Student extends Person implements Comparable<Person> {
    String name = "";
    int ban = 0;
    int no = 0;
    int koreanScore = 0;
    int mathScore = 0;
    int englishScore = 0;

    int total = 0;

    Student(String name, int ban, int no, int koreanScore, int mathScore, int englishScore) {
        super(ban + "-" + no, name);
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;

        total = koreanScore + mathScore + englishScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", koreanScore=" + koreanScore +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                ", total=" + total +
                '}';
    }

    public int compareTo(Person o) {
        return id.compareTo(o.id);
    }
}

class Person {
    String id;
    String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
}