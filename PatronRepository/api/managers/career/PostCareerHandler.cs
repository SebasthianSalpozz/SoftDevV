using MediatR;

public class PostCareerHandler : IRequestHandler<PostCareer, int>
{
    private readonly ICareerRepository _repository;

    public PostCareerHandler(ICareerRepository repository)
    {
        _repository = repository;
    }
        
    public async Task<int> Handle(PostCareer request, CancellationToken cancellationToken)
    {
        var modifiedRows = await _repository.Create(request.Career);
        return modifiedRows;
    }
}