
public class Main {
	public static void main(String[] args) {
		// Объявляем переменные для входных данных
		double ticketPrice = 13676.0; // стоимость билета в рублях
		double rublesPerMile = 20.0; // количество рублей для одной бонусной мили
		// Рассчитываем количество бонусных миль
		int bonusMiles = (int)(ticketPrice / rublesPerMile);
		// Выводим результат на экран
		System.out.println("Количество бонусных миль: " + bonusMiles);
	}
}
