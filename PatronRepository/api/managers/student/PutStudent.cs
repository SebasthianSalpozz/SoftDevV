using MediatR;


public class PutStudent : IRequest<int>
{
    public Student Student { get; set; }

    public PutStudent( Student student)
    {
        Student = student;
    }
}