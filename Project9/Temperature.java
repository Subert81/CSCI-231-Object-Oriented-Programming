import java.util.Scanner;

//temperature class
class Temperature
{
   //variable to store degree, scale
   double degree;
   char scale;
  
   //default constructor
   public Temperature()
   {
       degree = 0.0;
       scale ='C';
   }
  
   //parameterized constructor
   public Temperature(double degree)
   {
       this.degree = degree;
       scale = 'C';
   }
  
   //parameterized constructor
   public Temperature(char scale)
   {
       this.degree = 0.0;
       this.scale= scale;
   }
  
   //parameterized constructor
   public Temperature(double degree,char scale)
   {
       this.degree = degree;
       this.scale = scale;
   }
  
   //method to get temperature in celsius
   public double getDegreeInCelsius()
   {
       if (scale == 'C')
           return degree;
      
       if (scale == 'F')
       {
           double c= (degree - 32) * 5/9;
           return c;
       }
      
       return 0;
   }
  
   //method to get temperature in fahrenheit
   public double getDegreeInFahrenheit()
   {
       if (scale == 'F')
           return degree;
      
       if (scale == 'C')
       {
           double f= 1.8 * degree + 32;
           return f;
       }
      
       return 0;
   }
  
   //method to set degree
   public void setDegree(double degree)
   {
       this.degree = degree;
   }
  
   //method to set degree
   public void setDegree(char scale)
   {
       this.scale = scale;
   }
  
   //method to set degree
   public void setDegree(double degree,char scale)
   {
       this.degree = degree;
       this.scale = scale;
   }
  
   //method to check two temperatures are equal
   public boolean equals(Temperature obj)
   {
      
       if(this.getDegreeInCelsius() == obj.getDegreeInCelsius())
           return true;
       else
           return false;
   }
  
   // method to compare two temperatures
   public boolean isLessThan(Temperature obj)
   {
      
       if(this.getDegreeInCelsius() < obj.getDegreeInCelsius())
           return true;
       else
           return false;
   }
  
   // method to compare two temperatures
   public boolean isGreaterThan(Temperature obj)
   {
      
       if(this.getDegreeInCelsius() > obj.getDegreeInCelsius())
           return true;
       else
           return false;
   }
  
}