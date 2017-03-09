package Condition;
/**
* Определение положения точки
* @author dlukyanchuk
* @since 13.02.2017
* @version 1
*/
public class Pointis {
   private int x;
   private int y;
 
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
  
  	public int getX() {
      		return this.x;
  }
 
  	public int getY() {
     		return this.y;
  }
	public boolean is(int a, int b) {
    return a*this.x + b -this.y == 0; 
}
}