package md.utm.controller;

import md.utm.entity.Student;
import md.utm.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentController {
       // private static List<Student> students = List.of(new Student("1233242312","Daniel","Marandici","FI201",9.0,"danielmarandici@isa.utm.md",1),new Student("3324234232","Ion","Gatman","FI20",8.0,"gtmion@mail.ru",1));

    /*
    CRUD
    Create
    Read
    Update
    Delete

    GET /student (lista de studenti)
    GET /student/{idnp} (studentul dupa idnp) , deodata slash pentru ca idnp este cheie
    GET /student/email/{email} (studentul dupa email)

    POST /student (creare de un student)
    PUT /student/{idnp} (modificare de un student dupa key)

    DELETE /student/{idnp}  (stergere de student dupa key)

     */
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/test")
    public String test(){
        System.out.println("TEST");
        return "test";
    }

    @GetMapping
    public List<Student> studentList(){
        return studentRepository.findAll();
    }
    @GetMapping("/{idnp}")
    public Student studentByIdnp(@PathVariable("idnp") String idnp){
        return studentRepository.findByIdnp(idnp);
    }
    @GetMapping("/email/{email}")
    public Student studentByEmail(@PathVariable("email") String email){
        return studentRepository.findByEmail(email);
    }

    @GetMapping("/universitate/{name}")
    public List<Student> findByUniversitateNume(@PathVariable("name") String name){
        return studentRepository.findByUniversitateNume(name);
    }

    @GetMapping("/grade")
    public List<Student> findBetweenGrades(@RequestParam("min") int min,@RequestParam("max") int max){
        return studentRepository.findBetweenGrades(min,max);
    }

    @PostMapping
    public void save(@RequestBody Student student){studentRepository.save(student);}

    @PutMapping("/{idnp}")
    public void update(@PathVariable("idnp") String idnp, @RequestBody Student student) {studentRepository.update(idnp, student);}

    @DeleteMapping("/{idnp}")
    public void delete(@PathVariable("idnp") String idnp){studentRepository.delete(idnp);}


}
