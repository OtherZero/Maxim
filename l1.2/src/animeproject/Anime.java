package animeproject;

import java.util.List;

/**
 * Класс для представления аниме.
 */
public class Anime {
    private String title;
    private List<String> genres;  // Список жанров аниме
    private double rating;        // Рейтинг аниме
    private int episodesCount;    // Количество серий
    private String releaseDate;   // Дата выхода

    public Anime(String title, List<String> genres, double rating, int episodesCount, String releaseDate) {
        this.title = title;
        this.genres = genres;
        this.rating = rating;
        this.episodesCount = episodesCount;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getGenres() {
        return genres;
    }

    public double getRating() {
        return rating;
    }

    public int getEpisodesCount() {
        return episodesCount;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Проверка, что рейтинг больше заданного значения.
     * @param threshold - пороговое значение рейтинга
     * @return true, если рейтинг больше threshold
     */
    public boolean isRatingGreaterThan(double threshold) {
        return this.rating > threshold;
    }

    /**
     * Проверка, что аниме вышло недавно.
     * @param years - количество лет для проверки
     * @return true, если аниме вышло недавно
     */
    public boolean isReleasedRecently(int years) {
        int currentYear = java.time.LocalDate.now().getYear();
        int releaseYear = Integer.parseInt(releaseDate.split("-")[0]);
        return (currentYear - releaseYear) <= years;
    }

    /**
     * Получение всех жанров аниме.
     * @return строковое представление жанров
     */
    public String getGenresList() {
        return String.join(", ", genres);
    }
}
