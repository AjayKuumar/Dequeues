public class CircularTour {
    public static int circularTour(int[] petrol,int[] dist){
        int curr_pet = 0;
        int prv_pet = 0;
        int start =0;
        for (int i = 0; i < petrol.length; i++) {
            curr_pet+=petrol[i]-dist[i];
            if (curr_pet<0){
                start = i+1;
                prv_pet+=curr_pet;
                curr_pet=0;
            }
        }
        return ((curr_pet+prv_pet)>=0)?start+1:-1;
    }
    public static void main(String[] args) {
        int[] petrol ={50,10,60,100};
        int[] dist ={30,20,100,10};
        System.out.println(circularTour(petrol,dist));
    }
}
