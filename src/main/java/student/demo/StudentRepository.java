package student.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {

    HashMap<String , Student> StudentMap = new HashMap<>();

    public void addStudent(Student student){
        StudentMap.put(student.getName(), student);
    }

    public List<String> getallStudents(){
        return new ArrayList<>( StudentMap.keySet());
    }
}
