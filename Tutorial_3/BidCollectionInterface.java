/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_3;


public interface BidCollectionInterface {
    
    public void addBid(BidInterface newBid);
    
    /**
     * Returns the bid in this collection with the best yearly cost.
     *
     * @return the bid in this collection with the best yearly cost.
     */
    public BidInterface getBestYearlyCostBid();
    
    /**
     * Returns the bid in this collection with the best initial cost.
     *
     * @return the bid in this collection with the best initial cost.
     */
    public BidInterface getBestInitialCost();
    
    /**
     * Clears all of the bids from this collection.
     */
    public void clear();
    
    /**
     * Gets the number of items in this collection. 
     *
     * @return the number of items in this collection. 
     */
    public int getNumBid();
    
    /**
     * Sees whether this collection is empty
     *
     * @return sees whether this collection is empty.
     */
    public boolean isEmpty();
}
