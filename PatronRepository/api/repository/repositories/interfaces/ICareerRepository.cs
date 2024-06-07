
public interface ICareerRepository: IBaseRepository<Career>
{
    Task<int> GetCareers(Guid idCareer);
}
