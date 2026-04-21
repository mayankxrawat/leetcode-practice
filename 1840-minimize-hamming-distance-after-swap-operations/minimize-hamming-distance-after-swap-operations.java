class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        
        UnionFind uf = new UnionFind(n);
        
        // Build connected components
        for (int[] swap : allowedSwaps) {
            uf.union(swap[0], swap[1]);
        }
        
        // Group indices by parent
        Map<Integer, List<Integer>> groups = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int parent = uf.find(i);
            groups.computeIfAbsent(parent, k -> new ArrayList<>()).add(i);
        }
        
        int mismatch = 0;
        
        // Process each component
        for (List<Integer> indices : groups.values()) {
            
            Map<Integer, Integer> freq = new HashMap<>();
            
            // Count source values
            for (int idx : indices) {
                freq.put(source[idx], freq.getOrDefault(source[idx], 0) + 1);
            }
            
            // Try matching target values
            for (int idx : indices) {
                int val = target[idx];
                
                if (freq.getOrDefault(val, 0) > 0) {
                    freq.put(val, freq.get(val) - 1);
                } else {
                    mismatch++;
                }
            }
        }
        
        return mismatch;
    }
    
    class UnionFind {
        int[] parent;
        
        UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }
        
        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }
        
        void union(int a, int b) {
            int pa = find(a);
            int pb = find(b);
            
            if (pa != pb) {
                parent[pa] = pb;
            }
        }

    }
}