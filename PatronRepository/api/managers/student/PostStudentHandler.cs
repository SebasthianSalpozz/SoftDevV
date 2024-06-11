using MediatR;

public class PostStudentHandler : IRequestHandler<PostStudent, int>
{
    private readonly IStudentRepository _repository;

    public PostStudentHandler(IStudentRepository repository)
    {
        _repository = repository;
    }

    public async Task<int> Handle(PostStudent request, CancellationToken cancellationToken)
    {
        var modifiedRows = await _repository.Create(request.Student);
        return modifiedRows;
    }
}
