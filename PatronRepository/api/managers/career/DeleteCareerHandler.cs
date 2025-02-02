using MediatR;

public class DeleteCareerHandler : IRequestHandler<DeleteCareer, int>
{
    
    private readonly ICareerRepository _repository;

    public DeleteCareerHandler(ICareerRepository repository)
    {
        _repository = repository;
    }
    public async Task<int> Handle(DeleteCareer request, CancellationToken cancellationToken)
    {
        var career = await _repository.GetById(request.Career);
        var modifiedRows = await _repository.Delete(career);
        return modifiedRows;
    }
}