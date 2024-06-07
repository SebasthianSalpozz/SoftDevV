using MediatR;

namespace Project.Business.Careers;


public class GetCareers : IRequest<IList<Career>>
{
    public GetCareers()
    {
    }
}