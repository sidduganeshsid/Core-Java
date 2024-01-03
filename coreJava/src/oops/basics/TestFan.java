package oops.basics;


class Fan
{
    float cost;
    String brand;
    int noOfWings;
}


public class TestFan {
    public static void main(String[] args) {
        Fan[] f = new Fan[3];
        f[0] = new Fan();
        f[1] = new Fan();
        f[2] = new Fan();
        f[3] = new Fan();//bufferOverRun problem
        //line 18 error:ArrayIndexOutOfBoundsException
    }
}
