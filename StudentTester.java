import java.io.*;
import java.util.*;

public class StudentTester
{

    public static void main(String [] args)
    {
        ArrayList <Student> studentList =new ArrayList <Student>();
        System.out.println("Please Enter the filename name: ");
        Scanner keyboard =new Scanner(System.in);
        String fileName = keyboard.nextLine();
        File file=new File(fileName);     
        //         File file=new File("StudentList.txt");       
        Scanner inputFile =null;
        try{ 
            inputFile=new Scanner (file);
            while(inputFile.hasNext()){
                String data = inputFile.nextLine();
                String [] tokens = data.split(":");              

                studentList.add(new Student(tokens[0],Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]))); 

            }

        }
        catch (FileNotFoundException e)
        {System.out.println("The file cannot be found!");}
        finally{if(inputFile !=null)
            {inputFile.close();}
        }

        Collections.sort(studentList,new DescId());
        System.out.println("DescId: ");
        
        for(int i=0;i<studentList.size();i++)
        {System.out.println("The student's name: "+ studentList.get(i).getName());
            System.out.println("The student's id: "+ studentList.get(i).getStudentId());
            System.out.println("The student's age: "+ studentList.get(i).getAge());
            System.out.println();
        }
        
        Collections.sort(studentList,new AscName());
        System.out.println("AscName: ");
        for(int i=0;i<studentList.size();i++)
        {System.out.println("The student's name: "+ studentList.get(i).getName());
            System.out.println("The student's id: "+ studentList.get(i).getStudentId());
            System.out.println("The student's age: "+ studentList.get(i).getAge());
            System.out.println();
        }
        
         Collections.sort(studentList,new DescName());
        System.out.println("DescName: ");
        for(int i=0;i<studentList.size();i++)
        {System.out.println("The student's name: "+ studentList.get(i).getName());
            System.out.println("The student's id: "+ studentList.get(i).getStudentId());
            System.out.println("The student's age: "+ studentList.get(i).getAge());
            System.out.println();
        }
    }
}
