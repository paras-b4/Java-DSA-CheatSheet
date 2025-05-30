// lru stands for least resently used 

// The LRU (Least Recently Used) Cache is a caching mechanism that removes the least recently used 
// item when the cache reaches its capacity.
import java.util.*;

public class LRU extends LinkedHashMap<Integer,Integer>
{
    int capacity;
    public LRU(int capacity){

        super(capacity,0.75f,true);
        this.capacity=capacity;
    }
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<Integer, Integer> eldest) {
      return size()>capacity;

    }

    public static void main(String[] args) 
    {
        LRU cache=new LRU(2);
    
        cache.put(1, 100);
        cache.put(2, 200);
        System.out.println(cache.get(1)); // 100
        cache.put(3, 300); // Removes key 2
        System.out.println(cache.get(2)); // -1 (Not found)
        cache.put(4, 400); // Removes key 1
        System.out.println(cache.get(1)); // -1 (Not found)
        System.out.println(cache.get(3)); // 300
        System.out.println(cache.get(4)); // 400

    }
    
}


