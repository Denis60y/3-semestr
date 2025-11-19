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

    public Item getItem(int number){
        return items[number];
    }

    public void addItem(Item item) {
        if (cursor < maxSize) {
            items[cursor] = item;
            cursor++;
        } else {
            System.out.println("Инвентарь полон!");
        }
    }

    public void deleteItemByIndex(int number){
        if (0 < number && number < 10){
            items[number] = null;
            for (int i = number; i+1 < maxSize; i++){
                items[i] = items[i+1];
            }
        }
        else{
            System.out.println("Нет такого предмета");
        }
    }

    public void deleteItem(Item item){
        for (int i = 0; i < maxSize; i++){
            if (item == items[i]){
                items[i] = null;
                for (int j = i; j+1 < maxSize; j++){
                    items[j] = items[j+1];
                }
                break;
            }
        }
    }

    public void getInfo(){
        for (int i = 0; i < maxSize; i++){
            if (items[i] != null){
                items[i].getInfo();
                System.out.println("\n");
            }
            else{
                continue;
            }
        }
    }
}
