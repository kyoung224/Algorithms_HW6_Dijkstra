import java.util.*;

class HW6 {

  public static String pantherID() {
    return "002403523";

    /*
    [null,    1,    4, null, null, null, null]
    [   1, null,   12,   10,   13,   13,    2]
    [   4,   12, null,    6, null, null, null]
    [null,   10,    6, null, null, null, null]
    [null,   13, null, null, null,    3,    1]
    [null,   13, null, null,    3, null, null]
    [null,    2, null, null,    1, null, null]
    */
  }

  public static void main(String[] args) {
    Integer[][] m = MatrixGenerator.generate(pantherID());
    System.out.println("Your adjacency matrix:");
    printMatrix(m);
    System.out.println(
      String.format("Run Dijktra's starting at node %d", findFirstNonNullRow(m))
    );
  }

  public static void printMatrix(Integer[][] m) {
    for (Integer[] arr : m) {
      String[] row = new String[arr.length];
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] != null) {
	  if (arr[i] > 9) {
  	    row[i] = "  " + arr[i];  // Gotta pad the double digits
	  } else {
  	    row[i] = "   " + arr[i]; // Gotta pad the single digits
	  }
	}
      }
      System.out.println(Arrays.toString(row));
    }
  }

  public static int findFirstNonNullRow(Integer[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (Integer edge : m[i]) {
        if (edge != null) {
	  return i;
	}
      }
    }
    return -1;
  }

}
