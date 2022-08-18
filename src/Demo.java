public class Demo {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name=' " + name + " ' " +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        //check for content equality
       // if(this.id == obj.id)
        // cast it to demo
        // but before casting, check whether that object is of demo class
        // objectName instanceof ClassName
        if(obj instanceof Demo){
        if(this.id == ((Demo)obj).id && this.name.equals(((Demo) obj).name)){
            return true;
        }
        }
        return false;
    }
}
//name = "Vaibhav"
/*
Create a Student class with attributes name, mobile, email.
that class will have geter setters, toString, equals and hashcode
 methods overridden
 */