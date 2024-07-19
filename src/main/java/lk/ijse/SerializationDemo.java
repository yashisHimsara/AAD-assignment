package lk.ijse;
import lk.ijse.dto.Student;
import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);

        // Serialize the student object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(student);
            System.out.println("Student object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the student object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("Deserialized Student: " + deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}