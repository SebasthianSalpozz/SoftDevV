using MediatR;

public class DeleteStudent : IRequest<Student>
{
    public Guid Student { get; set; }

    public DeleteStudent(Guid student)
    {
        Student = student;
    }
}