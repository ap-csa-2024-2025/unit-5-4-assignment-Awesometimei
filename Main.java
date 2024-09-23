public class Main
{
  public static void main(String[] args)
  {
    System.out.println(distanceFormula(1,1,2,2));
    System.out.println(negativeQuadraticFormula(1, 5, 6));
    System.out.println(positiveQuadraticFormula(1, 5, 6));
  }

  public static double distanceFormula(double x1, double y1, double x2, double y2)
  {
    double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    return distance;
  }

  public static double negativeQuadraticFormula(double a, double b, double c)
  {
    double discriminant = Math.sqrt(b*b-4*a*c);
    return (-b - discriminant)/(2*a);
  }

  public static double positiveQuadraticFormula(double a, double b, double c)
  {
    double discriminant = Math.sqrt(b*b-4*a*c);
    return (-b + discriminant)/(2*a);
  }
}


