package Task2.translationParts;

import Task2.translationParts.TranslationPart;

public class Advertising implements TranslationPart {

    private String productName;
    private int advertisingDuration;
    public static final int secondPrice = 5;

    public Advertising(String productName, int advertisingDuration) {
        this.productName = productName;
        this.advertisingDuration = advertisingDuration;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAdvertisingDuration() {
        return advertisingDuration;
    }

    public void setAdvertisingDuration(int advertisingDuration) {
        this.advertisingDuration = advertisingDuration;
    }

    @Override
    public String toString() {
        return "Advertising{" +
                "productName='" + productName + '\'' +
                ", advertisingDuration=" + advertisingDuration +
                '}';
    }
}
