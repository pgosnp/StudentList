public class Student
{
    private String name;
    private int studentId;
    private int age;

    public Student(String name,int studentId, int age)
    {
        this.name=name;
        this.studentId=studentId;
        this.age=age;
    }

    public String getName()
    {
        return name;   
    }

    public int getStudentId()
    {
        return studentId;   
    }

    public int getAge()
    {
        return age;   
    }

    public void setName(String name)
    {
        this.name=name;   
    }

    public void setStudentId(int studentId)
    {
        this.studentId=studentId;   
    }

    public void setAge(int age)
    {
        this.age=age;   
    }

}
