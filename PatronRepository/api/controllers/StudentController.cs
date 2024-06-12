using System.ComponentModel.DataAnnotations;
using AutoMapper;
using MediatR;
using FluentValidation;
using Microsoft.AspNetCore.Mvc;

[ApiController]
[Route("[controller]")]
public class StudentController : ControllerBase
{
  private readonly IMediator _mediator;
  private readonly IMapper _mapper;
  private readonly IValidator<Student> _validator;

  public StudentController(IMediator mediator, IMapper mapper, IValidator<Student> validator)
  {
    _mediator = mediator;
    _mapper = mapper;
    _validator = validator;
  }

  [HttpGet("idStudent")]
  public async Task<IActionResult> Get([Required] Guid idStudent)
  {
    var contract = new GetStudentMiddleData(idStudent);
    var middleResponse = await _mediator.Send(contract);
    var student = _mapper.Map<StudentDTO>(middleResponse);

    return Ok(student);
  }

  [HttpGet, Route("careers/idStudent")]
  public async Task<IActionResult> GetCareersPerStudent([Required] Guid idStudent)
  {
    var contract = new GetCareersPerStudentMiddleData(idStudent);
    var middleResponse = await _mediator.Send(contract);
    var careers = _mapper.Map<IList<CareerDTO>>(middleResponse);

    return Ok(careers);
  }

  [HttpPost, Route("subscribe")]
  public async Task<IActionResult> Post([Required] String careerCode, StudentDTO studentDTO)
  {
    var student = _mapper.Map<Student>(studentDTO);
    var result = await _validator.ValidateAsync(student);

    if (!result.IsValid)
    {
      return BadRequest(result.Errors);
    }

    var contract = new SubscribeStudentMiddleData (student, careerCode);
    var middleResponse = await _mediator.Send(contract);
    var careers = _mapper.Map<IList<CareerDTO>>(middleResponse);
    return Ok(careers);
  }


  [HttpPost]
  public async Task<IActionResult> Post([FromBody] StudentDTO studentDTO)
  {
    var student = _mapper.Map<Student>(studentDTO);
    var result = await _validator.ValidateAsync(student);

    if (!result.IsValid)
    {
      return BadRequest(result.Errors);
    }

    var contract = new PostStudent (student);
    var middleResponse = await _mediator.Send(contract);
    var createStatus = _mapper.Map<int>(middleResponse);
    return Ok(createStatus);

  }

  [HttpPut]
  public async Task<IActionResult> Put([FromBody] Student student)
  {
    var contract = new PutStudent(student);
    var response = await _mediator.Send(contract);
    return Ok(response);
  }

  [HttpDelete("{Id}")]
  public async Task<IActionResult> Delete([Required] Guid id)
  {
    var contract = new DeleteStudent(id);
    var response = await _mediator.Send(contract);
    return Ok(response);
  }
}
