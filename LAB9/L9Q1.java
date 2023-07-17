/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB9;

class Vertex<T extends Comparable<T>,N extends Comparable<N>>{
    T vertexInfo;
    Vertex<T,N>nextVertex;
    int numEdge;
    //int indeg;
    //int outdeg;
    Edge<T,N>firstEdge;
    
    public Vertex(){
        vertexInfo=null;
        numEdge=0;
        //indeg = 0;
        //outdeg = 0;
    }
    
    public Vertex(T vInfo,Vertex<T,N>nextVertex){
        this.vertexInfo = vInfo;
        //this.indeg = 0;
        //this.outdeg = 0;
        numEdge = 0;
        this.nextVertex = nextVertex;
        this.firstEdge = null;
    }
}

class Edge<T extends Comparable<T>,N extends Comparable<N>>{
    Vertex<T,N>toVertex;
    N weight;
    Edge<T,N>nextEdge;
            
    public Edge(){
        toVertex = null;
        weight = null;
        nextEdge = null;
    }        
    
    public Edge(Vertex<T,N>destination,N w,Edge<T,N>next){
        toVertex = destination;
        this.weight = w;
        nextEdge = next;
    }
}

class Graph2<T extends Comparable<T>,N extends Comparable<N>>{
    Vertex<T,N>head;
    int size;
    
