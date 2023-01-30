package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class student {
    Logger l=Logger.getLogger("kitty");
    String name;
    int gradelvl;
    int gpa;
    public student(String name,int gradelvl,int gpa)
    {
        this.name=name;
        this.gradelvl=gradelvl;
        this.gpa=gpa;
    }
    void update(int update)
    {
        gpa=update;
        System.out.println("The updated GPA is "+gpa);
    }
    void stud()
    {
        System.out.println(name+ " has a gpa of "+gpa);
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
        student s1= new student(str,gpa,ugpa);
        s1.update(ugpa);
        s1.stud();
    }
}
