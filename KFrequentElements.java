import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class KFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length){
            return nums;
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            freq.put(
                nums[i],
                freq.getOrDefault(nums[i], 0)+1
            );
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a, b) -> freq.get(a) - freq.get(b)
        );

        for(int num : freq.keySet()){
            heap.add(freq.get(num));
            if(heap.size() > k){
                heap.poll();
            }
        }

        return heap.stream().mapToInt(Integer::intValue).toArray();
    }
}
