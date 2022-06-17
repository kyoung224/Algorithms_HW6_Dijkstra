import java.util.*;

// YOU SHOULD NOT MODIFY THIS FILE IN ANY WAY
// YOU SHOULD NOT MODIFY THIS FILE IN ANY WAY
// YOU SHOULD NOT MODIFY THIS FILE IN ANY WAY
// YOU SHOULD NOT MODIFY THIS FILE IN ANY WAY

class MatrixGenerator {
  
  public static Integer[][] generate(String seedAsString) {
    Long seed = Long.parseLong(seedAsString);
    Integer[][] result = new Integer[7][7];
    Random generator = new Random(seed);
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result.length; j++) {
        if (j > i) {
          if (generator.nextBoolean()) {
	    int x = generator.nextInt(16);
            result[i][j] = x > 0 ? x : 1;
	    result[j][i] = result[i][j];
    	  }
	}
      }
    }
   return result; 
  }
  
}
