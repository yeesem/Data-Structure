/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Vertex<T extends Comparable<T>,N extends Comparable<N>>{
    T vertexInfo;
    Vertex<T,N> nextVertex;
    Edge<T,N> firstEdge;
    int indeg;
    int outdeg;

    
    public Vertex(){
        this(null,null);
    }
    
    public Vertex(T info,Vertex<T,N>next){
        this.vertexInfo = info;
        this.nextVertex = next;
        indeg = 0;
        outdeg = 0;
        firstEdge = null;
    }
    
}

class Edge<T extends Comparable<T>,N extends Comparable<N>>{
    Vertex<T,N>toVertex;
    N weight;
    double speed;
    Edge<T,N>nextEdge;
    
    public Edge(){
        this(null,null,null);
    }
    
    public Edge(Vertex<T,N>destination,N w,Edge<T,N>a){
        toVertex = destination;
        weight = w;
        nextEdge = a;                       
    }
}

class weightedGraph<T extends Comparable<T>,N extends Comparable<N>>{
    Vertex<T,N>head;
    int size;
    List<List<T>>paths = new ArrayList<>();
    
    ArrayList<String>housingArea = new ArrayList<>();
    ArrayList<String>foodArea = new ArrayList<>();
    ArrayList<String>industryArea = new ArrayList<>();
    
    HashMap<Integer,Double>distanceT = new HashMap<>();
    HashMap<Integer,Double>durationT = new HashMap<>();
    ArrayList<Double>distance = new ArrayList<>();
    ArrayList<Double>duration = new ArrayList<>();
    
    public weightedGraph(){
        head = null;
        size = 0;
    }
    
    public int getSize(){
        return size;
    }
    
    public void clear(){
        head=null;
        size = 0;
    }
    
    public int getOutdeg(T v){
        for(Vertex<T,N>current = head;current!=null;current=current.nextVertex){
            if(current.vertexInfo.compareTo(v)==0){
                return current.outdeg;
            }
        }
        return -1;
    }
    
    public int getIndeg(T v){
        for(Vertex<T,N>current = head;current!=null;current = current.nextVertex){
            if(current.vertexInfo.compareTo(v)==0)
                return current.indeg;
        }
        return -1;
    }
    
    public boolean hasVertex(T v){
        for(Vertex<T,N>current=head;current!=null;current = current.nextVertex){
            if(current.vertexInfo.compareTo(v)==0)
                return true;
        }
        return false;
    }
    
    public boolean addVertex(T v){
        if(hasVertex(v))
            return false;
        Vertex<T,N>newVertex = new Vertex<>(v,null);
        if(head==null){
            head = newVertex;
        }else{
            Vertex<T,N>current = head;
            while (current.nextVertex!=null) {
                current = current.nextVertex;
            }
            current.nextVertex = newVertex;
        }
        size++;
        return true;
    }
    
