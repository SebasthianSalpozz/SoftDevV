using MediatR;

public class GetCareerById : IRequest<Career>
{
    public Guid Career { get; set; }

    public GetCareerById(Guid career)
    {
        Career = career;
    }
}