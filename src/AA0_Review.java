public class AA0_Review extends World {

    public int sizeoftree;     // This declares a variable of type int named sizeoftree.
    //this makes it so we can use this variable later in the program.

    /**
     * Go() method is called by World -- the Go() method basically tells the program what to do and where and when to do it.
     */

    public void go() {

        plane.pausetime = 0;    // plane.pausetime sets a variable  in the Robot class so it pauses  for that number of milliseconds
        //if pausetime = 1, this means that every single time the robot moves, it pauses for 1 millisecond after it moves.

        sizeoftree = 50;           // Assigns the value of 50 to the variable  sizeoftree - now the variable that we made above, sizeoftree, has a value. We can use this later.

        System.out.println("This will be printed to the  window. " + sizeoftree); // Prints to the lower window
        //we use System.out to tell us information we need to know about each time the progam is run.


        plane.teleport(200, 300);    // Moves plane to the coordinate (200,300) - remember that (0,0) is in the top left of the applet
        plane.house(100);        // uses a method from the Robot class to have plane draw a house of size 100

        /**
         * This part is creating the tree
         */

        plane.teleport(374, 274);//moves the Robot to the coordinate (374,274)
        plane.setColor(0, 220, 0); // uses setColor method from plane to set Color using RGB.

        /*Every color that you see on this screen is made from the three colors, red, green, and blue.
         * The computer sees that each color has 255
         * The numbers, (0,220,0) means that there is a lot of green and absolutely no red or blue.
         */

        plane.fillCircle((int) sizeoftree / 2);    // uses fillCircle method to draw a shaded circle of size 25 because sizeoftree=50
        plane.setColor(10, 120, 10);
        plane.circle((int) sizeoftree / 2);    // (int) gets truncates all decimals  giving you an integer - we used this last time
        plane.teleport(364, 301);
        plane.startingAngle(90);        // Sets the starting angle so plane is pointing down
        plane.trailWidth = 20;            // Sets the planes trailwidth variable to 20;

        plane.setColor(0, 0, 0);
        plane.move(sizeoftree);        // Uses the move method to move forward 50, since line 13 set sizeoftree to 50


        plane.teleport(242, 402);
        plane.trailWidth = 100;

        plane.trailWidth = 20;
        plane.setColor(200, 200, 0);
        plane.move(700);
        plane.teleport(600, 200);
    }
}


/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/