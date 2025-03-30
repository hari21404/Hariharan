import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, map } from 'rxjs';
import { Movie } from './movie.model';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private apiUrl = 'http://localhost:4500/movies';

  constructor(private http: HttpClient) { }

  getMovies(): Observable<Movie[]> {
    return this.http.get<Movie[]>(this.apiUrl);
  }

  getMovie(id: number): Observable<Movie> {
    return this.http.get<Movie>(`${this.apiUrl}/${id}`);
  }

  addMovie(movie: Movie): Observable<Movie> {
    return this.http.post<Movie>(this.apiUrl, movie);
  }

  searchMovies(term: string): Observable<Movie[]> {
    // Get all movies and filter them on the client side
    return this.http.get<Movie[]>(this.apiUrl).pipe(
      map(movies => {
        const searchTerm = term.toLowerCase();
        return movies.filter(movie => 
          movie.title.toLowerCase().includes(searchTerm)
        );
      })
    );
  }
}