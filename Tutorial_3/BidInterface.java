/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_3;

public interface BidInterface {
    /**
     * Returns the name of the company making this bid.
     *
     * @return the name of the company making this bid.
     */
    public String getCompanyName();
    
    /**
     * Returns the description of the air conditioner that this bid is for.
     *
     * @return the description of the air conditioner that this bid is for.
     */
    public String getDescription();
    
    /**
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     *
     * @return the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     */
    public double getCapasity();
    
    /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     *
     * @return the seasonal efficiency of this bid's AC (SEER).
     */
    public double getSEER();
    
    /**
     * Returns the cost of this bid's AC.
     *
     * @return the cost of this bid's AC.
     */
    public double getCostBidAC();
    
    /**
     * Returns the cost of installing this bid's AC.
     *
     * @return the cost of installing this bid's AC.
     */
    public double getInstallCostBidAC();
    
    /**
     * Returns the yearly cost of operating this bid's AC.
     *
     * @return the yearly cost of operating this bid's AC.
     */
    public double getOperatingCost();
}
