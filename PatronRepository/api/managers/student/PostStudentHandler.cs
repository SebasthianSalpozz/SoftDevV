using MediatR;

public class PostStudentHandler : IRequestHandler<PostStudent, Student>
{
    private readonly IStudentRepository _repository;

    public PostStudentHandler(IStudentRepository repository)
    {
        _repository = repository;
    }

    public async Task<Student> Handle(PostStudent request, CancellationToken cancellationToken)
    {
        var modifiedRows = await _repository.Create(request.Student);
        return modifiedRows;
    }
}
