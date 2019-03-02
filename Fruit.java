public enum Fruit {
    Orange("Arita",5),
    Apple("Fuji",6),
    Melon("Yubari",3);
    
    private String brandName;
    private int count;
    
    Fruit(String brandName, int count) {
        this.brandName = brandName;
        this.count = count;
    }
    
    public String getFruitName() {
        return this.brandName;
    }

    public int getCount() {
        return this.count;
    }
}
