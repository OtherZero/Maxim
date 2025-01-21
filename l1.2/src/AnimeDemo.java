import java.util.Arrays;
import java.util.List;
import animeproject.Anime;
import animeproject.ONA;
import animeproject.OVA;
import animeproject.Series;

/**
 * Главный класс для демонстрации работы с аниме.
 */
public class AnimeDemo {
    public static void main(String[] args) {
        // Создание аниме
        List<Anime> animeList = Arrays.asList(
                new ONA("Attack on Titan", Arrays.asList("Action", "Drama", "Fantasy"), 8.5, 25, "2013-04-07"),
                new OVA("Naruto Shippuden", Arrays.asList("Action", "Adventure", "Ninja"), 7.8, 3, "2007-02-15"),
                new Series("My Hero Academia", Arrays.asList("Action", "Superhero"), 8.2, 88, "2016-04-03"),
                new ONA("Beastars", Arrays.asList("Drama", "Psychological", "Shounen"), 7.6, 12, "2019-10-08"),
                new OVA("One Piece", Arrays.asList("Action", "Adventure", "Comedy"), 8.7, 4, "2001-08-21"),
                new Series("Demon Slayer", Arrays.asList("Action", "Adventure", "Supernatural"), 8.7, 26, "2019-04-06"),
                new ONA("Great Pretender", Arrays.asList("Comedy", "Crime", "Drama"), 8.0, 14, "2020-06-02"),
                new OVA("Fate/Stay Night", Arrays.asList("Action", "Fantasy", "Supernatural"), 7.9, 6, "2004-01-06"),
                new Series("Fullmetal Alchemist", Arrays.asList("Action", "Adventure", "Fantasy"), 9.1, 51, "2003-10-04"),
                new ONA("Castlevania", Arrays.asList("Action", "Adventure", "Fantasy"), 8.0, 10, "2017-07-07")
        );

        // 1.4 Вывод аниме с рейтингом больше 7
        System.out.println("Anime with rating greater than 7:");
        for (Anime anime : animeList) {
            if (anime.isRatingGreaterThan(7)) {
                System.out.println(anime.getTitle() + " - Rating: " + anime.getRating());
            }
        }

        // 1.5 Вывод аниме, которые вышли недавно (например, за последние 5 лет)
        System.out.println("\nAnime released recently (last 5 years):");
        for (Anime anime : animeList) {
            if (anime.isReleasedRecently(5)) {
                System.out.println(anime.getTitle() + " - Released on: " + anime.getReleaseDate());
            }
        }

        // 1.6 Перечисление жанров, которые встречаются чаще всего
        System.out.println("\nMost frequent genres:");
        animeList.stream()
                .flatMap(anime -> anime.getGenres().stream())
                .distinct()
                .forEach(System.out::println);
    }
}
