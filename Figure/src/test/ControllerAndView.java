package test;

public class ControllerAndView {
	public static void createShape(Shape shape){
		  switch(shape.type){
		    case "LeftBottomCathetus":  
		      createLeftBottomCathetusTriangle(shape);
		      break;
		    case "RightBottomCathetus": 
		      createRightBottomCathetusTriangle(shape);
		      break;
		    case "LeftTopCathetus": 
		      createLeftTopCathetusTriangle(shape);
		      break;
		    case "RightTopCathetus": 
		    	createRigthTopCathetusTriangle(shape);
		      break;
		    case "Rectangle": 
		      createRectangle(shape);		    	
		      break;
		    case "RightRight": 
			      createRightRight(shape);		    	
			      break;
		    case "RightLeft": 
			      createRightLeft(shape);		    	
			      break;
		    case "LeftLeft": 
			      createLeftLeft(shape);		    	
			      break;
		    case "LeftRight": 
			      createLeftRight(shape);		    	
			      break;
		    case "RightRectangleRight": 
			      createRightRectangleRight(shape);		    	
			      break;
		    case "RightRectangleLeft": 
			      createRightRectangleLeft(shape);		    	
			      break;
			      
		    case "LeftRectangleLeft": 
			      createLeftRectangleLeft(shape);		    	
			      break;
			      
		    case "LeftRectangleRight": 
			      createLeftRectangleRight(shape);		    	
			      break;
			      
		    case "RightBottomLeftBottom": 
			      createRightBottomLeftBottom(shape);		    	
			      break;
			     
		    case "RightBottomRectangleLeftBottom": 
			      createRightBottomRectangleLeftBottom(shape);		    	
			      break;
			      
		    case "Tree": 
			      createTree(shape);		    	
			      break;
			      
		    case "Rocket": 
			      createRocket(shape);		    	
			      break;
			      
		    case "Car": 
			      createCar(shape);		    	
			      break;
		   
		    }
		  }
		  public static void drawPass() {
		      System.out.println("_________________");
		  }
		  private static void drawShifts(int shifts){   
			    for(int i = 0; i < shifts; i++){
			      System.out.print(" ");
			    }
			  }
		  private static void drawDotsLine(int line, String dot){   
		    for(int j = 0; j < line + 1; j++){
		      System.out.print(dot);  
		    }
		  } 
		  
		 //I рівень
		  
