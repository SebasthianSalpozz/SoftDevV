using Microsoft.AspNetCore.Mvc;

public interface ILogHandler : IDisposable
{
  void Log(Severity severity, string message);
    IActionResult Log(Severity eRROR, List<string> list);
}