using MediatR;
public class GetCareerByIdHandler : IRequestHandler<GetCareerById, Career>
{
    private readonly ICareerRepository _repository;

    public GetCareerByIdHandler(ICareerRepository repository)
    {
        _repository = repository;
    }
    public async Task<Career> Handle(GetCareerById request, CancellationToken cancellationToken)
    {
        var career = await _repository.GetById(request.Career);
        return career;
    }
}
