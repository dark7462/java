package com.dark.SpringJDBCH2.Repository;

import com.dark.SpringJDBCH2.Component.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class studentRepo {

    private JdbcTemplate template;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.template = jdbcTemplate;
    }
    public void getJdbcTemplate() {
        template.execute("select * from student");
    }

    public void save(Student student) {
        String sql = "insert into student (id,name) values (?,?)";
        template.update(sql ,student.getId(),student.getName());
        System.out.println("save student");
        // saved
    }
    public List<Student> findAll(){
        String sql = "select * from student";

        RowMapper<Student> mapper = ( rs, romNum) ->{
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                return student;
        };

        return template.query(sql,mapper);
    }
}
