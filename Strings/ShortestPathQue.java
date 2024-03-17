package Strings;

public class ShortestPathQue {
    public static float shortestPathQue(String str) {
        int x=0, y=0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'E') {
                x++;
            } else if(ch == 'W') {
                x--;
            } else if(ch == 'N') {
                y++;
            } else if(ch == 'S') {
                y--;
            }
        }
        return (float)Math.sqrt((x*x) + (y*y));
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("Distance is: " + shortestPathQue(str));
    }
}