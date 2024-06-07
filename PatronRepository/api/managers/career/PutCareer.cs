using MediatR;

public class PutCareer : IRequest<int>
{
    public Career Career { get; set; }

    public PutCareer( Career career)
    {
        Career = career;
    }
}