    public Graph2(){
        this.head = null;
        this.size = 0;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean hasVertex(T input){
        if(head==null)
            return false;
        Vertex<T,N>tempt = head;
        while (tempt!=null) {
            if(tempt.vertexInfo.compareTo(input)==0)
                return true;
            tempt = tempt.nextVertex;
        }
        return false;
    }
    
//    public int getIndeg(T v){
//        if(!hasVertex(v))
//            return -1;
//        Vertex<T,N>tempt = head;
//        while (tempt!=null) {
//            if(tempt.vertexInfo.compareTo(v)==0){
//                return tempt.indeg;
//            }
//            tempt = tempt.nextVertex;
//        }
//        return -1;
//    }
//    
//    public int getOutdeg(T v){
//        if(hasVertex(v)){
//            Vertex<T,N>tempt = head;
//            while (tempt!=null) {
//                if(tempt.vertexInfo.compareTo(v)==0){
//                    return tempt.outdeg;
//                }
//                tempt = tempt.nextVertex;
//            }
//        }
//        return -1;
//    }
    
    public int getNumEdge(T v){
        if(hasVertex(v)){
            Vertex<T,N>tempt = head;
            while (tempt!=null) {
                if(tempt.vertexInfo.compareTo(v)==0)
                    return tempt.numEdge;
                tempt = tempt.nextVertex;
            }
        }
        return -1;
    }
    
    public boolean addVertex(T v){
        if(!hasVertex(v)){
            Vertex<T,N>tempt = head;
            Vertex<T,N>newVertex = new Vertex(v,null);
            if(tempt==null){
               head = newVertex;
            }
            else{
                Vertex<T,N>prev = head;
                while (tempt!=null) {
                    prev = tempt;
                    tempt = tempt.nextVertex;
                }
                prev.nextVertex = newVertex;
                this.size++;
                return true;
            }
        }
        return false;
    }
    
    public boolean hasEdge(T source,T destination){
        if(head==null)
            return false;
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        Vertex<T,N>sourceVertex = head;
        while (sourceVertex!=null) {
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
    
    public boolean addEdge(T source,N w,T destination){
        if(head==null)
            return false;
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        Vertex<T,N>sourceVertex = head;
        while (sourceVertex!=null) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
               Vertex<T,N>destinationVertex = head;
                while(destinationVertex!=null) {
                    if(destinationVertex.vertexInfo.compareTo(destination)==0){
                        //Connect from sourceVertex to destinationVertex
                        Edge<T,N>currentEdge = sourceVertex.firstEdge;
                        Edge<T,N>newEdge = new Edge<>(destinationVertex,w,currentEdge);
                        sourceVertex.firstEdge = newEdge;
                        //sourceVertex.outdeg++;
                        //destinationVertex.indeg++;
                        
                        //Connect from destinationVertex to sourceVertex
                        Edge<T,N>currentEdge2 = destinationVertex.firstEdge;
                        Edge<T,N>newEdge2 = new Edge(sourceVertex,w,currentEdge2);
                        destinationVertex.firstEdge = newEdge2;
                        
                        sourceVertex.numEdge++;
                        destinationVertex.numEdge++;
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
        Vertex<T,N>sourceTempt = head;
        while (sourceTempt!=null) {
            if(sourceTempt.vertexInfo.compareTo(source)==0){
               Edge<T,N>currentEdge = sourceTempt.firstEdge;
                while (currentEdge!=null) {
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0){
                        return currentEdge.weight;
                    }
                    currentEdge = currentEdge.nextEdge;
                }
                
            }
            sourceTempt = sourceTempt.nextVertex;
        }
        return null;
    }
    
    public void printEdge(){
        Vertex<T,N>tempt = head;
        while (tempt!=null) {
            System.out.print("#" + tempt.vertexInfo + " : ");
            Edge<T,N>currentEdge = tempt.firstEdge;
            while (currentEdge!=null) {
                System.out.print("[" + tempt.vertexInfo + " : " + currentEdge.toVertex.vertexInfo + ", w - " + currentEdge.weight +"], ");
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            tempt = tempt.nextVertex;
        }
    }
    
    //L9Q1
    public boolean addUndirectedEdge(T source,N w,T destination){
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        
        for (Vertex<T,N>sourceVertex = head;sourceVertex!=null; sourceVertex = sourceVertex.nextVertex) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                for (Vertex<T,N>destinationVertex = head;destinationVertex!=null;destinationVertex = destinationVertex.nextVertex){
                    if(destinationVertex.vertexInfo.compareTo(destination)==0){
                        sourceVertex.firstEdge = new Edge(destinationVertex,w,sourceVertex.firstEdge);
                        destinationVertex.firstEdge = new Edge(sourceVertex,w,destinationVertex.firstEdge);
                        sourceVertex.numEdge++;
                        destinationVertex.numEdge++;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    //L9Q2
    public boolean removeEdge(T source,T destination){
        if(head==null)
            return false;
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        Vertex<T,N>sourceVertex = head;
        while (sourceVertex!=null) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                 Edge<T,N>currentEdge = sourceVertex.firstEdge;
                 if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0){
                     sourceVertex.firstEdge = sourceVertex.firstEdge.nextEdge;
                     return true;
                 }else{
                     while (currentEdge!=null) {
                         if(currentEdge.nextEdge.toVertex.vertexInfo.compareTo(destination)==0){
                             currentEdge.nextEdge = currentEdge.nextEdge.nextEdge;
                             return true;
                         }
                         currentEdge = currentEdge.nextEdge;
                     }
                 }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    public boolean removeEdges(T source,T destination){
        //if(!hasEdge(source,destination)) return false;
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        for (Vertex<T,N>sourceVertex = head;sourceVertex!=null;sourceVertex = sourceVertex.nextVertex) {
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                 if(sourceVertex.firstEdge.toVertex.vertexInfo.compareTo(destination)==0){
                     sourceVertex.firstEdge = sourceVertex.firstEdge.nextEdge;
                     return true;
                 }
                 else{
                     for (Edge<T,N>currentEdge = sourceVertex.firstEdge;currentEdge!=null; currentEdge = currentEdge.nextEdge) {
                         if(currentEdge.nextEdge.toVertex.vertexInfo.compareTo(destination)==0){
                             currentEdge.nextEdge = currentEdge.nextEdge.nextEdge;
                             return true;
                         }
                     }
                 }
            }
        }
        return false;
    }
}

public class L9Q1 {
    public static void main(String[] args) {
        Graph2<String,Integer>g = new Graph2<>();
        g.addVertex("Penang");
        g.addVertex("Kuala Lumpur");
        g.addUndirectedEdge("Penang",360,"Kuala Lumpur");
        g.removeEdge("Penang","Kuala Lumpur");
        g.removeEdge("Kuala Lumpur","Penang");
        g.printEdge();
    }
}

/*
  public boolean addUndirectedEdge(T v1,T v2,N w){
     boolean a,b;
     a = addEdge(v1,v2,w);
     b = addEdge(v1,v2,w);
     return(a&&b); 
  }
*/