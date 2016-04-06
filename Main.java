//TODO: <name>
//TODO: <date>
//Practice 2015 - 05: You Wouldn’t Like Me When I’m Angry

public class Main {
  public static void main(String[] args) {
    int iterations = 0;
    boolean working = true;
    String num = "986";
    while(iterations < 1000&&working)
    {
    String[] test = split(num);
    int sum = 0;
    for(int i = 0; i < test.length; i++)
        sum+=squareInt(test[i]);
    if(sum<100)
        if(sum<50)
        {
            System.out.println("QUASI-SAD: "+(iterations+1));
            working = false;
        }
        else{
            System.out.println("QUASI-HAPPY: "+(iterations+1));
            working = false;
        }
        iterations++;
        num = ""+sum;
    }
    if(working)
            System.out.println("LONG");
    System.exit(0);
  }
  public static int squareInt(String num)
  {
    return(Integer.parseInt(num)*Integer.parseInt(num));
  }
  public static String[] split(String num)
  {
    String[] result = new String[(num.length()+1)/2];
    if(num.length()%2 == 0)
    for(int i = 0; i < result.length; i++)
    {
        result[i] = num.substring(2*i,2*i+2);
    }
    else{
        result[0] = num.substring(0,1);
    for(int i = 1; i < result.length; i++)
    {
        result[i] = num.substring(2*i-1,2*i+1);
    }
    }
    return(result);
  }
}
