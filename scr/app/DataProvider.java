public class DataProvider {

    // Повертає масив назв товарів
    public String[] getProductNames() {
        return new String[]{"apple", "grape", "mango", "apple", "orange"};
    }

    // Повертає масив сум продажів
    public Double[] getSalesAmounts() {
        return new Double[]{1520.89, 2058.35, 1807.29, 899.99, 1924.25};
    }
}
