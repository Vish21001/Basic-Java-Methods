public String doubleVowel(String str)
{
    String vowels = "aeiouAeiou";
    String result = "";
    for(int i = 0; i < str.length(); i++)
    {
        char x = str.charAt(i);
        result += x;
        
        if(vowels.indexOf(x) != -1)
        {
            result += x;
        }
    }
    return result;
}
