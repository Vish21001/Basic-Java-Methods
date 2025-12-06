public class Echo extends ConsoleProgram
{
    public void run()
    {
        echo("Anybody home?", readInt("Input how many times to echo."));
    }

    private void echo(String text, int numTimes)
    {
        for(int i = 0; numTimes > 0; numTimes--)
        {
            System.out.println(text);
        }
    }
}