    public boolean addEdge(T source,T destination,N w){
        
        housingArea.add("A");
        housingArea.add("C");
        foodArea.add("B");
        foodArea.add("E");
        foodArea.add("D");
        industryArea.add("F");
        industryArea.add("G");
        if(!hasVertex(source) || !hasVertex(destination))
            return false;

        for (Vertex<T,N>sourceVertex=head;sourceVertex!=null;sourceVertex=sourceVertex.nextVertex) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                for (Vertex<T,N>destinationVertex=head;destinationVertex!=null;destinationVertex=destinationVertex.nextVertex) {
                    if(destinationVertex.vertexInfo.compareTo(destination)==0){
                        sourceVertex.firstEdge = new Edge<>(destinationVertex,w,sourceVertex.firstEdge);
                        if(housingArea.contains(sourceVertex.vertexInfo.toString()) && (housingArea.contains(destinationVertex.vertexInfo.toString()) || foodArea.contains(destinationVertex.vertexInfo.toString())) || (foodArea.contains(sourceVertex.vertexInfo.toString()) && (housingArea.contains(destinationVertex.vertexInfo.toString())) ))
                            sourceVertex.firstEdge.speed = 1.0;
                        else if(foodArea.contains(sourceVertex.vertexInfo.toString()) && foodArea.contains(destinationVertex.vertexInfo.toString()))
                            sourceVertex.firstEdge.speed = 1.25;
                        else if( (foodArea.contains(sourceVertex.vertexInfo.toString()) && industryArea.contains(destinationVertex.vertexInfo.toString())) || (industryArea.contains(sourceVertex.vertexInfo.toString()) && foodArea.contains(destinationVertex.vertexInfo.toString())))
                            sourceVertex.firstEdge.speed = 1.50;
                        else if(industryArea.contains(sourceVertex.vertexInfo.toString()) && industryArea.contains(destinationVertex.vertexInfo.toString()))
                            sourceVertex.firstEdge.speed = 3.00;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean hasEdge(T source,T destination){
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        for (Vertex<T,N>sourceVertex = head;sourceVertex!=null;sourceVertex=sourceVertex.nextVertex) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                for (Edge<T,N>currentEdge=sourceVertex.firstEdge;currentEdge!=null;currentEdge=currentEdge.nextEdge) {
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean removeEdge(T source,T destination){
        if(!hasEdge(source,destination))
            return false;
        for(Vertex<T,N>sourceVertex=head;sourceVertex!=null;sourceVertex=sourceVertex.nextVertex){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                if(sourceVertex.firstEdge.toVertex.vertexInfo.compareTo(destination)==0)
                    sourceVertex.firstEdge = sourceVertex.firstEdge.nextEdge;
                else
                    for (Edge<T,N>currentEdge=sourceVertex.firstEdge;currentEdge.nextEdge!=null;currentEdge=currentEdge.nextEdge) {
                        if(currentEdge.nextEdge.toVertex.vertexInfo.compareTo(destination)==0)
                            currentEdge.nextEdge = currentEdge.nextEdge.nextEdge;
                    }
                return true;
            }
        }
        return false;
    }
    
    public N getEdgeWeight(T source,T destination){
        if(!hasVertex(source) || !hasVertex(destination))
            return null;
        for (Vertex<T,N>sourceVertex=head;sourceVertex!=null;sourceVertex=sourceVertex.nextVertex) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                for (Edge<T,N>currentEdge=sourceVertex.firstEdge;currentEdge!=null;currentEdge=currentEdge.nextEdge) {
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0)
                        return currentEdge.weight;
                }
            }
        }
        return null;
    }  
    
    public ArrayList<T> getNeighbours(T v){
        if(!hasVertex(v))
            return null;
        ArrayList<T>list = new ArrayList<>();
        for (Vertex<T,N>current=head;current!=null;current=current.nextVertex) {
            if(current.vertexInfo.compareTo(v)==0){
                for(Edge<T,N>currentEdge=current.firstEdge;currentEdge!=null;currentEdge=currentEdge.nextEdge){
                    list.add(currentEdge.toVertex.vertexInfo);
                }
            }
        }
        return list;
    }
    
    public void printEdge(){

        for (Vertex<T,N>current=head;current!=null;current=current.nextVertex) {
            System.out.printf("# %s : ",current.vertexInfo);
            for (Edge<T,N>currentEdge=current.firstEdge;currentEdge!=null;currentEdge=currentEdge.nextEdge) {
                  System.out.printf("[%s,%s(%s%.2f , %s%.1f)] ",current.vertexInfo,currentEdge.toVertex.vertexInfo,"speed=",currentEdge.speed,"distance=",currentEdge.weight);
            }
            System.out.println();
        }
    }
    
    public void printVertex(){
        System.out.println("List of all vertices: ");
        int index = 0;
        for (Vertex<T,N>current=head;current!=null;current=current.nextVertex) {
            System.out.printf("%d:%-8s",index,current.vertexInfo);
            index++;
        }
        System.out.println();
    }
    
    public void findPath(T source,T destination,int maxPath){
        int index = -1;
        boolean[]visited = new boolean[getSize()];
        Queue<List<T>>queue = new LinkedList<>();
        List<T>initialPath = new ArrayList<>();
        initialPath.add(source);
        queue.offer(initialPath);
        
        int pathCount = 0;
        while (!queue.isEmpty() && pathCount<maxPath) {
            List<T>path = queue.poll();
            T lastVertex = path.get(path.size()-1);
            index = path.size()-1;
            if(lastVertex.compareTo(destination)==0){
                System.out.println("Path : " + (pathCount+1) + " : " + path);
                paths.add(path);
                pathCount++;
            }else{
                visited[index]=true;
                for(T tempt : getNeighbours(lastVertex)){
                    List<T>newPath = new ArrayList<>(path);
                    newPath.add(tempt);
                    queue.offer(newPath);
                }
            }
            visited[index] = false;
        } 
    }
    
    public double calculateDistance(List<T>tempt){
        double distance = 0;
        for (int i = 1; i < tempt.size(); i++) {
            for (Vertex<T,N>current=head;current!=null;current=current.nextVertex) {
                if(current.vertexInfo.compareTo(tempt.get(i-1))==0){
                    for (Edge<T,N>currentEdge=current.firstEdge;currentEdge!=null;currentEdge=currentEdge.nextEdge) {
                        if(currentEdge.toVertex.vertexInfo.compareTo(tempt.get(i))==0)
                            distance += (Double)(currentEdge.weight);
                    }
                }
            }
        }
        return distance;
    }
    
    public double calculateDuration(List<T>tempt){
        double duration = 0;
        for (int i = 1; i < tempt.size(); i++) {
            for (Vertex<T,N>current=head;current!=null;current=current.nextVertex) {
                if(current.vertexInfo.compareTo(tempt.get(i-1))==0){
                    for (Edge<T,N>currentEdge=current.firstEdge;currentEdge!=null;currentEdge=currentEdge.nextEdge) {
                        if(currentEdge.toVertex.vertexInfo.compareTo(tempt.get(i))==0)
                            duration += ((Double)(currentEdge.weight) / (Double)(currentEdge.speed));
                    }
                }
            }
        }
        return duration;
    }
    
    public void displayDistanceDuration(){
        for (int i = 0; i < paths.size(); i++) {
            distance.add(calculateDistance(paths.get(i)));
            duration.add(calculateDuration(paths.get(i)));
            System.out.println("Path " + (i+1) + " : ");
            System.out.printf("%s%.2f%s%.2f min\n","Distance : ",distance.get(i)," km, Duration : ",duration.get(i));
        }
        System.out.println();
    }
    
    public void sortDistance(){
        ArrayList<Integer>index = new ArrayList<>();
        for (int i = 0; i < distance.size(); i++) {
            index.add(i+1);
        }
        System.out.println("After Bubble Sort: ");
        for (int i = 1; i < distance.size(); i++) {
            for (int j = 0; j < distance.size()-1; j++) {
                if(distance.get(j)>distance.get(j+1)){
                    double hold = distance.get(j);
                    distance.set(j, distance.get(j+1));
                    distance.set(j+1,hold);
                    
                    int tempt = index.get(j);
                    index.set(j, index.get(j+1));
                    index.set(j+1,tempt);
                }
            }
        }
        
        for (int i = 0; i < index.size(); i++) {
            System.out.printf("%s%d (%.2f km)\n","Path : " , index.get(i), distance.get(i));
        }
        System.out.println();
    }
    
    public void sortDuration(){
        ArrayList<Integer>index = new ArrayList<>();
        for (int i = 0; i < duration.size(); i++) {
            index.add(i+1);
        }
        System.out.println("After Insertion Sort: ");
        for (int i = 1; i < duration.size(); i++) {
                double tempt = duration.get(i);
                int hold = index.get(i);
                int j = i-1;
                while (j>=0 && tempt>duration.get(j)) {
                     duration.set(j+1,duration.get(j));
                     index.set(j+1,index.get(j));
                     j--;
                }
                index.set(j+1,hold);
                duration.set(j+1,tempt);
        }
        
        
        
        for (int i = 0; i < index.size(); i++) {
            System.out.printf("%s%d (%.2f min)\n","Path : " , index.get(i), duration.get(i));
        }
        System.out.println();
    }
} 

public class extraQues {
    public static void main(String[] args) {
        weightedGraph<String,Double>g = new weightedGraph<>();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
        g.addVertex("E");
        g.addVertex("F");
        g.addVertex("F");
        g.addVertex("G");
        
        g.addEdge("A","B",7.0);
        g.addEdge("B","A",7.0);
        g.addEdge("C","B",5.5);
        g.addEdge("B","C",5.5);
        g.addEdge("C","D",8.3);
        g.addEdge("B","E",3.2);
        g.addEdge("E","D",2.9);
        g.addEdge("D","G",4.9);
        g.addEdge("E","G",6.0);
        g.addEdge("G","E",6.0);
        g.addEdge("F","G",2.3);
        g.addEdge("E","F",4.0);
        g.addEdge("A","C",10.1);


        System.out.println("The number of verticles in MyCityGraph : " + g.getSize());
        
        g.printVertex();
        
        System.out.println("Has edge from B to A : " + g.hasEdge("A","B"));
        System.out.println("Has edge from A to D : " + g.hasEdge("A","D"));
        
        System.out.println();
        
        ArrayList<String>list = g.getNeighbours("B");
        System.out.print("Find all neighbour of B : [");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i!=list.size()-1)
                System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.println("Print all edges ; ");
        g.printEdge();
        
        System.out.println();
        
        g.findPath("A","G", 5);
        
        System.out.println();
        
        g.displayDistanceDuration();
        
        g.sortDistance();
        
        System.out.println();
        
        g.sortDuration();
    }
    
}


