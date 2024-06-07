using MediatR;

public class PostCareer : IRequest<Career>
{
public Career Career { get; set; }

public PostCareer(Career career)
{
    Career = career;
}
}