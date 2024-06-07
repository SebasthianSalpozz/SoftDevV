using MediatR;

public class DeleteCareer : IRequest<Career>
{
    public Guid Career { get; set; }

    public DeleteCareer(Guid career)
    {
        Career = career;
    }
}