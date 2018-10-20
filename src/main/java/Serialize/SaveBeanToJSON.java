package Serialize;

import Data.Student;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SaveBeanToJSON {
//   public SaveBeanToJSON() {
//
//    }
//public static void main(String[] args)
    public void createJsonOnComputer()
    {
        Student Student1 = new Student("Vasya", "Petrov", "3");
        Student Student2 = new Student("Dementyev", "Ilya", "Olegovich");
        Student Student3 = new Student("Dmitry", "Kuduhov", "Sergeevich");
        Student Student4 = new Student("Aligery", "Ilya", "Denisovich");
        ArrayList<Student> student = new ArrayList<Student>();
        student.add(Student1);
        System.out.println("1 студент пошёл в объект");
        student.add(Student2);
        System.out.println("2 студент пошёл в объект");
        student.add(Student3);
        System.out.println("3 студент пошёл в объект");
        student.add(Student4);
        System.out.println("4 студент пошёл в объект");
        Gson gson = new Gson();
        String JSON = gson.toJson(student); //Запихнули JSON массив в стринг
        System.out.println(JSON);
//        writeUsingFileWriter(JSON);
//        System.out.println("JSON создали, туда все записали, братишка");
//    }
//    private static void writeUsingFileWriter(String data) {
//        File file = new File("Students.JSON");
//        FileWriter fr = null;
//        try {
//            fr = new FileWriter(file);
//            fr.write(data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fr.close();
//                System.out.println("JSON создали, туда все записали, братишка");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
