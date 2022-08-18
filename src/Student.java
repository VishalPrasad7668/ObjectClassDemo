import java.util.Objects;

public class Student {
    private String name;
    private String email;
    private long mobile;

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

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String toString(){
        return name + ", " + email + ", " + mobile;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Student){
            Student  student = (Student) obj;
            if(this.name.equals(student.name) && this.email.equals(student.email)
                    && this.mobile == student.mobile){
                return true;
            }
        }
        return false;
    }
    public int hashCode(){
        return Objects.hash(name, email, mobile);
    }
}
