public class Humen {
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0) throw new RuntimeException('Возраст не может быть отрицательным');
        this.age = age;
    }

    private Integer age;

    public void showAge() {
        System.out.println('Возраст животного');
    }
}
