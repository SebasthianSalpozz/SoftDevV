
using MediatR;

public class SubscribeStudentMiddleData : IRequest<IList<Career>>
{
    public Student Student { get; set; }
    public String CareerCode { get; set; }

    public SubscribeStudentMiddleData(Student student, String careerCode)
    {
        Student = student;
        CareerCode = careerCode;
    }
}