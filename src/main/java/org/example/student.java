package org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class student {
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

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter student's name");
        var str = br.readLine();
        System.out.println("Enter student's gpa");
        int gpa=Integer.parseInt(br.readLine());
        System.out.println("Enter student's updated gpa");
        int ugpa=Integer.parseInt(br.readLine());
        student s1= new student(str,gpa,ugpa);
        s1.update(ugpa);
        s1.stud();
    }
}

