import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

// 2. This is a comment, Lab Partner - none (missed recitation)
  /* multiline comment
 
   */
  // Name: Tyler Youk

public class MaxWindow extends JFrame {  
  
  //Task 4.
  //snaps window to the top of the screen; keeps horizontal location
  public void snapToTop(){
    this.setLocation(this.getX(), 0);
  }
  //snaps window to the left of the screen
  public void snapToLeft(){
    this.setLocation(0, this.getY());
  }
  
  //Task 6. + 7. using Toolkit, incorporating originalHeight and heightMaximized;
  private int originalHeight = 0;
  private boolean heightMaximized = false;
  Toolkit kit = Toolkit.getDefaultToolkit();
  
  //method to move frame to top of screen and make it the maximum height //Task 6 + Task 7
  //passing in a boolean to see whether or not we want to maximize the height - maximizeHeight(true) == maximize the height
  //this is so that the opposite takes effect, maximizeHeight(false) == restore original height
  public void maximizeHeight(boolean boolTest){
    if (boolTest == true && heightMaximized == false) {
      originalHeight = this.getHeight(); //Store the current height of the window to the field originalHeight.
      this.snapToTop(); //snaps to top of screen
      Dimension d = kit.getScreenSize();
      this.setSize(this.getWidth(), (int)d.height); //maximize the window  
      heightMaximized = true; //set the heightMaximized field to true
    }
    else if (boolTest == false && heightMaximized == true) {
      this.setSize(this.getWidth(), originalHeight); //Set the window height to be the value stored in the originalHeight field while keeping the width the same.
      heightMaximized = false; //Set the heightMaximized field to store false.
    }
    else {
      return; 
    }
  }
  
  //moves frame to left of screen and makes it the maximum width.
  public void maximizeWidth(){
    this.snapToLeft(); //snaps to top of screen
    Dimension d = kit.getScreenSize();
    this.setSize((int)d.width, this.getHeight()); //makes it maximum height  
  }
  
  
  
  
  //NOT USING
  // below are all Course Work, to help me with syntax
  //(extra methods)
  public void transpose() {
    this.setSize(this.getHeight(), this.getWidth());
  }
  
  /* Scale the size of the window by a scaling factor */
  public void scale(double factor) {
    this.setSize((int)(this.getWidth() * factor), (int)(this.getHeight() * 
factor));
  }
  
  /* Determine if this window has the same area as the input window */
  public boolean sameAreaAs(JFrame frame) {
    return (frame.getWidth() * frame.getHeight()) == (this.getWidth() * this.getHeight());
  }
  //till here
 
}
  


