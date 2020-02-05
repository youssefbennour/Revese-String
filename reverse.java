public class reverse
{
    public static void main(String[] args) {
        String result = reverse("kalb");
        System.out.println(result);
    }

    public static String reverse(String s)
    {
        char [] letters = new char[s.length()];
        int ref = 0;
        for(int i = s.length() - 1; i >= 0; i--)
        {
            letters[ref] = s.charAt(i);
            ref++;
        }

        String name = " ";

        for(int i = 0; i < s.length(); i++)
        {
            name += letters[i];
        }
        return name;
    }

}