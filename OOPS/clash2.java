public class clash2 {
    private final int id;
    private String name;

    public clash2(int id,String name) {
        this.id = id;
        this.name= name;
    }
    private String validate(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid name.");
        }
        return name;
    }
    public void rename(String newName){
        this.name=validate(newName);
    }
    public void display(){
        System.out.println("Student id: " +id);
        System.out.println("Student name: " +name);
    }
    
    public static void main(String[] args) {
        clash2 c = new clash2(1,"Ajay");
        System.out.println("Student created");
        c.rename("Jensilin");
        c.display();
    }
}
