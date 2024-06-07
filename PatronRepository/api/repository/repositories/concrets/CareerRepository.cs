

public class CareerRepository : BaseRepository<Career>, ICareerRepository
{
    public CareerRepository(BaseContext context) : base(context)
    {
    }

    public Task<int> GetCareers(Guid idCareer)
    {
        throw new NotImplementedException();
    }
}