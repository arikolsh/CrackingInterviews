package testingmisc;

public class OuterClass {

    public void doo(){
        InnerPrivateClass a = new InnerPrivateClass();
        a.val ++;
    }

    public static void doooo(){
       // InnerPrivateClass a = new InnerPrivateClass(); //wont compile

    }

    private class InnerPrivateClass{
        int val;
    }

}
