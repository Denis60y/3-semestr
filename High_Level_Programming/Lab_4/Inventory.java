package High_Level_Programming.Lab_4;

class Inventory {
    private Item[] items;
    private final int maxSize = 10;
    private int cursor = 0;

    public Inventory(){
        this.items = new Item[this.maxSize];
    } 

    public void setItem(Item item, int number){
        this.items[number] = item;
    }

    public Item[] getItems(){
        return items;
    }

    public void addItem(Item item) {
        if (cursor < maxSize) {
            this.items[cursor] = item;
            cursor++;
        } else {
            System.out.println("Инвентарь полон!");
        }
    }
    
    public void deleteItem(int number){
        if (0 < number && number < 10){
            this.items[number] = null;
        }
        else{
            System.out.println("Нет такого предмета");
        }
    }

    public void getInfo(){
        for (int i = 0; i < maxSize; i++){
            if (items[i] != null){
                items[i].getInfo();
            }
            else{
                continue;
            }
        }
    }
}
