using System.Linq.Expressions;
using Microsoft.EntityFrameworkCore;

public abstract class BaseRepository<T> : IBaseRepository<T> where T : class, IEntityBase, new()
{
  protected readonly BaseContext _context;

  protected BaseRepository(BaseContext context)
  {
    _context = context;
  }

  public async Task<int> Create(T entity)
  {
    await _context.Set<T>().AddAsync(entity);
    return await _context.SaveChangesAsync();
  }

  public async Task<int> Delete(T entity)
  {
    _context.Set<T>().Remove(entity);
    return await _context.SaveChangesAsync();
  }

  public void Dispose()
  {
    _context.Dispose();
  }

  public async Task<T> GetById(Guid id)
  {
    return await _context.Set<T>().FirstAsync(entity => entity.Id.Equals(id));
  }

  public async Task<IList<T>> Read(Expression<Func<T, bool>> lambda)
  {
    lambda.Compile();
    return await _context.Set<T>().Where(lambda).ToListAsync();
  }

  public async Task<int> Update(T entity)
  {
    _context.Set<T>().Update(entity);
    return await _context.SaveChangesAsync();
  }
}