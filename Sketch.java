import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    
    draw_section2();

    draw_section3();
    draw_section4();
    
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
    
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 300 / 30;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 3 + 300 + intColumn * 300 / 30; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }

  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int twoX = 0;
  int twoY = 0;

  for(int twoRow = 0; twoRow < 30; twoRow++)
  { 
  for(int twoColumn = 0; twoColumn < 30; twoColumn++)
  {
  twoX = 3 + 300 + twoRow * 300 / 30;
  twoY = 3 + 300 + twoColumn * 300 / 30;

  if(twoRow % 2 == 0)
  {
    fill(255);
    noStroke();
    rect(twoX, twoY, 5, 5);
  } else {
    fill(0);
    noStroke();
    rect(twoX, twoY, 5, 5);
    }
    }
  }

  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

    int threeX = 0;
  int threeY = 0;
  for(int threeRow = 0; threeRow < 30; threeRow++)
  { 
  for(int threeColumn = 0; threeColumn < 30; threeColumn++)
  {
  threeX = 3 + 600 + threeRow * 300 / 30;
  threeY = 3 + 300 + threeColumn * 300 / 30;

  if(threeColumn % 2 == 0)
  {
    fill(255);
    noStroke();
    rect(threeX, threeY, 5, 5);
  } else {
    fill(0);
    noStroke();
    rect(threeX, threeY, 5, 5);
    }
    }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){

    int fourX = 0;
  int fourY = 0;
  for(int fourRow = 0; fourRow < 30; fourRow++)
  { 
  for(int fourColumn = 0; fourColumn < 30; fourColumn++)
  {
  fourX = 3 + 900 + fourRow * 300 / 30;
  fourY = 3 + 300 + fourColumn * 300 / 30;

  if(fourColumn % 2 <= 0 && fourRow % 2 == 0)
  {
    fill(255);
    noStroke();
    rect(fourX, fourY, 5, 5);
  } else {
    fill(0);
    noStroke();
    rect(fourX, fourY, 5, 5);
    }
    }
    }

  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

    int fiveX = 0;
  int fiveY = 0;
  int fiveRows = 0;
  int fiveColumns = 0;

  for(int fiveColumn = 30; fiveColumn > fiveColumns; fiveColumn--)
    {
  for(int fiveRow = 30; fiveRow > fiveRows; fiveRow--)
    {
      fiveX = 3 - 10 + fiveRow * 300 / 30;
      fiveY = 3 + fiveColumn * 300 / 30;

      fill(255);
      noStroke();
      rect(fiveX, fiveY, 5, 5);
    }
    fiveRows += 1;
    }
  }

  public void draw_section6(){

    int sixX = 0;
  int sixY = 0;
  int sixRows = 30;
  int sixColumns = 0;

  for(int sixColumn = 30; sixColumn > sixColumns; sixColumn--)
    {
    for(int sixRow = 0; sixRow < sixRows; sixRow++)
      {
        sixX = 3 + 300 + sixRow * 300 / 30;
        sixY = 3 - 10 + sixColumn * 300 / 30;
        fill(255);
        noStroke();
        rect(sixX, sixY, 5, 5);
      }
      sixRows -= 1;
    }
  }

  public void draw_section7(){

    int sevenX = 0;
    int sevenY = 0;
    int sevenRows = 30;
    int sevenColumns = 30;

    for(int sevenColumn = 0; sevenColumn < sevenColumns; sevenColumn++){
      for(int sevenRow = 0; sevenRow < sevenRows; sevenRow++)
        {
          sevenX = 3 + 600 + sevenRow * 300 / 30;
          sevenY = 3 + sevenColumn * 300 / 30;
          fill(255);
          noStroke();
          rect(sevenX, sevenY, 5, 5);

        }
        sevenRows -= 1;

      
    }
  }
  
  public void draw_section8(){

  int eightX = 0;
  int eightY = 0;
  int eightRows = 0;
  int eightColumns = 30;

  for(int eightColumn = 0; eightColumn < eightColumns; eightColumn++)
    {
    for(int eightRow = 30; eightRow > eightRows; eightRow--)
      {
        eightX = 3 - 10 + 900 + eightRow * 300 / 30;
        eightY = 3 + eightColumn * 300 / 30;
        fill(255);
        noStroke();
        rect(eightX, eightY, 5, 5);
      }
      eightRows += 1;
    }




    
  }

}
