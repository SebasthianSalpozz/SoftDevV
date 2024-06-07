using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using MediatR;
using Microsoft.AspNetCore.Mvc;
using Project.Business.Careers;

[ApiController]
[Route("Project.Api/[controller]")]
public class CareerController: ControllerBase
{
    private readonly IMediator _mediator;

    public CareerController(IMediator mediator)
    {
        _mediator = mediator;
    }
    
    [HttpGet] 
    public async Task<IActionResult> GetCareer()
    {
        var contract = new GetCareers();
        var careers = await _mediator.Send(contract);
        return Ok(careers);
    }
    
    [HttpGet("{careerId}")]
    public async Task<IActionResult> GetCareerById([Required]Guid careerId)
    {
        var contract = new GetCareerById(careerId);
       
        var career = await _mediator.Send(contract);
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