using FluentValidation;

public class StudentValidator : AbstractValidator<Student>
{
    public StudentValidator()
    {
        RuleFor(x => x.Name).NotEmpty();
        RuleFor(X => X.Name).Length(3, 50);
        RuleFor(x=> x.Name).Matches("^[a-zA-Z]*$");
        RuleFor(x=> x.Lastname).NotEmpty();
        RuleFor(x=> x.Lastname).Length(3, 50);  
        RuleFor(x=> x.Lastname).Matches("^[a-zA-Z]*$");
    }
}