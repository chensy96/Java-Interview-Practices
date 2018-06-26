package review;

import java.io.*;
import java.util.*;

public class BFSshortest {
    
    public static class Graph {
       private int size;
        private  LinkedList<Integer> [] G;
        
        Graph(int size){
            this.size = size;
            this.G = new LinkedList[size];
            
            for(int i=0; i < size; i++){
                G[i] = new LinkedList<Integer>();
            }
        }
        
        public void addEdge(int a, int b){
            G[a].add(b);
            G[b].add(a);
        }
        //bfs
        public void findshortest(int start){
            //get shorst distance = distance since all weights are equal 
            Queue<Integer> q = new LinkedList<Integer>();
            int dis = 6;
            int[] distance = new int[size];
            Arrays.fill(distance, -1);
            q.add(start);
            distance[start] = 0;
            
            while(!q.isEmpty()){
                int current = q.poll();
            
                for(int i : G[current]){
                    if(distance[i] ==-1){ //unvisited
                        q.add(i); 
                        distance[i] = distance[current] + dis; 
                    }
                }
                
            }
            for(int d : distance){
                if(d != 0){
                    System.out.print(d + " ");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
            
        int queries = in.nextInt(); //number of queries
        for(int i=0; i < queries; i++){
        int n = in.nextInt();
            Graph graph = new Graph(n);
        int m = in.nextInt();
//            for(int num =1; num <= n; num++){
//                graph.add(num);
//            }
            for(int pair=0; pair < m; pair++){
                graph.addEdge(in.nextInt()-1, in.nextInt()-1);
            }
            graph.findshortest(in.nextInt()-1);
            System.out.println();
        }
    }
}