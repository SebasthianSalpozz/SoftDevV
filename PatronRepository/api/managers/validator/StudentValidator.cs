using FluentValidation;

public class StudentValidator : FluentValidation.AbstractValidator<Student>
{
    public StudentValidator()
    {
        RuleFor(x => x.Name)
            .NotEmpty()
            .WithMessage("The name is not empty")
            .MinimumLength(3)
            .WithMessage("The minimum lenght is 3")
            .MaximumLength(50)
            .WithMessage("The maximum lenght is 50")
            .Must(x => x.All(char.IsLetter))
            .WithMessage("The Name recive only letters");

        RuleFor(x => x.Lastname)
                    .NotEmpty()
                    .WithMessage("The name is not empty")
                    .MinimumLength(3)
                    .WithMessage("The minimum lenght is 3")
                    .MaximumLength(50)
                    .WithMessage("The maximum lenght is 50")
                    .Must(x => x.All(char.IsLetter))
                    .WithMessage("The Name recive only letters");

    }
}