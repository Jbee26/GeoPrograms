
import java.io.*;
public class FindSquare extends World
{

	public int red;
	public int blue;
	public int green;
	public int count;

	public void go()
	{
   
		plane.pausetime=0;
		plane.teleport(0,0);
		plane.showBackGround();
		System.out.println(plane.howMuchRed());

		plane.isTrail=true;


		for(int row=0; row<plane.backGroundHeight; row++)
		{
		  for(int col=0; col<plane.backGroundWidth; col++)
		  {
				plane.teleport(col,row);
				red   =171;// plane.howMuchRed();
				green = plane.howMuchGreen();
				blue  = plane.howMuchBlue();

			//	if(row<plane.backGroundHeight-100&& col< plane.backGroundWidth-100)
				{

					if(red==plane.howMuchRed(col+150,row)&&red==plane.howMuchRed(col+150,row+150)&&red==plane.howMuchRed(col,row+150))
					{
						System.out.println("thisis how many red dots "+count);
						plane.setPixelColor(200,0,0);
						plane.square(150);
						count++;

					}
				}
			}
		}

	}


}
