
Тесты из предыдущего задания можно объединить в один параметризованный тест. Так код будет поддерживаемым и с ним будет удобнее работать.
Допиши параметризованный тест checkIsAdultWhenAgeThenResult, который проверит возраст из каждого класса эквивалентности. Учти, что код приложения пишут люди из разных стран, и в некоторых совершеннолетие наступает в 21 год.
В тест будет передаваться два аргумента: возраст и ожидаемый результат проверки. Реализуй это требование с помощью двумерного массива аргументов.


@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
      this.age = age;
      this.result = result;
  }


  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
        {17, false},
        {18, true},
 //       {18, false},
//        {19, true},
 //       {19, false},
//        {20, false}, 
        {20, true},
        {21, true}
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Несовершеннолетний попался", result, isAdult);
	}
}