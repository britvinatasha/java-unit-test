@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Метод checkIsAdult должен возвращать true, если возраст 18 лет или больше.", true, isAdult); 
}
