import java.util.HashMap;

public class FurthestPoint {
    public static int furthestDistanceFromOrigin(String moves) {
        HashMap<Character,Integer> temp = new HashMap<>();
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(temp.containsKey(ch)){
                temp.put(ch, temp.get(ch)+1);
            }else{
                temp.put(ch,1);
            }
        }

        int l = 0;
        int r = 0;
        int d = 0;

        if(temp.containsKey('L')){
            l = temp.get('L');
        }
        if(temp.containsKey('R')){
            r = temp.get('R');
        }
        if(temp.containsKey('_')){
            d = temp.get('_');
        }
        return Math.abs(l-r)+d;
    }

    public static void main(String[] args) {
        System.out.println(furthestDistanceFromOrigin("_______"));
    }
}
