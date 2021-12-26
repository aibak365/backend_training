package student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/student")
public class StudentController {
    @Autowired
    public StudentController(StudentService studentservice)
    {
        this.studentservice = studentservice;
        getStudent();
    }

    private final StudentService studentservice;
    @GetMapping
    public List<Student> getStudent()
    {
    return studentservice.getStudent();
    }
}
