import java.util.Objects;

public class Student {
    private String name;
    private String email;
    private int rollNo;

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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String toString(){
        return name + ", " + email + ", " + rollNo;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (getMobile() != student.getMobile()) return false;
        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        return getEmail() != null ? getEmail().equals(student.getEmail()) : student.getEmail() == null;
    }*/

    /*  @Override
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
        }*/


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }


}
