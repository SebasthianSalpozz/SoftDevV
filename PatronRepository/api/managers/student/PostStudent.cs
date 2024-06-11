using MediatR;

public class PostStudent : IRequest<int>
{
    public Student Student { get; set; }

    public PostStudent(Student student)
    {
        Student = student;
    }
}