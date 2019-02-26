public class Lab6_1 {
    public static void main(String[] args){
        int[] Rand = new int[10];
        for (int i =0; i<Rand.length; i++)
        {
            Rand[i] = (int)(Math.random()*100);
            System.out.print(Rand[i]+" ");
        }
        double sum=0;
        for (int i = 0; i<Rand.length; i++)
        {
                sum=sum+Rand[i];
        }
        System.out.println("\n"+"Average="+sum/10);

    }

}
