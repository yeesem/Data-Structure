/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7;

public class Customer implements Comparable<Customer>{
    private Integer id;
    private String name;

    public Customer(Integer id,String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int compareTo(Customer o) {
        return this.getId().compareTo(o.getId());
    }
    
    @Override
    public String toString(){
        return "Customer [id=" + this.getId() + ", " + "Name : " + this.getName() + "]";
    }
}
