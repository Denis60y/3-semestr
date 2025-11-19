package High_Level_Programming.Lab_4;

class Player {
    private int HP;
    private int satiety;
    private boolean buff;

    public Player(int HP, int satiety, boolean buff) {
        this.HP = HP;
        this.satiety = satiety;
        this.buff = buff;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setBuff(boolean buff) {
        this.buff = buff;
    }

    public boolean getBuff() {
        return buff;
    }

    public void getInfo() {
        System.out.printf("HP персонажа: %d\nСытость персонажа: %d\nНаличие эффекта: %b\n", HP, satiety, buff);
    }

    public void drinkMilk() {
        this.buff = false;
    }

    public void useFood(Food food) {
        if (food.getQuantity() > 0) {
            food.eaten();
            this.HP += food.getSaturationLevel();
            this.satiety += food.getFoodLevel();
        } else {
            System.out.println("Не хватает предмета");
        }
    }

    public void drop(Item item) {
        if (item.getQuantity() > 0) {
            item.abandoned();
        } else {
            System.out.println("Не хватает предмета");
        }
    }

    public void setBlock(Block block) {
        if (block.getQuantity() > 0) {
            block.use();
        } else {
            System.out.println("Не хватает предмета");
        }
    }

    public void hit(Tool tool) {
        if (tool.getStrength() > 0) {
            tool.hit();
        } else {
            System.out.println("Предмет сломан");
        }
    }
}
