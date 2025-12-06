public String altCase(String text)
{
    String result = "";
    boolean isUpperCase = true;
    for(int i =0; i < text.length(); i++)
    {
        char x = text.charAt(i);
        
        if(isUpperCase)
        {
            result += Character.toUpperCase(x);
        }
        else
        {
            result += Character.toLowerCase(x);
        }
        isUpperCase = !isUpperCase;
    }
    return result;
}
