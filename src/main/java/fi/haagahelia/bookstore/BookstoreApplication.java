package fi.haagahelia.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.bookstore.domain.Book;
import fi.haagahelia.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			// Tallennetaan muutama kirja
			repository.save(new Book("Sinuhe egyptiläinen", "Mika Waltari", 1945, "978-951-0-12345-6", 25.95));
			repository.save(new Book("Tuntematon sotilas", "Väinö Linna", 1954, "978-951-0-23456-7", 22.50));
			repository.save(new Book("Seitsemän veljestä", "Aleksis Kivi", 1870, "978-951-0-34567-8", 18.99));
			repository.save(new Book("Käärmekirja", "Leena Krohn", 1998, "978-951-0-45678-9", 20.00));
			repository.save(new Book("Harry Potter", "J.K. Rowling", 1997, "978-0-7475-3269-9", 29.99));

			// Tulostetaan kaikki kirjat
			System.out.println("Kaikki kirjat:");
			for (Book book : repository.findAll()) {
				System.out.println(book.toString());
			}
		};
	}

}
