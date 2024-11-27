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
        {18, true},
        {15, false},
        {20, true},
        {21, true}
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Ошибка: неверный результат для возраста ", result, isAdult);
	}
}
