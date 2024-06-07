using MediatR;

public class PostStudent : IRequest<Student>
{
    public Student Student { get; set; }

    public PostStudent(Student student)
    {
        Student = student;
    }
}