		  private static void createLeftBottomCathetusTriangle(Shape shape){   
		    for(int i = 0; i < shape.lines; i++){    
		      drawShifts(shape.shift);  
		      drawDotsLine(i, shape.dot);  
		      System.out.println();
		    }
		  }
		  private static void createRightBottomCathetusTriangle(Shape shape){   
		    for(int i = 0; i < shape.lines; i++){   
		      drawShifts(shape.shift); 
		      drawDotsLine(shape.lines - i - 1, " "); 
		      drawDotsLine(i, shape.dot);  
		      System.out.println();
		    }
		  }
		  static void createLeftTopCathetusTriangle(Shape shape){
			  for(int i = shape.lines; i > 0; i--){   
				  drawShifts(shape.shift);  
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			    }
		  }
		  static void createRigthTopCathetusTriangle(Shape shape){
			  for(int i = shape.lines; i > 0 ; i--){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines - i, " "); 
			      drawDotsLine(i-1, shape.dot); 
			      System.out.println();
			    }
		  }
		  static void createRectangle(Shape shape){
			  for(int i = 0; i<shape.lines; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines-1,shape.dot); 
			      System.out.println();
			    }
		  }
		  
		  //ІІ рівень
		  
		  static void createRightRight(Shape shape){   
			    for(int i = 0; i < shape.lines; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(i, shape.dot);  
			      System.out.println();
			    }
			   for(int i = shape.lines-1; i > 0; i--){   
				  drawShifts(shape.shift);  
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			    }
		  }
		  static void createRightLeft(Shape shape){ 
			  for(int i = 0; i < shape.lines; i++){    
			      drawShifts(shape.shift+1);  
			      drawDotsLine(i, shape.dot);  
			      System.out.println();
			    }
			  for(int i = shape.lines-1; i > 0 ; i--){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines - i, " "); 
			      drawDotsLine(i - 1, shape.dot); 
			      System.out.println();
			    }
		  }
		  static void createLeftLeft(Shape shape){ 
			  for(int i = 0; i < shape.lines; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines - i - 1, " "); 
			      drawDotsLine(i, shape.dot);  
			      System.out.println();
			    }
			  for(int i = shape.lines-1; i > 0 ; i--){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines - i, " "); 
			      drawDotsLine(i - 1, shape.dot); 
			      System.out.println();
		      }
		  }
		  static void createLeftRight(Shape shape){ 
			  for(int i = 0; i < shape.lines; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines - i - 1, " "); 
			      drawDotsLine(i, shape.dot);  
			      System.out.println();
			    }
			  for(int i = shape.lines-1; i > 0; i--){   
				  drawShifts(shape.shift+1);  
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			  }
		  }
		  
		  //ІІ рівень з прямокутником
		  
		  static void createRightRectangleRight(Shape shape){
			  for(int i = 0; i < shape.lines; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			    }
			  for(int i = 0; i<shape.lines; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines-1,shape.dot); 
			      System.out.println();
			    }
			  for(int i = shape.lines-1; i > 0; i--){   
				  drawShifts(shape.shift);  
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			    }
			  
		  }
		  static void createRightRectangleLeft(Shape shape){
			  for(int i = 0; i < shape.lines; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			    }
			  for(int i = 0; i<shape.lines; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines-1,shape.dot); 
			      System.out.println();
			    }
			  for(int i = shape.lines-1; i > 0 ; i--){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines - i-1, " "); 
			      drawDotsLine(i - 1, shape.dot); 
			      System.out.println();
			    }
			  
		  }
		  
		  static void createLeftRectangleLeft(Shape shape){
			  for(int i = 0; i < shape.lines; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines - i - 1, " "); 
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			    }
			  for(int i = 0; i<shape.lines; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines-1,shape.dot); 
			      System.out.println();
			    }
			  for(int i = shape.lines-1; i > 0 ; i--){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines - i-1, " "); 
			      drawDotsLine(i-1, shape.dot); 
			      System.out.println();
			    }
			}
		  
		  static void createLeftRectangleRight(Shape shape){
			  for(int i = 0; i < shape.lines; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines-i-1, " "); 
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			    }
			  for(int i = 0; i<shape.lines; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines-1,shape.dot); 
			      System.out.println();
			    }
			  for(int i = shape.lines-1; i > 0; i--){   
				  drawShifts(shape.shift);  
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			    }
			}
		  
		  //ІІІ рівень
		  
		  static void createRightBottomLeftBottom(Shape shape){
			  for(int i = 0; i < shape.lines; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines - i - 1, " "); 
			      drawDotsLine(i, shape.dot);
			       
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			  }
			    
		  }
		  
		  static void createRightBottomRectangleLeftBottom(Shape shape){
			  for(int i = 0; i < shape.lines; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines - i - 1, " "); 
			      drawDotsLine(i, shape.dot);
			      			      
			      drawDotsLine(shape.lines-1,shape.dot);
			      			      
			      drawDotsLine(i, shape.dot);  
			      System.out.println();
			  }
		  }
		  //IV рівень
		  
		  static void createTree(Shape shape){
			  for(int i = 0; i < shape.lines; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines-i+3, " "); 
			      drawDotsLine(i, shape.dot);
			       
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			  }
			  for(int i = 0; i < shape.lines+2; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines-i+3, " "); 
			      drawDotsLine(i, shape.dot);
			       
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			  }
			  for(int i = 0; i < shape.lines+4; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines - i+3, " "); 
			      drawDotsLine(i, shape.dot);
			       
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			  }
			  for(int i = 0; i<shape.lines-3; i++){    
			      drawShifts(shape.shift+6);  
			      drawDotsLine(shape.lines+1,shape.dot); 
			      System.out.println();
			    }
			    
		  }
		  
		  
		  
		  static void createRocket(Shape shape){
			  for(int i = 0; i < shape.lines; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines-i+3, " "); 
			      drawDotsLine(i, shape.dot);
			       
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			  }
			  for(int i = 0; i<shape.lines-3; i++){    
			      drawShifts(shape.shift+5);  
			      drawDotsLine(shape.lines+3,shape.dot); 
			      System.out.println();
			    }
			  for(int i = 0; i < shape.lines; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines - i - 1, " "); 
			      drawDotsLine(i+1, shape.dot);
			      			      
			      drawDotsLine(shape.lines-1,shape.dot);
			      			      
			      drawDotsLine(i+1, shape.dot);  
			      System.out.println();
			  }
			  for(int i = 0; i<shape.lines; i++){    
			      drawShifts(shape.shift+5);  
			      drawDotsLine(shape.lines+3,shape.dot); 
			      System.out.println();
			    }
			  for(int i = 0; i < shape.lines+1; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines - i - 1, " "); 
			      drawDotsLine(i+1, shape.dot);
			      			      
			      drawDotsLine(shape.lines-1,shape.dot);
			      			      
			      drawDotsLine(i+1, shape.dot);  
			      System.out.println();
			  }
		  }
		  
		  
		  
		  static void createCar(Shape shape){
			  for(int i = 0; i < shape.lines-2; i++){   
			      drawShifts(shape.shift); 
			      drawDotsLine(shape.lines - i +3, " "); 
			      drawDotsLine(i, shape.dot);
			      			      
			      drawDotsLine(shape.lines-1,shape.dot);
			      			      
			      drawDotsLine(i, shape.dot);  
			      System.out.println();
			  }
			  for(int i = 0; i<shape.lines-1; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines+19,shape.dot); 
			      System.out.println();
			    }
			  for(int i = 0; i<shape.lines-3; i++){    
			      drawShifts(shape.shift+3);  
			      drawDotsLine(shape.lines-3,shape.dot); 
			      
			      drawShifts(shape.shift+11);  
			      drawDotsLine(shape.lines-3,shape.dot); 
			      
			      System.out.println();
			    }
			 
			 
		  }
}
