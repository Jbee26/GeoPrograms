public class B5_PastaFilter extends World {

    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());
        plane.pausetime=0;

        for (int row = 340; row < 800; row = row + 1) { ///part 1 of filter
            for (int col = 122; col < 365; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red <= 255 && green <= 188 && blue <= 85)

                {
                    plane.setPixelColor(red / 2, 0, 128);
                }

            }

        }

        for (int row = 400; row < 800; row = row + 1) {/// pt 2
            for (int col = 360; col < 600; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red <= 255 && green <= 188 && blue <= 92) {
                    plane.setPixelColor(red / 2, 0, 128);
                }

            }

        }


        for (int row = 289; row < 800; row = row + 1) {///pt3
            for (int col = 570; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red <= 255 && green <= 195 && blue <= 92) {
                    plane.setPixelColor(red / 2, 0, 128);
                }

            }

        }


        for (int row = 305; row < 481; row = row + 1) { //collar filter
            for (int col = 307; col < 580; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red <= 30 && green <= 35 && blue <= 25) {
                    plane.setPixelColor(red / 2, 0, 128);
                }

            }

        }

        for (int row = 500; row < 900; row = row + 1) {// orange "B"
            for (int col = 370; col < 700; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red < 150 && green < 150 && blue < 150) {
                    plane.setPixelColor(255, 100, 0);
                }


//

            }
        }

/// all other items
        for (int x = 1; x<=2; x++)
        {
            plane.teleport(100, 200*x);
            candyTreat();

        }
       for (int y = 1; y<=2; y++){
           plane.teleport(800,200*y);
           candyTreat();
       }

        pictureFrame();

    }

    public void candyTreat() {

        plane.trailWidth=20;
        plane.setColor(plane.random(0,255), plane.random(0,255), 0);
        plane.startingAngle(90);
        plane.circle(1);
        plane.startingAngle(220);
        plane.move(75);
        plane.startingAngle(90);
        plane.move(75);
        plane.startingAngle(315);
        plane.move(75);
        plane.isTrail=false;
        plane.startingAngle(0);
        plane.move(120);
        plane.startingAngle(90);
        plane.move(35);
        plane.isTrail=true;
        plane.startingAngle(315);
        plane.move(75);
        plane.startingAngle(90);
        plane.move(75);
        plane.startingAngle(220);
        plane.move(75);


    }

    public void pictureFrame() {

        plane.teleport(0, 0);
        plane.startingAngle(0);
        plane.setColor(0, 0, 0);
        plane.move(980);
        plane.turn(270);
        plane.setColor(255, 215, 0);
        plane.move(780);
        plane.turn(270);
        plane.setColor(0, 0, 0);
        plane.move(980);
        plane.turn(270);
        plane.setColor(255, 215, 0);
        plane.move(790);


    }

    }

