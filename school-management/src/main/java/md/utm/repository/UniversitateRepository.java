package md.utm.repository;


import md.utm.entity.Universitate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UniversitateRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Universitate> findAll(){
        List<Universitate> universitateList = jdbcTemplate.query("select * from universitate",(response, rowNumber)->{
            return new Universitate(
                    response.getInt("id"),
                    response.getString("name"),
                    response.getString("city"),
                    response.getString("type"));
        });
        return universitateList;
    }

    public Universitate findById(Integer id){
        Universitate universitate = jdbcTemplate.queryForObject("select * from universitate where id=?",new Object[]{id},(response,rowNumber)->{
            return new Universitate(
                    response.getInt("id"),
                    response.getString("name"),
                    response.getString("city"),
                    response.getString("type"));
        });
        return universitate;
    }

    public void save(Universitate universitate){
        jdbcTemplate.update("insert into universitate (id,name,city,type) values(?,?,?,?)",
                universitate.getId(), universitate.getName(),universitate.getCity(),universitate.getType());
    }

    public void update(Integer id, Universitate universitate){
        jdbcTemplate.update("update universitate set name = ?, city = ?, type = ? where id = ?",
                universitate.getName(),universitate.getCity(), universitate.getType(), id);
    }

    public void delete(Integer id){
        jdbcTemplate.update("delete from universitate where id = ?",id);
    }

}
