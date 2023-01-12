
public class App {
    public static void main(String[] args) throws Exception {

        User usuario1 = new User();

        usuario1.setName("Cecilia Vargas");
        usuario1.setAge(22);
        usuario1.setEmail("cecilia@gmail.com");

        usuario1.subject.setName("Modelagem");
        usuario1.subject.setPeriod(5);

        System.out.println(usuario1.getName());
        System.out.println(usuario1.getEmail());
        System.out.println(usuario1.getAge());
        System.out.println(usuario1.subject.getName()+" - Período: "+usuario1.subject.getPeriod());
    }
}
