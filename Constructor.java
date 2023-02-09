class SetGet{


    private String name;
    private int id;

    SetGet(String name){
        this.name = name;
    }

    SetGet(int id,String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println(id + " " + name);
    }
}

public class Constructor {


    public static void main(String[] args) {

        SetGet sg1 = new SetGet("Harshith");
        sg1.display();
        SetGet sg = new SetGet(1,"Harshith");
        sg.display();
        sg.setName("Harshith");
        System.out.println(sg.getName());

    }
}
