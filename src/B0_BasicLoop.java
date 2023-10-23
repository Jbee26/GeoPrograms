public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        for(int x=0;x<5;x=x+1)
        {
            System.out.println(x);
            plane.square(100);

        }
    }
}
