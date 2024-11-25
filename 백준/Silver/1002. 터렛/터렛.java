import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        while(x-- >0){
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int r1 = in.nextInt();

            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int r2 = in.nextInt();

            System.out.println(contact(x1, y1, r1, x2, y2, r2));
        }

        in.close();
    }
    public static int contact(int x1,int y1,int r1,int x2,int y2 ,int r2){

        int dist = (int)(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        //case 1 : 점접의 개수가 무한 -> 좌표도 같고 반지름도 같을때
        if(x1==x2 && y1==y2 && r1==r2){
            return -1;
        }
        //case 2 : 내접 , 접점 1개
        if(dist == Math.pow(r2-r1,2)){
            return 1;
        }
        //case 3 : 외접 , 접점 1개
        if(dist == Math.pow(r2+r1,2)){
            return 1;
        }
        //case 4 : 접점 x -> 두가지 경우 한원안에 다른원이 있는데 접접이 없는경우 , 그냥 떨어져서 접접이 없는경우
        if(dist < Math.pow(r2-r1,2)){
            return 0;
        }
        if(dist > Math.pow(r2+r1,2)){
            return 0;
        }
        //case 5 : 그 외 접점 두개
        else{
            return 2;
        }
    }
}