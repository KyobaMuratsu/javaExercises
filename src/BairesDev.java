import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BairesDev {
	
    public static void main(String args[] ) throws Exception {
        int n = 10;
        int k = 34;
        
        int[] seat = {0, 0, 0, 3, 1, 0, 1, 2, 0, 0, 1, 0, 0, 0, 3, 0, 0, 1, 3, 0, 0, 0, 0, 6, 0, 0, 1, 7, 0, 0, 0, 0, 1, 0};
        
        ArrayList<Integer> seatGot = new ArrayList<>();
        
        int[] seats = new int[n];
        
        for (int i = 0; i < k; i++) {
            if (seat[i] == 0) {
                for (int j = 0; j < n; j++) {
                    if (seats[j] == 0) {
                        seats[j] = j + 1; 
                        seatGot.add(j + 1);  
                        break;
                    }
                }
            } else {
                int seatToCancel = seat[i] - 1;
                if (seats[seatToCancel] != 0) {
                    seats[seatToCancel] = 0;
                }
            }
        }
        
        int[] result = seatGot.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }
}
