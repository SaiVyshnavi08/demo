package student.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController   // we are saying the application that this contains APIs
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentservice;

    @PostMapping("/add_Student")
    public ResponseEntity<String>  addStudent (@RequestBody() Student student){
        studentservice.addStudent(student);
        return new ResponseEntity<>("Student added Succesfully" , HttpStatus.CREATED);
    }

    @GetMapping("get_all_students")
    public ResponseEntity<List<String>> getAllStudents(){
        List<String> ans = studentservice.getallStudents();
        return new ResponseEntity<>(ans , HttpStatus.OK);
    }

}
