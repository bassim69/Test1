using System;
namespace Test1.Extension.Events
{
    public class LoginEventArgs : EventArgs
    {
        public string Message { get; private set; }

        public LoginEventArgs(string message)
        {
            Message = message;
        }
    }
}
