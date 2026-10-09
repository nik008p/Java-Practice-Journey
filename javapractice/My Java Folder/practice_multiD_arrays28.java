public class practice_multiD_arrays28 {
    public static void main(String[] args) {
       // int [] marks = {24,45,45,76,78}; //1d array
    //    int [][] flats;
    //   flats = new int[2][3];  //2d array
    //   flats[0][0] = 101;
    //   flats[0][1] = 102;
    //   flats[0][2] = 103;
    //   flats[1][0] = 201;
    //   flats[1][1] = 202;
    //   flats[1][2] = 203;

    //   System.out.println("Displaying 2d array");
    //   for (int i = 0; i < flats.length; i++) {
    //     for (int j = 0; j < flats[i].length; j++) {
    //         System.out.print(flats[i][j]);
    //         System.out.print(" ");
    //     }
    //        System.out.println("");
    //   }

        String [][] flats;
      flats = new String[3][4];  //2d array
      flats[0][0] = "Nikhil";
      flats[0][1] = "Arpit";
      flats[0][2] = "Harshit";
      flats[0][3] = "Aman";
      flats[1][0] = "Piyush";
      flats[1][1] = "Neeraj";
      flats[1][2] = "Neeraj";
      flats[1][3] = "Neeraj";    
      flats[2][0] = "Neeraj";    
      flats[2][1] = "Neeraj";    
      flats[2][2] = "Neeraj";    
      flats[2][3] = "Neeraj";    

      System.out.println("Displaying 2d array");
      for (int i = 0; i < flats.length; i++) {
        for (int j = 0; j < flats[i].length; j++) {
            System.out.print(flats[i][j]);
            System.out.print(" ");
        }
           System.out.println("");
      }

        //     int [][][] array = {
        //         { 
        //                        {1, 2, 3,},   //3d array
        //                        { 4, 5, 6,}
                               
        
        //     },
        //     {
        //         {7, 8, 9, },
        //         {10, 11, 12, },

        //        }
        //     };
        //  for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array[i].length; j++) {
        //         for (int k = 0; k < array[i][j].length; k++) {
        //             System.out.print(array[i][j][k]);
        //             System.out.print(" ");
                    
        //         }
        //         System.out.println("");
                
        //     }
        //     System.out.println("");
            
        //  }

    }
}
