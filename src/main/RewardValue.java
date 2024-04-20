public class RewardValue {
    private double cashValue; // This stores the internal cash value representation

    /**
     * Constructor for cash value.
     * @param cashValue The cash value
     */
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    /**
     * Constructor for miles value.
     * @param milesValue The miles value
     */
    public RewardValue(int milesValue) {
        this.cashValue = milesToCash(milesValue);
    }

    /**
     * Converts miles to cash based on the conversion rate.
     * @param miles The miles to convert
     * @return The equivalent cash value
     */
    private double milesToCash(int miles) {
        return miles * 0.0035;
    }

    /**
     * Converts cash to miles based on the conversion rate.
     * @param cash The cash to convert
     * @return The equivalent miles value
     */
    private int cashToMiles(double cash) {
        return (int) (cash / 0.0035);
    }

    /**
     * Returns the cash value of the reward.
     * @return The cash value
     */
    public double getCashValue() {
        return cashValue;
    }

    /**
     * Returns the miles value of the reward.
     * @return The miles value
     */
    public int getMilesValue() {
        return cashToMiles(cashValue);
    }
}
