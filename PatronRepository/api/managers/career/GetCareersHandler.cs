using MediatR;

namespace Project.Business.Careers;

public class GetCareersHandler : IRequestHandler<GetCareers, IList<Career>>
{
    private readonly ICareerRepository _repository;

    public GetCareersHandler(ICareerRepository repository)
    {
        _repository = repository;
    }
    
    public async Task<IList<Career>> Handle(GetCareers request, CancellationToken cancellationToken)
    {
        var careers = await _repository.Read(career => true);
        return careers;
    }
}