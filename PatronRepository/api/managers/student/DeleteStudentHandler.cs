using MediatR;

public class DeleteStudentHandler : IRequestHandler<DeleteStudent, Student>
{
    private readonly IStudentRepository _repository;

    public DeleteStudentHandler(IStudentRepository repository)
    {
        _repository = repository;
    }
    public async Task<Student> Handle(DeleteStudent request, CancellationToken cancellationToken)
    {
        var student = await _repository.GetById(request.Student);
        var modifiedRows = await _repository.Delete(student);
        return modifiedRows;
        
    }
}