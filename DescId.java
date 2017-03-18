import java.util.*;

public class DescId implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
    return (s2.getStudentId()-s1.getStudentId());
    }
}