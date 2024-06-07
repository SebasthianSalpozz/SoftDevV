using MediatR;

public class PutCareerHandler : IRequestHandler<PutCareer, int>
{
    private readonly ICareerRepository _repository;

    public PutCareerHandler(ICareerRepository repository)
    {
        _repository = repository;
    }
    public async Task<int> Handle(PutCareer request, CancellationToken cancellationToken)
    {
        var modifiedRows = await _repository.Update(request.Career);
        return modifiedRows;
    }
}