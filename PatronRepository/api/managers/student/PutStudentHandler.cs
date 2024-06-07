using MediatR;

public class PutStudentHandler : IRequestHandler<PutStudent, int>
{
    private readonly IStudentRepository _repository;

    public PutStudentHandler(IStudentRepository repository)
    {
        _repository = repository;
    }
    public async Task<int> Handle(PutStudent request, CancellationToken cancellationToken)
    {
        var modifiedRows = await _repository.Update(request.Student);
        return modifiedRows;
    }
}