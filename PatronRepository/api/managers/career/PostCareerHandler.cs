using MediatR;

public class PostCareerHandler : IRequestHandler<PostCareer, Career>
{
    private readonly ICareerRepository _repository;

    public PostCareerHandler(ICareerRepository repository)
    {
        _repository = repository;
    }
        
    public async Task<Career> Handle(PostCareer request, CancellationToken cancellationToken)
    {
        var modifiedRows = await _repository.Create(request.Career);
        return modifiedRows;
    }
}