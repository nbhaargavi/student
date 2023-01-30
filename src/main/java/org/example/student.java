import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student {
    Logger l=Logger.getLogger("kitty");
    String name;
    int gradelvl;
    int gpa;
    public Student(String name,int gradelvl,int gpa)
    {
        this.name=name;
        this.gradelvl=gradelvl;
        this.gpa=gpa;
    }
    void update(int update)
    {
        gpa=update;
        l.log(Level.INFO,() ->"The updated GPA is "+gpa);
    }
    void stud()
    {

        l.log(Level.INFO,() ->name+ " has a gpa of "+gpa);
    }
    public static void main(String args[]) throws IOException
    {
        Logger l=Logger.getLogger("kitty");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        l.log(Level.INFO,() ->"Enter student's name");
        var str = br.readLine();
        l.log(Level.INFO,() ->"Enter student's gpa");
        int gpa=Integer.parseInt(br.readLine());
        l.info("Enter student's updated gpa");
        int ugpa=Integer.parseInt(br.readLine());
        Student s1= new Student(str,gpa,ugpa);
        s1.update(ugpa);
        s1.stud();
    }
}

