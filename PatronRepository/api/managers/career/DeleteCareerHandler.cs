using MediatR;

public class DeleteCareerHandler : IRequestHandler<DeleteCareer, Career>
{
    
    private readonly ICareerRepository _repository;

    public DeleteCareerHandler(ICareerRepository repository)
    {
        _repository = repository;
    }
    public async Task<Career> Handle(DeleteCareer request, CancellationToken cancellationToken)
    {
        var career = await _repository.GetById(request.Career);
        var modifiedRows = await _repository.Delete(career);
        return modifiedRows;
    }
}