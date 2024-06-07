// using MediatR;

// public class SubscribeStudentToCareerHandler : IRequest<int>
// {
//    private readonly IStudentRepository _repository;

//     public SubscribeStudentToCareerHandler(IStudentRepository repository)
//     {
//         _repository = repository;
//     }

//     public async Task<int> Handle(PostStudent request, CancellationToken cancellationToken)
//     {
//         var modifiedRows = await _repository.Create(request.Student, request.CareerId);
//         return modifiedRows;
//     }
// }