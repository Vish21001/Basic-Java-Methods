public boolean allSameLetter(String str)
{
    boolean result = true;
    for(int i = 0; i <str.length(); i++)
    {
        char x = str.charAt(i);
        char first = str.charAt(0);
        
        if(x != first)
        {
            result=false;
        }
    }
    return result;
}
