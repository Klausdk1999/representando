public class User {
    private String name;    
    private String email;
    private int age;
    
    public Subject subject = new Subject();
    
    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
