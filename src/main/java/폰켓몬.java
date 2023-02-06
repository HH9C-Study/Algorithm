import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> pokemon = new HashSet<>();
        for(int i = 0; i<nums.length; i++) {
            pokemon.add(nums[i]);
        }
        int pokemonType = pokemon.size();
        if(pokemonType > nums.length/2) {
            answer = nums.length/2;
        } else {
            answer = pokemonType;
        }
        return answer;
    }
}
