import java.util.Scanner;

public class q14Rainwater {

    //RainWater Function
    public static int funTrappedWater(int height[]){

        int n = height.length; //[n] = [height.lenght] -last variable of arrays


        /* calculate Left Max */ 
        int leftMax[] = new int[n]; //lenght of leftMax assigned

        //leftMax[0]=height[0] -because there is no bar beside left thats why height[0] is the max for [0].
        leftMax[0] = height[0];

        //loop to assign- leftmax
        for(int l=1; l<n; l++){

            leftMax[l] = Math.max(height[l], height[l-1]); //left
        }

        /* calculate Right Max */
        int rightMax[] = new int[n]; //lenght of rightMax assigned

        //rightMax[n]=height[n] -because there is no bar further thats why height[n] is the max for [n].
        rightMax[n-1] = height[n-1];

        //loop to assign- rightMax
        for(int k=n-2; k>=0; k--){ //k starts from n-2 because n-1 is already assigned above
            
            rightMax[k] = Math.max(height[k], rightMax[k+1]);
        } 
        
        /* Main Loop */
        int trappedWater = 0; //variable

        //trappedWater += trappedWater+ (waterLevel-height[i]);
        //waterLvl = min(max left boundary, max right boundary)
        //waterTrapped = waterLvl - height[i] * 1;

        for(int i=0; i<n; i++){

            int waterLevel = Math.min(leftMax[i], rightMax[i]); //water Level calculater
            trappedWater += (waterLevel-height[i]); // *1 is remove because bar width is 1 given which returns same result 
        }
  
        return trappedWater;
    }


    //Main
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int height[] = {4, 2, 0, 6, 3, 2, 5}; //bars height -array assignes

        
        System.out.println(funTrappedWater(height)); //output
   
        sc.close();
    }
    
}
