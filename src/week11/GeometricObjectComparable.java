package week11;


public abstract class GeometricObjectComparable extends GeometricObject implements Comparable<GeometricObjectComparable>{
	public GeometricObjectComparable() {}

	@Override // Implement the compareTo method defined in Comparable 
	  public int compareTo(GeometricObjectComparable o) {
	    if (getArea() > o.getArea())
	      return 1;
	    else if (getArea() < o.getArea())
	      return -1;
	    else
	      return 0;
	  }
	
	public static GeometricObjectComparable max(GeometricObjectComparable o1, GeometricObjectComparable o2) {
		if(o1.compareTo(o2) == 1) {
			return o1;
		}else if(o1.compareTo(o2) == -1) {
			return o2;
		}else {
			return o1;
		}
	}

	/** Abstract method getArea */
	  public abstract double getArea();

	/** Abstract method getPerimeter */
	  public abstract double getPerimeter();

}
