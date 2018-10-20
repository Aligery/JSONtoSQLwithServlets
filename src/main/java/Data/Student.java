package Data;

import com.sun.istack.internal.NotNull;
import javax.persistence.*;

@Entity
@Table(name = "Student")

public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;
    @Column(name = "firstName")
    private String fname;
    @Column(name = "lastName")
    private String Sname;
    @Column(name = "Group")
    private String StudyGroup;

    public Student() {
    }


    public Student(String fname, String sname, String studyGroup) {
        this.fname = fname;
        Sname = sname;
        StudyGroup = studyGroup;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getStudyGroup() {
        return StudyGroup;
    }

    public void setStudyGroup(String studyGroup) {
        StudyGroup = studyGroup;
    }
}