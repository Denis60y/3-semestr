package High_Level_Programming.Lab_4;

/*ЛАБОРАТОРНАЯ РАБОТА №4
 * 
 * 
 * 
 * Автор: @Pitt0n
 * Дата создания: 08.11.2025
 * Версия: 0.0.3
 */


public class Task1 {
    public static void main(String[] args) {
        Item item = new Item("Яблоко", "apple", 5);
        item.getInfo();
    }
}
 
class Item {
    private String name;        
    private String id;          
    private int maxStackSize;


    public Item(String name, String id, int maxStackSize){
        this.name = name;
        this.id = id;
        this.maxStackSize = maxStackSize;
    }

    public Item(String name, String id){
        this.name = name;
        this.id = id;
        this.maxStackSize = 64;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setId(String id){this.id = id;}
    public String getIf(){return id;}

    public void setMaxStackSize(int maxStackSize){this.maxStackSize = maxStackSize;}
    public int getMaxStackSize(){return maxStackSize;}

    public void getInfo(){
        System.out.printf("Название предмета: %s\nID предмета: %s\nМаксимальное количество в слоте: %d\n", name, id, maxStackSize);
    }
}
