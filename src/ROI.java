/**
 * Created by Rohith on 11/20/2017.
 */
  abstract class Rate{
    abstract int getROI();
}

class BOA extends Rate{
    int getROI(){
      return 7;
    }
}

class WellsFargo extends Rate{
    int getROI(){
      return 6;
    }
  }

class ROI{
  public static void main(String[] args) {
    Rate pb ;
    pb = new BOA();
    System.out.println(pb.getROI());
    pb = new WellsFargo();
    System.out.println(pb.getROI());
  }
}
