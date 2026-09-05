public class ClassesAndObjects {
    public static void main(String[] args){
        /// pen
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        /// Student
        Student S1 = new Student();
        S1.setName("baliram");
        System.out.println(S1.name);
        S1.name ="Trupti";
        System.out.println(S1.name);
        S1.age = 19;
        System.out.println(S1.name +" " + S1.age);
    }
}

class Pen{
    //properties + functions
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip =  newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;
    void setName(String Newname){
        name = Newname;
    }
    void calculatepercentage(int phy , int chem,int math){
        percentage = (phy+chem+math)/3;
    }
}



class BankAccount{
 public String Username;
 private String password;
}
