public boolean passwordCheck(String password)
{
    boolean functionalPassword = false;
    
    if(password.length() >= 8)
    {
        for(int i = 0; i < password.length(); i++)
        {
            char x = password.charAt(i);
            boolean isNumber = Character.isDigit(x);
            boolean isLetter = Character.isLetter(x);
            if(isNumber || isLetter)
            {
                functionalPassword = true;
            }
            else if(!isNumber || !isLetter)
            {
                functionalPassword = false;
                break;
            }
        }
    }
    else
    {
        functionalPassword = false;    
    }
    return functionalPassword;
    
}
