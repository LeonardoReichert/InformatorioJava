package arreglos;


public class Arreglos {
    public static void main(String[] args){

        /*
        int[] enteros = {5,23,7,2,2,1,1};

        for(int i=enteros.length-1; i>=0; i--){
            System.out.println("indice "+i+ " valor "+enteros[i]);
        }
        */
    
        /*
        int[][] enteros2 = {{5,23,7,2,2}, //y=0
                            {2,2,3},      //y=1
                            {3,4,5,7},    //y=2
                            };

        for(int y=0; y< enteros2.length; y++){
            for(int x=0; x<enteros2[y].length; x++){
                System.out.println("y="+y+" x="+x+ " tiene "+enteros2[y][x]);
            }
            System.out.println("");
        } */


        //int[] n1 = {5,8,1};

        /*
        int[] n1;
        n1 = new int[3];

        n1[0] = 5;
        n1[1] = 8;
        n1[2] = 1;
        

        for(int i=0; i<n1.length; i++){
            System.out.println("n1:"+i+" vale "+n1[i]);

        }
        */

        int[][] n2 = new int[5][3];

        for(int i=0; i<n2.length; i++){
            System.out.println("n2:"+i+" vale "+n2[i][0]);
        }

    }
    
}
