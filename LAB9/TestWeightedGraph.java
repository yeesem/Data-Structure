/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB9;

import java.util.ArrayList;

public class TestWeightedGraph{
    public static void main(String[] args) {
        Graph<String,Integer>graph = new Graph<>();
        String [] cities = {"Alor Setar","Kuching","Langkawi","Melaka","Penang","Tawau"};
        for(String tempt : cities){
            graph.addVertex(tempt);
        }
        
        System.out.println("Number of vertex : " + graph.getSize());
    
        System.out.println("Cities and their vertices");
        for (int i = 0; i < graph.getSize(); i++) {
            System.out.print(graph.getVertex(i)+ " ");
        }
        System.out.println();
        
        System.out.println("Is Melaka in the Graph? " + graph.hasVertex("Melaka"));
        System.out.println("Is Ipoh in the Graph  ? " + graph.hasVertex("Ipoh"));
        System.out.println();
        
        System.out.println("Kuching at index: " + graph.getIndex("Kuching"));
        System.out.println("Ipoh at index   : " + graph.getIndex("Ipoh"));
        System.out.println();
        
        System.out.println("add edge Kuching - Melaka: " + graph.addEdge("Kuching","Melaka",800));
        System.out.println("add Edge Langkawi - Penang: " + graph.addEdge("Langkawi","Penang",100));
        System.out.println("add Edge Melaka - Penang: " + graph.addEdge("Melaka","Penang",400));
        System.out.println("add Edge Alor Setar - Kuching: " + graph.addEdge("Alor Setar","Kuching",1200));
        System.out.println("add Edge Tawau - Alor Setar: " + graph.addEdge("Tawau","Alor Setar",1900));
        System.out.println("add Edge Kuching - Tawau: " + graph.addEdge("Kuching","Tawau",900));
        System.out.println("add Edge Langkawi - Ipoh: " + graph.addEdge("Langkawi","Ipoh",900));
        System.out.println();
        
        System.out.println("has edge from Kuching to Melaka? " + graph.hasEdge("Kuching","Melaka"));
        System.out.println("has edge from Melaka to Kuching? " + graph.hasEdge("Melaka","Kuching"));
        System.out.println("has edge from Ipoh to Langkawi? " + graph.hasEdge("Ipoh","Langkawi"));
        System.out.println();
        
        System.out.println("weight of edge from Kuching to Melaka? " + graph.getEdgeWeight("Kuching","Melaka"));
        System.out.println("weight of edge from Tawau and Alor Setar? " + graph.getEdgeWeight("Tawau","Alor Setar"));
        System.out.println("weight of edge from Semporna and Ipoh? " + graph.getEdgeWeight("Semporna","Ipoh"));
        System.out.println();
        
        System.out.println("In and out degree for Kuching is " + graph.getIndeg("Kuching" + " and " + graph.getOutdeg("Kuching")));
        System.out.println("In and out degree for Penang  is " + graph.getIndeg("Penang" + " and " + graph.getOutdeg("Penang")));
        System.out.println("In and out degree for Ipoh    is " + graph.getIndeg("Ipoh" + " and " + graph.getOutdeg("Ipoh")));
        System.out.println();
        
        System.out.println("Neighbours of Kuching : " + graph.getNeighbours("Kuching"));
        System.out.println("\nPrint Edges : ");
        graph.printEdges();
    }
}

class Vertex<T extends Comparable<T>, N extends Comparable<N>>{
    T vertexInfo;
    int indeg;
    int outdeg;
    Vertex<T,N> nextVertex;
    Edge<T,N> firstEdge;
    
    public Vertex(){
        vertexInfo = null;
        indeg = 0;
        outdeg = 0;
        nextVertex = null;
        firstEdge = null;
    }
    
    public Vertex(T vInfo,Vertex<T,N>next){
        vertexInfo = vInfo;
        indeg = 0;
        outdeg = 0;
        nextVertex = next;
        firstEdge = null;
    }
}

class Edge<T extends Comparable<T>,N extends Comparable<N>>{
    Vertex<T,N> toVertex;
    N weight;
    Edge<T,N>nextEdge;
    
    public Edge(){
        toVertex = null;
        weight = null;
        nextEdge = null;
    }
    
    public Edge(Vertex<T,N>destination,N w,Edge<T,N>a){
        toVertex = destination;
        this.weight = w;
        nextEdge = a;
    }
}

class Graph<T extends Comparable<T>, N extends Comparable<N>>{
    Vertex<T,N> head;
    int size;
    
