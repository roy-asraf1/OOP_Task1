package exceptions;
public class TestPoint {
	public static void main(String[] args) {
		String[] param = {"[1,3.5]", "[a,3.5]","[1.5, 2]","[10,3.5, 7]",null,"[2.5, 3.14]"};
		for (String s : param) {
			try {
				Point p = new Point(s);
				System.out.println("p=" + p.toString());
			} catch (PointException e) {
				System.err.println(e);
				e.printStackTrace();
				//System.exit(-1);  // exit the java program!
			} catch (NumberFormatException e) {
				System.err.println(" the coordinate is not a number!! " + e);
				e.printStackTrace();
				//return; //System.exit(-2);  // exit the java program!
			} catch (NullPointerException e) {
				System.err.println(" Point is null!!!! " + e);
				e.printStackTrace();
				//return; //System.exit(-2);  // exit the java program!
			}
			// *** if any other 'unknown' exception happens.. ***
			catch (Exception e) {
				System.err.println("** unknown error !! **" + e);
				e.printStackTrace();
				//System.exit(-2);  // exit the java program!
			} finally {
				System.out.println("finally block");
			}
		}

		System.out.println("bye-bye");
	}

}
