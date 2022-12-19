package HomeWork_01.Task_02;

public class Cabinet {

    // Параметры
    private String cloth;
    private String sizeCloth;
    private int sizeShoes;

    // Конструкторы
    public Cabinet(String cloth, String sizeCloth) {
        this.cloth = cloth;
        this.sizeCloth = sizeCloth;
    }

    public Cabinet(String cloth, int sizeShoes) {
        this.cloth = cloth;
        this.sizeShoes = sizeShoes;
    }

    // Новый тустринг
    @Override
    public String toString() {
        if(sizeCloth == null) {
            return "В шкафу лежит: " + cloth + " Размер: " + sizeShoes;
        }
        return "В шкафу лежит: " + cloth + " Размер: " + sizeCloth;
    }

    // Гетеры сетеры
    public String getCloth() {
        return cloth;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public String getSizeCloth() {
        return sizeCloth;
    }

    public void setSizeCloth(String sizeCloth) {
        this.sizeCloth = sizeCloth;
    }

    public int getSizeShoes() {
        return sizeShoes;
    }

    public void setSizeShoes(int sizeShoes) {
        this.sizeShoes = sizeShoes;
    }
}
