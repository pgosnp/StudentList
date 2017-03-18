import java.util.Comparator;

public class AscId implements Comparator<Student>
{
    
    public int compare(Student s1,Student s2)
    {
    return (s1.getStudentId()-s2.getStudentId());
    }
}
