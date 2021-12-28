package md.utm.controller;

import md.utm.entity.Universitate;
import md.utm.repository.UniversitateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("universitate")
public class UniversitateController {

    /*
    CRUD for Universitate
    GET /institution
    GET /institution/{id}
    POST /institution
    PUT /institution/{id}
    DELETE /institution/{id}
     */
    @Autowired
    private UniversitateRepository universitateRepository;
    @GetMapping("test")
    public String test(){
        return "test";
    }

    @GetMapping
    public List<Universitate> universitateList(){
        return universitateRepository.findAll();
    }


    @GetMapping("/{id}")
    public Universitate universitateById(@PathVariable("id") Integer id){
        return universitateRepository.findById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Integer id,@RequestBody Universitate universitate){
        universitateRepository.update(id,universitate);
    }

    @PostMapping
    public void save(@RequestBody Universitate universitate){
        universitateRepository.save(universitate);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        universitateRepository.delete(id);
    }
}
