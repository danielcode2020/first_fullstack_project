package md.utm.repository;

import md.utm.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Student> findAll() {
        List<Student> studentList = jdbcTemplate.query("select * from student", (response, rowNumber) -> {

            return new Student(
                    response.getString("idnp"),
                    response.getString("nume"),
                    response.getString("prenume"),
                    response.getString("grupa"),
                    response.getDouble("media"),
                    response.getString("email"),
                    response.getInt("st_univ_id"));
        });
        return studentList;
    }
    public Student findByIdnp(String idnp){
        Student student = jdbcTemplate.queryForObject("select * from student where idnp=? ",new Object[]{idnp},(response,rowNumber) ->{
           return new Student(
                   response.getString("idnp"),
                   response.getString("nume"),
                   response.getString("prenume"),
                   response.getString("grupa"),
                   response.getDouble("media"),
                   response.getString("email"),
                   response.getInt("st_univ_id"));
        });
        return student;
    }

    public Student findByEmail(String email){
        Student studentEmail = jdbcTemplate.queryForObject("select * from student where email=?", new Object[]{email},(response, rowNumber)->{
            return new Student(
                    response.getString("idnp"),
                    response.getString("nume"),
                    response.getString("prenume"),
                    response.getString("grupa"),
                    response.getDouble("media"),
                    response.getString("email"),
                    response.getInt("st_univ_id"));
        });
        return studentEmail;
    }

    public List<Student> findByUniversitateNume(String name) {
        List<Student> studentList = jdbcTemplate.query("select * from student inner join universitate on universitate.id = student.st_univ_id where universitate.name = ?",new Object[]{name}, (response, rowNumber) -> {
            return new Student(
                    response.getString("idnp"),
                    response.getString("nume"),
                    response.getString("prenume"),
                    response.getString("grupa"),
                    response.getDouble("media"),
                    response.getString("email"),
                    response.getInt("st_univ_id"));
        });
        return studentList;
    }

    public List<Student> findBetweenGrades(int min, int max){
        List<Student> studentList = jdbcTemplate.query("select * from student where media between ? and ?",new Object[]{min, max},(response, rowNumber)->{
            return new Student(
                    response.getString("idnp"),
                    response.getString("nume"),
                    response.getString("prenume"),
                    response.getString("grupa"),
                    response.getDouble("media"),
                    response.getString("email"),
                    response.getInt("st_univ_id"));
        });
        return studentList;
    }

    public void save(Student student){
        jdbcTemplate.update(
                "insert into student (idnp, nume, prenume, grupa, media, email, st_univ_id)values(?,?,?,?,?,?,?)",
                student.getIdnp(),student.getFirstName(),student.getLastName(),student.getGrupa(),student.getMedia(),student.getEmail(),student.getUnivId());
    }

    public void update(String idnp,Student student){
        jdbcTemplate.update(
                "update student set nume = ?, prenume = ?, grupa = ?, media = ?, email = ?, st_univ_id = ? where idnp = ?",
                student.getFirstName(),student.getLastName(), student.getGrupa(),student.getMedia(),student.getEmail(),student.getUnivId(), idnp);
    }

    public void delete(String idnp){
        jdbcTemplate.update(
                "delete from student where idnp = ?",idnp);
    }
}
