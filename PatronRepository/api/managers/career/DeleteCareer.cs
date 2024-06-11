using MediatR;

public class DeleteCareer : IRequest<int>
{
    public Guid Career { get; set; }

    public DeleteCareer(Guid career)
    {
        Career = career;
    }
}