package animeproject;

import java.util.List;  // Импортируем List
import java.util.ArrayList;  // Импортируем ArrayList для работы с коллекциями

public class OVA extends Anime {

    public OVA(String title, List<String> genres, double rating, int episodesCount, String releaseDate) {
        super(title, genres, rating, episodesCount, releaseDate);
    }
}
