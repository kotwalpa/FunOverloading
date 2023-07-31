public class Function
{
    public void ShowFun()
    {
        System.out.println("____Fun Called____");
    }
    public int AddFun(int a,int b)
    {
        System.out.println("AddFun...=" +(a+b));
        return a+b;
    }
    public float SubFun(float a,float b,float c)
    {
        System.out.println("AddFun...=" +(a-b-c));
        return a-b-c;
    }
    public int MulFun(int p,int q)
    {
        System.out.println("AddFun...=" +(p*q));
        return p*q;
    }
    public static void main(String[] args)
    {
        Function f1 = new Function();
        f1.AddFun(2,2);
        f1.SubFun(9,8,3);
        f1.MulFun(3,3);
    }
}
