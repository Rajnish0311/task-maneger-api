
package code.rajnish.task_maneger.task_maneger.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDetails {


    private String name;
    private String email;
    private String collegeId;
    @Id
    private String registrationNo;
    private String code;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCollegeId() {
        return collegeId;
    }
    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }
    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
