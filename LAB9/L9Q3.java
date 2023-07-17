/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB9;

import java.util.ArrayList;
class Vertex<T extends Comparable<T>,N extends Comparable<N>>{
     T vertexInfo;
     Vertex<T,N>nextVertex;
     int outdeg;
     int indeg;
     Edge<T,N>firstEdge;
     
     public Vertex(){
         vertexInfo = null;
         nextVertex = null;
         outdeg = 0;
         indeg = 0;
         firstEdge = null;
     }
     
     public Vertex(T vertexInfo,Vertex<T,N>next){
         this.vertexInfo = vertexInfo;
         nextVertex = next;
         indeg = 0;
         outdeg = 0;
         firstEdge = null;
     }
}

class Edge<T extends Comparable<T>,N extends Comparable<N>>{
    Vertex<T,N>toVertex;
    Edge<T,N>nextEdge;
    
    public Edge(){
        toVertex = null;
        nextEdge = null;
    }
    
    public Edge(Vertex<T,N>destination,Edge<T,N>next){
        toVertex = destination;
        nextEdge = next;
    }
}

class UnweightedGraph<T extends Comparable<T>,N extends Comparable<N>>{
    Vertex<T,N>head;
    int size;
    
    public UnweightedGraph(){
        this.head = null;
        this.size = 0;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean hasVertex(T v){
        if(head == null)
            return false;
        for (Vertex<T,N>tempt = head;tempt!=null;tempt = tempt.nextVertex){
            if(tempt.vertexInfo.compareTo(v)==0)
                return true;
        }
        return false;
    }
    
    public boolean addVertex(T v){
        if(!hasVertex(v)){
            Vertex<T,N>newVertex = new Vertex<>(v,null);
            if(head == null){
                head = newVertex;
                this.size++;
                return true;
            }
            else{
                Vertex<T,N>prev = head;
                for (Vertex<T,N>tempt = head;tempt!=null;tempt = tempt.nextVertex){
                    prev = tempt;
                }
                prev.nextVertex = newVertex;
            }
            this.size++;
            return true;
        }
        return false;
    }
    
    public T getVertex(int pos){
        if(pos<0 || pos>this.size-1)
            return null;
        Vertex<T,N>tempt = head;
        for(int i=0;i<pos;i++){
            tempt = tempt.nextVertex;
        }
        return tempt.vertexInfo;
    }
    
    public int getIndex(T v){
        if(hasVertex(v)){
            int index = 0;
            for(Vertex<T,N>tempt = head;tempt!=null;tempt=tempt.nextVertex){
                if(tempt.vertexInfo.compareTo(v)==0){
                    return index;
                }
                index++;
            }
        }
        return -1;
    }
    
    public int getIndeg(T v){
        if(hasVertex(v)){
            for (Vertex<T,N>tempt = head;tempt!=null;tempt=tempt.nextVertex) {
                if(tempt.vertexInfo.compareTo(v)==0)
                    return tempt.indeg;
            }
        }
        return -1;
    }
    
    public int getOutdeg(T v){
        if(hasVertex(v)){
            for (Vertex<T,N>tempt=head;tempt!=null;tempt=tempt.nextVertex) {
                if(tempt.vertexInfo.compareTo(v)==0)
                    return tempt.outdeg;
            }
        }
        return -1;
    }
    
    public boolean hasEdge(T source,T destination){
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        for (Vertex<T,N>sourceVertex=head;sourceVertex!=null;sourceVertex=sourceVertex.nextVertex) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                for (Edge<T,N>currentEdge = sourceVertex.firstEdge;currentEdge!=null;currentEdge=currentEdge.nextEdge) {
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0)
                        return true;
                }
            }
        }
        return false;
    }
    
    public boolean addEdge(T source,T destination){
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        for (Vertex<T,N>sourceVertex = head;sourceVertex!=null;sourceVertex=sourceVertex.nextVertex) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                for (Vertex<T,N>destinationVertex = head;destinationVertex!=null;destinationVertex=destinationVertex.nextVertex){
                    if(destinationVertex.vertexInfo.compareTo(destination)==0){
                        sourceVertex.firstEdge = new Edge(destinationVertex,sourceVertex.firstEdge);
                        destinationVertex.firstEdge = new Edge(sourceVertex,destinationVertex.firstEdge);
                        sourceVertex.indeg++;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        destinationVertex.outdeg++;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public ArrayList<T>getNeighbour(T v){
        if(hasVertex(v)){
            ArrayList<T>list = new ArrayList<>();
            for(Vertex<T,N>tempt = head;tempt!=null;tempt=tempt.nextVertex){
                if(tempt.vertexInfo.compareTo(v)==0){
                    Edge<T,N>currentEdge = tempt.firstEdge;
                    for (;currentEdge!=null;currentEdge = currentEdge.nextEdge) {
                        list.add(currentEdge.toVertex.vertexInfo);
                    }
                    return list;
                }
            }
            return list;
        }
        return null;
    }
    
    public void printGraph(){
        Vertex<T,N>tempt = head;
        while (tempt!=null) {
            System.out.print("#" + tempt.vertexInfo + " : ");
            for (Edge<T,N>currentEdge=tempt.firstEdge;currentEdge!=null;currentEdge=currentEdge.nextEdge) {
                System.out.print("[" + tempt.vertexInfo + "," + currentEdge.toVertex.vertexInfo + "], ");
            }
            System.out.println();
            tempt = tempt.nextVertex;
        }
    }
}

public class L9Q3{
    public static void main(String[] args) {
        UnweightedGraph<String,Integer>g = new UnweightedGraph<>();
        String[]cities = {"Alor Setar","Kuching","Langkawi","Melaka","Penang","Tawau"};
        for(String tempt : cities){
            g.addVertex(tempt);
        }
        
        System.out.println("The number of vertices in graph1: " + g.getSize());
    
        System.out.println("Cities and their vertices ");
        for(int i=0;i<g.getSize();i++){
            System.out.println(i + " : " + g.getVertex(i));
        }
        System.out.println();
        
        System.out.println("Is Melaka in the graph? " + g.hasVertex("Melaka"));
        System.out.println("Is Ipoh   in the graph? " + g.hasVertex("Ipoh"));
        System.out.println();
        
        System.out.println("Kuching at index: " + g.getIndex("Kuching"));
        System.out.println("Ipoh    at index: " + g.getIndex("Ipoh"));
        System.out.println();
        
        System.out.println("add edge Kuching    - Melaka     : " + g.addEdge("Kuching","Melaka"));
        System.out.println("add edge Langkawi   - Penang     : " + g.addEdge("Langkawi","Penang"));
        System.out.println("add edge Melaka     - Penang     : " + g.addEdge("Melaka","Penang"));
        System.out.println("add edge Alor Setar - Kuching    : " + g.addEdge("Alor Setar","Kuching"));
        System.out.println("add edge Tawau      - Alor Setar : " + g.addEdge("Tawau","Alor Setar"));
        System.out.println("add edge Kuching    - Tawau      : " + g.addEdge("Kuching","Tawau"));
        System.out.println("add edge Langkawi   - Ipoh       : " + g.addEdge("Langkawi","Ipoh"));
        System.out.println();
        
        System.out.println("has edge from Kuching to Melaka? " + g.hasEdge("Kuching","Melaka"));
        System.out.println("has edge from Melaka to Kuching? " + g.hasEdge("Melaka","Kuching"));
        System.out.println("has edge from Ipoh to Langkawi? " + g.hasEdge("Ipoh","Langkawi"));
    
        System.out.println("In and out degree for Kuching is " + g.getIndeg("Kuching" ) + " and " + g.getOutdeg("Kuching"));
        System.out.println("In and out degree for Penang  is " + g.getIndeg("Penang" ) + " and " + g.getOutdeg("Penang"));
        System.out.println("In and out degree for Ipoh    is " + g.getIndeg("Ipoh" ) + " and " + g.getOutdeg("Ipoh"));
        System.out.println();
        
        System.out.println("Neighbouts of Kuching : " + g.getNeighbour("Kuching"));
        System.out.println("Print Edges : ");
        g.printGraph();
    }
}
