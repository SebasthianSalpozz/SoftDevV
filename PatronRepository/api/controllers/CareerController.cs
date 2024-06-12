using System.ComponentModel.DataAnnotations;
using AutoMapper;
using MediatR;
using Microsoft.AspNetCore.Mvc;
using FluentValidation;

[ApiController]
[Route("Project.Api/[controller]")]
public class CareerController: ControllerBase
{
    private readonly IMediator _mediator;
    private readonly IMapper _mapper;

    private readonly IValidator<Career> _validator;

    public CareerController(IMediator mediator, IMapper mapper, IValidator<Career> validator)
    {
        _mediator = mediator;
        _mapper = mapper;
        _validator = validator;
    }
    
    // [HttpGet] 
    // public async Task<IActionResult> GetCareer()
    // {
    //     var contract = new GetCareers();
    //     var careers = await _mediator.Send(contract);
    //     return Ok(careers);
    // }
    
    [HttpGet("{careerId}")]
    public async Task<IActionResult> GetCareerById([Required]Guid careerId)
    {
        var contract = new GetCareerById(careerId);
       
        var career = await _mediator.Send(contract);
        var response = _mapper.Map<CareerDTO>(career);
        return Ok(career);
    }

    [HttpPost]
    public async Task<IActionResult> PostCareer([Required] Career career)
    {
        var contract = new PostCareer(career);
        var response = await _mediator.Send(contract);
        return Ok(response);

    }
   
    [HttpPut]
    public async Task<IActionResult> PutCareer([Required] Career career)
    {
        var contract = new PutCareer(career);
        var response = await _mediator.Send(contract);
        return Ok(response);
    }
   
    [HttpDelete("{careerId}")]
    public async Task<IActionResult> DeleteStudentById([Required] Guid careerId)
    {
        var contract = new DeleteCareer(careerId);
        var response = await _mediator.Send(contract);
        return Ok(response);
    }
}