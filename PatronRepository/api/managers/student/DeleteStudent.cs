using MediatR;

public class DeleteStudent : IRequest<int>
{
    public Guid Student { get; set; }

    public DeleteStudent(Guid student)
    {
        Student = student;
    }
}