    public Graph(){
        head = null;
        size = 0;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean hasVertex(T x){
        if(head == null)
            return false;
        Vertex<T,N>tempt = head;
        while (tempt!=null) {
            if(tempt.vertexInfo.compareTo(x)==0){
               return true; 
            }
            tempt = tempt.nextVertex;
        }
        return false;
    }
    
    public int getIndeg(T v){
        if(hasVertex(v)){
            Vertex<T,N>tempt = head;
            while (tempt!=null){
                if(tempt.vertexInfo.compareTo(v)==0){
                    return tempt.indeg;
                }
                tempt = tempt.nextVertex;
            }
        }
        return -1;
    }
    
    public int getOutdeg(T v){
        if(hasVertex(v)){
            for (Vertex<T,N>tempt = head;tempt!=null;tempt = tempt.nextVertex){
                if(tempt.vertexInfo.compareTo(v)==0){
                    return tempt.outdeg;
                }
            }
        }
        return -1;
    }
    
    public boolean addVertex(T v){
        if(!this.hasVertex(v)){
            Vertex<T,N>tempt = head;
            Vertex<T,N>newVertex = new Vertex<>(v,null);
            if(head == null)
                head = newVertex;
            else{
                Vertex<T,N>previous = head;
                while (tempt!=null) {
                    previous = tempt;
                    tempt = tempt.nextVertex;
                }
                previous.nextVertex = newVertex;
            }
            this.size++;
            return true;
        }
        return false;
    }
    
    //Get the index of the vertex
    public int getIndex(T v){
        Vertex<T,N>tempt = head;
        int pos = 0;
        while (tempt!=null) {
            if(tempt.vertexInfo.compareTo(v)==0)
                return pos;
            pos++;
            tempt = tempt.nextVertex;
        }
        return -1;
    }
    
    public ArrayList<T> getAllVertexObjects(){
        ArrayList<T>list = new ArrayList<>();
        Vertex<T,N>tempt = head;
        while (tempt!=null) {
            list.add(tempt.vertexInfo);
            tempt = tempt.nextVertex;
        }
        return list;
    }
    
    public T getVertex(int pos){
        if(pos<0 || pos>size-1)
            return null;
        Vertex<T,N>tempt = head;
        for(int i=0;i<pos;i++){
            tempt = tempt.nextVertex;
        }
        return tempt.vertexInfo;
    }
    
    public boolean hasEdge(T source,T destination){
        if(head==null){
            return false;
        }
        if(!hasVertex(source)||!hasVertex(destination)){
            return false;
        }
        Vertex<T,N>sourceVertex = head;
        while(sourceVertex!=null) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Edge<T,N>currentEdge = sourceVertex.firstEdge;
                while (currentEdge!=null) {
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0){
                        return true;
                    }
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    
    public boolean addEdge(T source,T destination,N w){
        if(head==null)
            return false;
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        Vertex<T,N>sourceVertex = head;
        while (sourceVertex!=null) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Vertex<T,N>destinationVertex = head;
                while (destinationVertex!=null) {
                    if(destinationVertex.vertexInfo.compareTo(destination)==0){
                        Edge<T,N>currentEdge = sourceVertex.firstEdge;
                        Edge<T,N>newEdge = new Edge<>(destinationVertex,w,currentEdge);
                        sourceVertex.firstEdge = newEdge;
                        //sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                    destinationVertex = destinationVertex.nextVertex;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    
    public N getEdgeWeight(T source,T destination){
        if(head==null) return null;
        if(!hasVertex(source) || !hasVertex(destination))
            return null;
        Vertex<T,N>sourceVertex = head;
        while (sourceVertex!=null) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
               Edge<T,N>currentEdge = sourceVertex.firstEdge;
                while (currentEdge!=null) {
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0)
                        return currentEdge.weight;
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return null;
    }
    
    public ArrayList<T>getNeighbours(T v){
        if(!hasVertex(v))
            return null;
        ArrayList<T>list = new ArrayList<>();
        Vertex<T,N>tempt = head;
        while (tempt!=null) {
            if(tempt.vertexInfo.compareTo(v)==0){
                Edge<T,N>currentEdge = tempt.firstEdge;
                while (currentEdge!=null) {
                    list.add(currentEdge.toVertex.vertexInfo);
                    currentEdge = currentEdge.nextEdge;
                }
            }
            tempt = tempt.nextVertex;
        }
        return list;
    }
    
    public void printEdges(){
        Vertex<T,N>tempt = head;
        while (tempt!=null) {
            Edge<T,N>currentEdge = tempt.firstEdge;
            System.out.print("#" + tempt.vertexInfo + " : ");
            while (currentEdge!=null) {
                System.out.print("[" + tempt.vertexInfo + "," + currentEdge.toVertex.vertexInfo + "] ");
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            tempt = tempt.nextVertex;
        }
    }
}



