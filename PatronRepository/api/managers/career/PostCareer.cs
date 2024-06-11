using MediatR;

public class PostCareer : IRequest<int>
{
public Career Career { get; set; }

public PostCareer(Career career)
{
    Career = career;
}
}