public class Book {
  
  private String name;
  private Integer age;

  public Book(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  @Override
  public String toString() {
    return getName() + " (recommended for " + getAge() + " year-olds or older)";
  }
}
