using System.Linq.Expressions;

public interface IBaseRepository<T> : IDisposable where T : IEntityBase, new() 
{
  Task<T> Create(T entity);
  Task<int> Update(T entity);
  Task<T> Delete(T entity);
  Task<IList<T>> Read(Expression<Func<T, bool>> lambda);
  Task<T> GetById(Guid id); 
}
