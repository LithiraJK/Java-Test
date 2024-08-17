public class StringFormatting {
    public static void main(String[] args) {
    String str = "Ada nam mara kammali lamai. api next week ekema oop karamu.. ";
     String s = String.format("%300s", str);
   
     //System.out.println(s);
 
 
    String name = "Jason Staitham";
    int age = -56;
    float salary = 150000.58799f;
    int cid = 1;
 
 
    System.out.println("Name ="+name + "Age = "+ age+ "Salary = "+salary+ "ID = "+cid);
 
 
   System.out.printf("ID : C%03d, Name : %s , Age : %d, Salary : %,.3f",cid,name,age,salary);
 }
 }
 