package sec03;

public class scope7 {

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("차종: " + myCar.getModel());
        System.out.println("색상: " + myCar.getColor());
        System.out.println("연도: " + myCar.getYyyy());
    }
}

class Car {
    private String model;
    private String color;
    private int yyyy;

    // 생성자
    public Car() {
        this.model = "승용차";
        this.color = "검정"; // 예시로 검정색을 추가
        this.yyyy = 2023; // 예시로 연도를 추가
    }

    // getter 메서드
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYyyy() {
        return yyyy;
    }
}
