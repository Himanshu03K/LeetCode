class Solution {
    public int shipWithinDays(int[] weights, int D) {
      
        int heaviestItem = weights[0];
        int weightSum = 0;
        for (int x : weights) {
            heaviestItem = Math.max(heaviestItem, x);
            weightSum += x;
        }
        int avgWeightOnShip = (int) weightSum / D;
        int minWeight = Math.max(heaviestItem, avgWeightOnShip);

        for (int i = minWeight; i <= weights.length * minWeight; i++) {
            int[] ship = new int[D];
            int index = 0;
            for (int j = 0; j < ship.length; j++) {
                while (index < weights.length && ship[j] + weights[index] < i) {
                    ship[j] += weights[index];
                    index++;
                }
            }
            if (index == weights.length)
                return i -1;
        }
        return 0;
    }
}