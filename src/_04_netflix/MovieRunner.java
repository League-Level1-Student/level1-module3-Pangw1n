package _04_netflix;

public class MovieRunner {
	public static void main(String[] args) {
		MovieRunner runner = new MovieRunner();
		runner.Start();
	}
	
	Movie movie1;
	Movie movie2;
	Movie movie3;
	Movie movie4;
	Movie movie5;
	
	NetflixQueue queue;
	
	public void Start()
	{
		movie1 = new Movie("Movie1", 5);
		movie2 = new Movie("Movie2", 3);
		movie3 = new Movie("Movie3", 1);
		movie4 = new Movie("Movie4", 4);
		movie5 = new Movie("Movie5", 4);
		
		System.out.println(movie1.getTicketPrice());
		System.out.println(movie3.getTicketPrice());
		
		queue = new NetflixQueue();
		
		queue.addMovie(movie1);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		
		queue.printMovies();

		queue.sortMoviesByRating();
		System.out.println("The best movie is " + queue.getBestMovie());
		System.out.println("The second best movie is " + queue.movies.get(1));
		System.out.println("The worst movie is " + queue.movies.get(queue.movies.size() - 1));
		queue.printMovies();
	}
}
